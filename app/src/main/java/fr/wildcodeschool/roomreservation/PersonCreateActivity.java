package fr.wildcodeschool.roomreservation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PersonCreateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_create);

        Button btCreate = findViewById(R.id.button_create_person);
        btCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText etFirstname = findViewById(R.id.edit_firstname);
                EditText etLastname = findViewById(R.id.edit_lastname);
                EditText etAddress = findViewById(R.id.edit_address);
                EditText etLanguage = findViewById(R.id.edit_language);

                String firstname = etFirstname.getText().toString();
                String lastname = etLastname.getText().toString();
                String address = etAddress.getText().toString();
                String language = etLanguage.getText().toString();

                // TODO : add person into database

                Intent intent = new Intent(PersonCreateActivity.this, MainActivity.class);
                PersonCreateActivity.this.startActivity(intent);
            }
        });
    }
}
