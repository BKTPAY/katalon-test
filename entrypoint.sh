ho #!/bin/bash


# Start the emulator in headless mode
$ANDROID_SDK_ROOT/emulator/emulator -avd test_avd  -use-system-libs -no-snapshot-load -no-snapshot-save -no-skin  -no-window -no-audio -no-boot-anim -no-boot-anim  &

sleep 30
DISPLAY=:0.0
export DISPLAY
xhost +
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

# Optionally, run your tests here
# ./gradlew connectedAndroidTest
pwd
ls
sleep 30
echo $(adb shell getprop init.svc.bootanim)

katalonc.sh -projectPath=/test -noSplash -runMode=console  -retry=0 -testSuitePath="Test Suites/Test_Suite_Mobile" -browserType="Android" -deviceId="emulator-5554" -executionProfile="default" -apiKey="554d7f82-ac15-4b60-aab3-739c97658f70" --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true  -webui.autoUpdateDrivers=true -appiumDirectory="/usr/local/lib/node_modules/appium"

# Keep the container running
#tail -f /dev/null
