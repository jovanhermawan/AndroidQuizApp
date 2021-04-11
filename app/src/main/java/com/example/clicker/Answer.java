package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.firestore.DocumentReference;

import java.util.HashMap;
import java.util.Map;

public class Answer extends AppCompatActivity {
    private WebView webView;
    Button a, b, c, d;
    String no = "1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
        d = findViewById(R.id.d);
        a.setOnClickListener(v -> {
            webView = (WebView) findViewById(R.id.webView);
            //webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("http://192.168.184.60:9999/clicker/select?id="+ no +"&choice=a");
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            finish();
        });
        b.setOnClickListener(v -> {
            webView = (WebView) findViewById(R.id.webView);
            //webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("http://192.168.184.60:9999/clicker/select?id="+ no +"&choice=b");
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            finish();
        });
        c.setOnClickListener(v -> {
            webView = (WebView) findViewById(R.id.webView);
            //webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("http://192.168.184.60:9999/clicker/select?id="+ no +"&choice=c");
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            finish();
        });
        d.setOnClickListener(v -> {
            webView = (WebView) findViewById(R.id.webView);
            //webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("http://192.168.184.60:9999/clicker/select?id="+ no +"&choice=d");
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            finish();
        });
    }
}