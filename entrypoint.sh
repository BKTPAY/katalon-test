#!/bin/bash


# Start the emulator in headless mode
$ANDROID_SDK_ROOT/emulator/emulator -avd test_avd  -use-system-libs -no-snapshot-load -no-snapshot-save -no-skin  -no-window -no-audio -no-boot-anim -no-boot-anim -gpu swiftshader_indirect > /tmp/emulator.log 2>&1 &
tail -f /tmp/emulator.log &

sleep 30
export DISPLAY=:99
xhost +local:root
export LIBGL_ALWAYS_INDIRECT=1
export QT_X11_NO_MITSHM=1
# Wait for the emulator to start
adb wait-for-device
boot_completed=false
while [ "$boot_completed" != "1" ]; do
    boot_completed=$(adb shell getprop sys.boot_completed | tr -d '\r')
    sleep 2
done
adb shell input keyevent 82
adb devices
adb logcat -d > /tmp/emulator_logcat.txt

# Optionally, run your tests here
# ./gradlew connectedAndroidTest
pwd
ls
sleep 30


katalonc.sh -projectPath=/test -noSplash -runMode=console  -retry=0 -testSuitePath="Test Suites/Test_Suite_Mobile" -browserType="Android" -deviceId="emulator-5554" -executionProfile="default" -apiKey="554d7f82-ac15-4b60-aab3-739c97658f70" --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true  -webui.autoUpdateDrivers=true -appiumDirectory="/usr/local/lib/node_modules/appium"

# Keep the container running
#tail -f /dev/null
