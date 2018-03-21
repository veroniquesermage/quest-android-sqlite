package fr.wildcodeschool.roomreservation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PersonListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_list);

        ArrayList<PersonModel> personModels = loadPersonsFromDB();

        PersonAdapter adapter = new PersonAdapter(this, 0, personModels);
        ListView lvListPerson = findViewById(R.id.list_person);
        lvListPerson.setAdapter(adapter);
    }

    private ArrayList<PersonModel> loadPersonsFromDB() {
        ArrayList<PersonModel> personModels = new ArrayList<>();

        // TODO : load persons from database

        return personModels;
    }
}
