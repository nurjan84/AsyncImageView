
Based on Picasso and hdodenhof/CircleImageView
http://square.github.io/picasso/
https://github.com/hdodenhof/CircleImageView

```
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}

dependencies {
    compile 'com.github.nurjan84:AsyncImageView:1.0.5'
}
```
Usage:

```
  <kz.nurzhan.asyncimageview.AsyncImageView
        android:id="@+id/image"
        android:layout_width="200dp"
        android:layout_height="200dp"
        app:placeholderDrawable = "@drawable/placeholder"
        />
  <kz.nurzhan.asyncimageview.AsyncCircleImageView
        android:id="@+id/circleImage"
        android:layout_width="200dp"
        android:layout_height="200dp"
        app:civ_border_width="2dp"
        app:civ_border_color="#FF000000"
        app:placeholderDrawable = "@drawable/placeholder"
        />
        
        
AsynImageView asyncImageView = findViewById(...);
asyncImageView.load("wep url");
asyncImageView.load(Uri);
asyncImageView.load(File);
asyncImageView.load(resourceId);
```
and you can cancel loading
```
asyncImageView.cancelLoading();
```

![2017-12-04 17 36 07](https://user-images.githubusercontent.com/6967566/33550892-beccca78-d919-11e7-9ffe-3d7638b8ff16.png)

