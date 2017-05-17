package com.aor.androidexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    private static final String STATE_USERNAME = "USERNAME";
    private static final String STATE_MAIL = "MAIL";

    private EditText textName;
    private EditText editMail;

    private Button buttonAdd;

    private ListView listPeople;
    private PersonAdapter personAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        textName = (EditText) findViewById(R.id.edit_name);
        editMail = (EditText) findViewById(R.id.edit_email);

        personAdapter = new PersonAdapter(ListActivity.this, new ArrayList<Person>());
        listPeople = (ListView) findViewById(R.id.list_people);
        listPeople.setAdapter(personAdapter);

        buttonAdd = (Button) findViewById(R.id.button_add_person);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                personAdapter.add(new Person(textName.getText().toString(), editMail.getText().toString()));
                //personAdapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putString(STATE_USERNAME, textName.getText().toString());
        savedInstanceState.putString(STATE_MAIL, editMail.getText().toString());
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        textName.setText(savedInstanceState.getString(STATE_USERNAME));
        editMail.setText(savedInstanceState.getString(STATE_MAIL));
    }
}
