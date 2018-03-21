package fr.wildcodeschool.roomreservation;

/**
 * Created by bastienwcs on 21/03/18.
 */

public class RoomModel {

    private long id;
    private String name;

    public RoomModel(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
