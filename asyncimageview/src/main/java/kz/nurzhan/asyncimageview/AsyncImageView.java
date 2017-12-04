package kz.nurzhan.asyncimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.squareup.picasso.Picasso;

import java.io.File;

public class AsyncImageView extends AppCompatImageView {

    private Drawable placeholder;

    public AsyncImageView(Context context) {
        super(context);
    }

    public AsyncImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.asyncImageView,
                0, 0);
        try {
            this.placeholder = a.getDrawable(R.styleable.asyncImageView_placeholder);
            this.setImageDrawable(placeholder);
        } finally {
            a.recycle();
        }
    }

    public void load (String path){
        if(placeholder!=null){
            Picasso.with(getContext()).load(path).placeholder(placeholder).into(this);
        }else {
            Picasso.with(getContext()).load(path).into(this);
        }

    }
    public void load (Uri uri){
        if(placeholder!=null){
            Picasso.with(getContext()).load(uri).placeholder(placeholder).into(this);
        }else {
            Picasso.with(getContext()).load(uri).into(this);
        }

    }
    public void load (File file){
        if(placeholder!=null){
            Picasso.with(getContext()).load(file).placeholder(placeholder).into(this);
        }else {
            Picasso.with(getContext()).load(file).into(this);
        }

    }

    public void canceLoading(){
        Picasso.with(getContext()).cancelRequest(this);
    }

}
