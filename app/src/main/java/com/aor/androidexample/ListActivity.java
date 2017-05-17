package com.aor.androidexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ListActivity extends AppCompatActivity {
    private static final String STATE_USERNAME = "USERNAME";
    private static final String STATE_PASSWORD = "PASSWORD";

    private EditText editUsername;
    private EditText editPassword;

    private Button buttonAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        editUsername = (EditText) findViewById(R.id.edit_name);
        editPassword = (EditText) findViewById(R.id.edit_email);

        buttonAdd = (Button) findViewById(R.id.button_add_person);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putString(STATE_USERNAME, editUsername.getText().toString());
        savedInstanceState.putString(STATE_PASSWORD, editPassword.getText().toString());
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        editUsername.setText(savedInstanceState.getString(STATE_USERNAME));
        editPassword.setText(savedInstanceState.getString(STATE_PASSWORD));
    }
}
