package com.aor.androidexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Log.d("AndroidExample", "ON CREATE");
    }

    @Override
    protected void onStart() {
        super.onResume();

        Log.d("AndroidExample", "ON START");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("AndroidExample", "ON STOP");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("AndroidExample", "ON PAUSE");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("AndroidExample", "ON RESUME");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("AndroidExample", "ON RESTART");
    }
}
