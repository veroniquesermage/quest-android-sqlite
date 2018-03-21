package fr.wildcodeschool.roomreservation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by bastienwcs on 21/03/18.
 */

public class RoomAdapter extends ArrayAdapter<RoomModel> {

    public RoomAdapter(@NonNull Context context, int resource, @NonNull List<RoomModel> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_room, parent, false);
        }
        TextView tvName = convertView.findViewById(R.id.text_name);

        RoomModel roomModel = getItem(position);
        if (roomModel != null) {
            tvName.setText(roomModel.getName());
        }

        return convertView;
    }
}
