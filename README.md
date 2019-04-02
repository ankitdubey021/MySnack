

# MySnack &#x1F534;
Very user friendly library for Snackbar. you can easily customize this according to you. MySnack provides adding textcolor, background color,fontsize,time duration, listener and many more thing by just adding a single line.


<img src="https://github.com/ankitdubey021/MySnack/blob/master/app/src/main/res/mipmap-hdpi/screen.png" width="300" height="500"/>

<h2>Use this library:</h2>

Step1) Add library to your app level build file

```diff
+ compile 'com.github.ankitdubey021:MySnack:2.2'
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
 new MySnack.SnackBuilder(this)
                .setText("Are you sure?")  
                .setTextColor("#ffffff")   //optional
                .setTextSize(20)           //optional
                .setBgColor("#2196F3")      //optional
		.setDurationInSeconds(10)  //will display for 10 seconds
                .setActionBtnColor("#f44336") //optional
		
		.setIcon(Icon.WARNING)
                //or  .setIcon(R.drawable.ic_info_black_24dp)
		
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
	
	this library provides 3 predefined icons like Icon.SUCCESS, Icon.WARNING and Icon.ERROR
 	if you want any other icon, you can set as follows
+		.setIcon(R.drawable.ic_info_black_24dp)
```

&#x1F53C; In SnackBuilder i've passed one view. this view is the id of activity layout.

```diff
    <?xml version="1.0" encoding="utf-8"?>
    <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
+ android:id="@+id/activity_main"
```


MIT License

Copyright (c) 2017 Ankit Dubey

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.


