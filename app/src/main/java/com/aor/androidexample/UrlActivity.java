package com.aor.androidexample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by arestivo on 5/17/17.
 */

public class UrlActivity extends AppCompatActivity {
    private TextView textUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url);

        textUrl = (TextView) findViewById(R.id.text_url);

        try {
            Intent intent = getIntent();
            Uri uri = this.getIntent().getData();
            URL url = new URL(uri.getScheme(), uri.getHost(), uri.getPath());
            textUrl.setText(url.toString());
        } catch (MalformedURLException e) {
            Log.e("Android Example", "Wrong URL Format");
        }
    }
}
