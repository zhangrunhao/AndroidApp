package com.example.andoridapp;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebViewClient;

import com.example.andoridapp.R;

public class WebViewActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate (@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        initView();
    }
    private void initView () {
        webView = findViewById(R.id.webview);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setDefaultTextEncodingName("GBK");
        webSettings.setLoadsImagesAutomatically(true);

        // 不再打开本地浏览器
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false; // 返回false
            }
        });

        // 加载
//        webView.loadUrl("http://10.2.154.233:3000/");
//        webView.loadUrl("http://sugar.k.sohu.com/h5/1905_word/index.html");
        webView.loadUrl("http://10.2.154.233:6611/Personal-Notes/Hlio/test/memory.html");
    }

}