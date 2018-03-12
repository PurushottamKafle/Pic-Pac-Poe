package com.android.picpacpoe;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
// Develop By Purushottam Kafle
import static com.android.picpacpoe.R.layout.activity_suprise;

public class SupriseActivity extends AppCompatActivity {
    ProgressBar progress;
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_suprise);

        web = (WebView) findViewById(R.id.web1);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("https://www.youtube.com");
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().getAllowFileAccess();
        web.getSettings().getCacheMode();
        web.getSettings().supportZoom();
        progress = (ProgressBar) findViewById(R.id.progress1);


    }
    public class myWebClient extends WebViewClient
    {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            // TODO Auto-generated method stub
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // TODO Auto-generated method stub
            progress.setVisibility(View.VISIBLE);
            view.loadUrl(url);
            return true;

        }

        @Override
        public void onPageFinished(WebView view, String url) {
            // TODO Auto-generated method stub
            super.onPageFinished(view, url);

            progress.setVisibility(View.GONE);
        }
    }

    // To handle "Back" key press event for WebView to go back to previous screen.


}
