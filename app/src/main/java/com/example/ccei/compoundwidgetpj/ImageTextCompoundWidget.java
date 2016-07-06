package com.example.ccei.compoundwidgetpj;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by ccei on 2016-07-06.
 */
public class ImageTextCompoundWidget extends LinearLayout {

    Context context;
    ImageView imageIcon;
    TextView textTitle;
    ImageTextData data;

    public ImageTextCompoundWidget(Context context){
        super(context);
        this.context = context;
        init(null);
    }
    public ImageTextCompoundWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init(attrs);
    }
    public ImageTextCompoundWidget(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }
    private void init(AttributeSet attrs){
        this.setOrientation(HORIZONTAL);
        View root = inflate(context, R.layout.image_view_compound_widget, this);
        imageIcon = (ImageView)findViewById(R.id.image_icon);
        textTitle = (TextView)findViewById(R.id.text_title);
    }

    public void setImageText(ImageTextData data){
        this.data = data;
        imageIcon.setImageResource(data.iconID);
        textTitle.setText(data.title);
    }

    public void setTextTitle(String title) {
        if (data == null){
            data = new ImageTextData();
        }
        data.title = title;
    }
}