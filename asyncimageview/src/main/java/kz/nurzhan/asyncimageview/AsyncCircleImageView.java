package kz.nurzhan.asyncimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;

import com.squareup.picasso.Picasso;

import java.io.File;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by user on 04.12.2017.
 */

public class AsyncCircleImageView extends CircleImageView {

    private Drawable placeholder;

    public AsyncCircleImageView(Context context) {
        super(context);
    }

    public AsyncCircleImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.asyncImageView,
                0, 0);
        try {
            this.placeholder = a.getDrawable(R.styleable.asyncImageView_placeholderDrawable);
            this.setImageDrawable(placeholder);
        } finally {
            a.recycle();
        }
    }

    public void setPlaceholder(Drawable resourceId){
        this.placeholder = resourceId;
    }
    public Drawable getPlaceholder(){
        return this.placeholder;
    }

    public void load (String path){
        if(path!=null && !path.equals("")){
            if(placeholder!=null){
                Picasso.with(getContext()).load(path).placeholder(placeholder).into(this);
            }else {
                Picasso.with(getContext()).load(path).into(this);
            }
        }
    }
    public void load (Uri uri){
        if(uri!=null){
            if(placeholder!=null){
                Picasso.with(getContext()).load(uri).placeholder(placeholder).into(this);
            }else {
                Picasso.with(getContext()).load(uri).into(this);
            }
        }
    }
    public void load (File file){
        if(file!=null){
            if(placeholder!=null){
                Picasso.with(getContext()).load(file).placeholder(placeholder).into(this);
            }else {
                Picasso.with(getContext()).load(file).into(this);
            }
        }
    }
    public void load (int resourceId){
        if(placeholder!=null){
            Picasso.with(getContext()).load(resourceId).placeholder(placeholder).into(this);
        }else {
            Picasso.with(getContext()).load(resourceId).into(this);
        }
    }

    public void cancelLoading(){
        Picasso.with(getContext()).cancelRequest(this);
    }
}
