package fr.wildcodeschool.roomreservation;

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
    }

    private ArrayList<RoomModel> loadRoomsFromDB() {
        ArrayList<RoomModel> roomModels = new ArrayList<>();

        // TODO : load rooms from database

        return roomModels;
    }
}
