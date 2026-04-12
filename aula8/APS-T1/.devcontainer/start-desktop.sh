#!/usr/bin/env bash
set -euo pipefail

export DISPLAY=:1

mkdir -p /tmp/.X11-unix

if ! pgrep -f "Xvfb :1" >/dev/null 2>&1; then
  nohup Xvfb :1 -screen 0 1280x800x24 -ac >/tmp/xvfb.log 2>&1 &
fi

if ! pgrep -f "fluxbox" >/dev/null 2>&1; then
  nohup fluxbox >/tmp/fluxbox.log 2>&1 &
fi

if ! pgrep -f "x11vnc .*5901" >/dev/null 2>&1; then
  nohup x11vnc -display :1 -forever -nopw -shared -rfbport 5901 >/tmp/x11vnc.log 2>&1 &
fi

if ! pgrep -f "websockify .*6080" >/dev/null 2>&1; then
  nohup websockify --web /usr/share/novnc/ 6080 localhost:5901 >/tmp/websockify.log 2>&1 &
fi