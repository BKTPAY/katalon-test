#!/bin/bash
 apt-get install -y at-spi2-core
 apt-get install -y libxkbcommon-x11-0
 apt-get install -y xorg
 apt-get install -y xvfb

# Start the emulator in headless mode
$ANDROID_SDK_ROOT/emulator/emulator -avd test_avd  -use-system-libs -no-snapshot-load -no-snapshot-save -no-skin  -no-window -no-audio -no-boot-anim -gpu swiftshader_indirect &

# Wait for the emulator to start
adb wait-for-device
adb shell input keyevent 82

# Optionally, run your tests here
# ./gradlew connectedAndroidTest
pwd
ls

katalonc -projectPath=/test -noSplash -runMode=console  -retry=0 -testSuitePath="Test Suites/Test_Suite_Mobile" -browserType="Android" -deviceId="emulator-5554" -executionProfile="default" -apiKey="554d7f82-ac15-4b60-aab3-739c97658f70" --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true  -webui.autoUpdateDrivers=true

# Keep the container running
tail -f /dev/null
