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
 
 ![](http://im.ezgif.com/tmp/ezgif-2973445153.gif)
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
    <lindenvalley.de.circlealphabetview.AlphabetView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/view"/>
 ```
 
For settings rotate and bend chars, use the following methods:
```
AlphabetView alphabetView alphabetView = (AlphabetView) findViewById(R.id.view);
alphabetView.setCharRotate(5f);
alphabetView.setCharBend(2f);
```
