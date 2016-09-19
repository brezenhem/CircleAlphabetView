CircleAlphabetView
===========
Android Studio version: 2.1.3
Gradle version: 2.1.3

The Latest Version
------------------
VersionCode 1
VersionName "1.1"

Project description
-------------------
This library implements the curved clickable lists.
 
 ![](http://file-st09.karelia.ru/resizer/gallery/wdnnt4/49a85d491062a6ce4767718c4943a6aa/9d6019151551621aadbf5325a74100ad/ezgif.com-video-to-gif.gif)
 
Install
-------------------

Add it in your root build.gradle at the end of repositories:
```
allprojects {
        repositories {
            ...
            maven { url "https://jitpack.io" }
        }
    }
 ```
    
Step 2. Add the dependency
 ```
    dependencies {
            compile 'com.github.brezenhem:CircleAlphabetView:1'
    } 
 ```

How to use
-------------------

To use the widget, simply add this code to your xml layout:

 ```
<lindenvalley.de.customprogress.AnimationProgressBar
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/progress" />
 ```
 
To update the indicator, simply call the following method:
```
AnimationProgressBar mAnimationProgressBar = (AnimationProgressBar) findViewById(R.id.progress);
mAnimationProgressBar.updateProgressIndicator();
```
