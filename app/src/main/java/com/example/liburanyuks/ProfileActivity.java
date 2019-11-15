package com.example.liburanyuks;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    LinearLayout isiData;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        isiData = (LinearLayout) findViewById(R.id.lyDataPribadiContent);
        LinearLayout Data = (LinearLayout) findViewById(R.id.lyDataTitlePribadi);
        Data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isiData.getVisibility() == View.VISIBLE){
                    isiData.setVisibility(View.GONE);
                }else {
                    isiData.setVisibility(View.VISIBLE);
                }
            }
        });
    }

}
