package fr.wildcodeschool.roomreservation;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RoomListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_list);

        ArrayList<RoomModel> roomModels = loadRoomsFromDB();

        RoomAdapter adapter = new RoomAdapter(this, 0, roomModels);
        ListView lvListRoom = findViewById(R.id.list_room);
        lvListRoom.setAdapter(adapter);

//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_person_list);
//
//        ArrayList<PersonModel> personModels = loadPersonsFromDB();
//
//        PersonAdapter adapter = new PersonAdapter(this, 0, personModels);
//        ListView lvListPerson = findViewById(R.id.list_person);
//        lvListPerson.setAdapter(adapter);
    }

    private ArrayList<RoomModel> loadRoomsFromDB() {
        ArrayList<RoomModel> roomModels = new ArrayList<>();
        DbHelper mDbHelper = new DbHelper(RoomListActivity.this);
        SQLiteDatabase db = mDbHelper.getReadableDatabase();

        String[] projection = {
                DBContract.RoomEntry._ID,
                DBContract.RoomEntry.COLUMN_NAME_NAME
        };

        Cursor cursor = db.query(
                DBContract.RoomEntry.TABLE_NAME,
                projection,
                null, null, null, null, null
        );

        while (cursor.moveToNext()) {
            long id = cursor.getLong(cursor.getColumnIndexOrThrow(DBContract.RoomEntry._ID));
            String name = cursor.getString(cursor.getColumnIndexOrThrow(DBContract.RoomEntry.COLUMN_NAME_NAME));

            RoomModel roomModel = new RoomModel(id, name);
            roomModels.add(roomModel);
        }
        cursor.close();

        return roomModels;
    }
}
