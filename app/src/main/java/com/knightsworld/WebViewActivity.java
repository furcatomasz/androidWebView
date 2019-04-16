package com.knightsworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class WebViewActivity extends Activity {


    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        mWebView = findViewById(R.id.activity_main_webview);
        mWebView.loadUrl("https://www.knightsworld.org");
        mWebView.setWebViewClient(new AppWebViewClient());
        mWebView.setWebChromeClient(new WebChromeClient());
        mWebView.getSettings().setLoadWithOverviewMode(true);
        mWebView.getSettings().setJavaScriptEnabled(true);
//        mWebView.getSettings().setUseWideViewPort(true);
//        mWebView.getSettings().setDomStorageEnabled(true);
//        mWebView.getSettings().setUserAgentString(USER_AGENT);
//        mWebView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
    }

    public void onBackPressed() {
        if (mWebView.canGoBack()) {
            mWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }

}