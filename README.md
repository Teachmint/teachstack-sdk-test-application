# Teachstack Android SDK Demo Application

## Integrate Live Class Infrastructure in Minutes

Teachmint’s signature product - TeachStack empowers live classroom learning by adding real-time audio/visual communications to your app or website, making your classroom learning into a seamless experience

This repo will help setting up and creating a simple android application that uses teachstack apis

## Requirements

- [Android Studio](https://developer.android.com/studio)
- TeachStack url generated using the /add/user API [Click here for more](https://docs.teachmint.com/api)

## Installation

- Navigate to the directory where you would like to setup the repository and clone using:
```http
git clone https://github.com/Teachmint/teachstack-sdk-test-application.git
```
- Run android studio and open this repository
- In Project level build.gradle file -> in the repositories section under the “buildscript” configuration section, add
```kotlin
maven {
    url = "https://plugins.gradle.org/m2/"
}
```
- In Project level build.gradle file -> In the dependencies section, add
```kotlin
 classpath "gradle.plugin.com.google.cloud.artifactregistry:artifactregistry-gradle-plugin:2.1.4"
```
- In Project level build.gradle file -> in the repositories section of the “allprojects” configuration section, add
```kotlin
maven {
  url "https://asia-south1-maven.pkg.dev/excellent-math-274709/android-sdk-vc"
}
```
- In Module level build.gradle file -> Add the following line to integrate the TeachStack SDK
```kotlin
implementation group: 'com.teachmint', name: 'android-sdk', version: '0.2.6'
```
- Create an instance of the TMVaaSBuilder class and invoke the function initializeVaas(activity, clientUrl) as follow
```kotlin
TMVaaSBuilder()
   .initializeVaas(
       activity = < Reference to the activity launching the SDK >,
       clientUrl = "{hostname}/videoroom/{classId}/{userId}/{authKey}"
   )
```
- Run app (Either use AVM or connect an android device)

## Documentation

To know more about our process and activities, please go through our documentation
**[CLICK HERE TO SEE ANDROID SDK DOCUMENTATION](https://docs.teachmint.com/android_sdk)**

## License
MIT
