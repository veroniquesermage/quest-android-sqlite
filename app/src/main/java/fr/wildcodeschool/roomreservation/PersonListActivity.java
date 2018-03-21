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

        ArrayList<PersonModel> personModels = new ArrayList<>();

        // TODO : load persons from database and remove the test value
        PersonModel removeThisTest = new PersonModel("Bastien", "Krettly", "1 place de la bourse 31000 TOULOUSE", "Java/Android");
        personModels.add(removeThisTest);

        PersonAdapter adapter = new PersonAdapter(this, 0, personModels);
        ListView lvListPerson = findViewById(R.id.list_person);
        lvListPerson.setAdapter(adapter);
    }
}
