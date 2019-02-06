package com.example.slavsgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import org.xwalk.core.XWalkView;

public class WebView extends AppCompatActivity {
    private XWalkView mXWalkView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        mXWalkView = (XWalkView) findViewById(R.id.main_web_view);
        mXWalkView.load("http://crosswalk-project.org/", null);
    }


}