## SamplePicker
Sample project using Picker library for attach image from Gallery or Camera.

# Picker
## Getting started
### Support API Level
![minsdk](https://img.shields.io/badge/Min%20SDK-API%2024-%233DDC84?logo=android) ![targetsdk](https://img.shields.io/badge/Max%20Support-API%2031-%233DDC84?logo=android)

## Setup
#### 1. Add kredibel repository.
```groovy
maven{url 'https://repo.repsy.io/mvn/kredibel/sdk'}
```

#### 2. Add this dependency to gradle script on app module.
```groovy
dependencies {
    implementation 'io.kredibel:picker:0.0.1-beta' // Please check latest version
}
```
## Using Picker
Initialize Picker object on your Activity or Fragment
```kotlin
Picker picker = new Picker(this);
```

## Pick image from Gallery
```kotlin
picker.pickGallery(new PickerListener() {
    @Override
    public void onPicked(Uri uri, File file, Bitmap bitmap) {
        //do something
    }
});
```
## Pick from Camera
```
picker.pickCamera(new PickerListener() {
    @Override
    public void onPicked(Uri uri, File file, Bitmap bitmap) {
        //do something
    }
});
```
