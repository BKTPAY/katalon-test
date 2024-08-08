#!/bin/bash

# Start the emulator in headless mode
$ANDROID_SDK_ROOT/emulator/emulator -avd test_avd  -use-system-libs -no-snapshot-load -no-snapshot-save -no-skin  -no-window -no-audio -no-boot-anim -gpu swiftshader_indirect &

# Wait for the emulator to start
#adb wait-for-device
#adb shell input keyevent 82

# Optionally, run your tests here
# ./gradlew connectedAndroidTest

# Keep the container running
tail -f /dev/null
