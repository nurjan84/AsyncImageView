
Based on Picasso

```
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}

dependencies {
    compile 'com.github.nurjan84:AsyncImageView:1.0.2'
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
