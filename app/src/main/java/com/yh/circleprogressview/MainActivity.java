package com.yh.circleprogressview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private boolean flag  = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CircleProgressView circleProgressView = (CircleProgressView) findViewById(R.id.circleProgressView);
        circleProgressView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!flag) {
                    circleProgressView.setProgress(99);
                    flag = true;
                }else{
                    circleProgressView.setProgress(0);
                    flag = false;
                }
            }
        });
    }
}
