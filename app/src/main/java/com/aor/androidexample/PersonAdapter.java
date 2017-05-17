package com.aor.androidexample;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class PersonAdapter extends ArrayAdapter<Person> {
    public PersonAdapter(Context context, List<Person> items) {
        super(context, -1, items);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final Person person = getItem(position);

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_person, null);
        }

        TextView textName = (TextView) convertView.findViewById(R.id.text_name);
        TextView textEmail = (TextView) convertView.findViewById(R.id.text_email);

        textName.setText(person.getName());
        textEmail.setText(person.getEmail());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), PersonActivity.class);
                intent.putExtra(PersonActivity.INTENT_PERSON, person);
                getContext().startActivity(intent);
            }
        });

        return convertView;
    }
}
