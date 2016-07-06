package com.example.ccei.compoundwidgetpj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageTextCompoundWidget compWidget;
    boolean flag = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final ImageTextCompoundWidget compWidget;
                //, compWidget2;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compWidget = (ImageTextCompoundWidget)findViewById(R.id.compound_widget);

        compWidget.setOnImageTextClickListener(new ImageTextCompoundWidget.OnCompoundTARAListener(){

            @Override
            public void onImageTextClick(ImageTextCompoundWidget compoupnd, ImageTextData data) {
                if(data != null){
                    Toast.makeText(getApplicationContext(), "Change name & picture", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button changeBtn = (Button)findViewById(R.id.change_btn);
        changeBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(flag) {
                    compWidget.setImageText(new ImageTextData("Jiyeon", R.drawable.t_ara_icon_jiyeon));
                }

                else{
                    compWidget.setImageText(new ImageTextData("Boram", R.drawable.t_ara_icon_boram));
                }

                flag = !flag;
            }
        });
/*
        compWidget = (ImageTextCompoundWidget)findViewById(R.id.compound_widget);
        //compWidget2 = (ImageTextCompoundWidget)findViewById(R.id.compound_widget2);

        ImageTextData data1 = new ImageTextData("지연", R.drawable.t_ara_icon_jiyeon);
        //ImageTextData data2 = new ImageTextData("보람", R.drawable.t_ara_icon_boram);

        compWidget.setImageText(data1);
        //compWidget2.setImageText(data2);
*/
    }
}
