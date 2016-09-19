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
 
 ![](http://im.ezgif.com/tmp/ezgif-3044549092.gif)

How to use
----------
```
To use the widget, simply add this code to your xml layout:

<lindenvalley.de.customprogress.AnimationProgressBar
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/progress" />

To update the indicator, simply call the following method:

AnimationProgressBar mAnimationProgressBar = (AnimationProgressBar) findViewById(R.id.progress);
mAnimationProgressBar.updateProgressIndicator();
```