

# LibraryDemo &#x1F534;
Very user friendly library for Snackbar. you can easily customize this according to you. MySnack provides adding textcolor, background color,fontsize,time duration, listener and many more thing by just adding a single line.


<img src="https://github.com/ankitdubey021/MySnack/blob/master/app/src/main/res/mipmap-hdpi/screenshot.png" width="300" height="500"/>

<h2>Use this library:</h2>

Step1) Add library to your app level build file

```diff
+ compile 'com.github.ankitdubey021:MySnack:2.0'
```

Step 2) In project level build file, add the jitpack repository

```diff
  allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
			maven { url"http://maven.google.com" }
		}
  }
```

Now sync the project.

Finally in your activity file use the library as follows:

```diff
 new MySnack.SnackBuilder(findViewById(R.id.activity_main))
                .setText("Are you sure?")  
                .setTextColor("#ffffff")   //optional
                .setTextSize(20)           //optional
                .setBgColor("#2196F3")      //optional
		.setDurationInSeconds(10)  //will display for 10 seconds
                .setActionBtnColor("#f44336") //optional
                .setActionListener("Ok", new View.OnClickListener() {  //optional
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(),"done",Toast.LENGTH_LONG).show();
                    }
                })
                .build();
```


```diff
- every setter method is optional, but build() must be called at last.
```

&#x1F53C; In SnackBuilder i've passed one view. this view is the id of activity layout.

```diff
    <?xml version="1.0" encoding="utf-8"?>
    <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
+ android:id="@+id/activity_main"
```


