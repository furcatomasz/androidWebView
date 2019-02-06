package com.example.slavsgame;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import org.xwalk.core.XWalkView;

public class WebView extends Activity {
    private XWalkView mXWalkView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        mXWalkView = (XWalkView) findViewById(R.id.activity_main);
        mXWalkView.load("http://slavsgame.com", null);
    }


}