package fr.wildcodeschool.roomreservation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btAddPerson = findViewById(R.id.button_add_person);
        btAddPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PersonCreateActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });

        Button btViewListPerson = findViewById(R.id.button_view_person_list);
        btViewListPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PersonListActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });

        Button btAddRoom = findViewById(R.id.button_add_room);
        btAddRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RoomCreateActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });

        Button btViewRoomList = findViewById(R.id.button_view_room_list);
        btViewRoomList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RoomListActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }
}
