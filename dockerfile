# Use the specific Katalon Docker image as the base
FROM katalonstudio/katalon

# Install dependencies
RUN apt-get update -y && apt-get install -y \
    openjdk-11-jdk wget unzip curl

# Install Node.js and npm
RUN curl -sL https://deb.nodesource.com/setup_14.x | bash - \
    && apt-get install -y nodejs

# Install Appium
RUN npm install -g appium

# Install Android command line tools
RUN mkdir -p /opt/android-sdk/cmdline-tools
WORKDIR /opt/android-sdk/cmdline-tools
RUN wget https://dl.google.com/android/repository/commandlinetools-linux-9477386_latest.zip -O commandlinetools.zip \
    && unzip commandlinetools.zip \
    && mv cmdline-tools latest

# Set environment variables
ENV ANDROID_SDK_ROOT /opt/android-sdk
ENV PATH $PATH:/opt/android-sdk/cmdline-tools/latest/bin
ENV PATH $PATH:/opt/android-sdk/platform-tools
ENV PATH $PATH:/opt/android-sdk/emulator
ENV ANDROID_AVD_HOME /root/.android/avd

# Install Android SDK packages
RUN yes | sdkmanager --install "platform-tools" "platforms;android-25" "system-images;android-25;google_apis;armeabi-v7a" "emulator"
RUN yes | sdkmanager --licenses

# Create Android Virtual Device (AVD)
RUN mkdir -p /root/.android && touch /root/.android/emu-update-last-check.ini \
    && echo "no" | avdmanager create avd -n test_avd -k "system-images;android-25;google_apis;armeabi-v7a" --device "Nexus 4"

# Copy entrypoint script
COPY entrypoint.sh /entrypoint.sh
RUN chmod +x /entrypoint.sh

# Set entrypoint
ENTRYPOINT ["/entrypoint.sh"]
