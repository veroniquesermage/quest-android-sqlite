package fr.wildcodeschool.roomreservation;

import android.provider.BaseColumns;

/**
 * Created by bastienwcs on 21/03/18.
 */

public class DBContract {

    public static class PersonEntry implements BaseColumns {
        public static final String TABLE_NAME = "Person";
        public static final String COLUMN_NAME_LASTNAME = "lastname";
        public static final String COLUMN_NAME_FIRSTNAME = "firstname";
        public static final String COLUMN_NAME_PERSON_ID = "person_id";
    }

    public static class RoomEntry implements BaseColumns {
        public static final String TABLE_NAME = "ROOM";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_ROOM_ID = "room_id";
    }
}
