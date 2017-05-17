package com.aor.androidexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class PersonActivity extends AppCompatActivity {
    public static final String INTENT_PERSON = "PERSON";

    private TextView textName;
    private TextView textMail;

    private Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        person = (Person) intent.getSerializableExtra(INTENT_PERSON);

        setContentView(R.layout.activity_person);

        textName = (TextView) findViewById(R.id.text_name);
        textMail = (TextView) findViewById(R.id.text_email);

        textName.setText(person.getName());
        textMail.setText(person.getEmail());

    }
}
