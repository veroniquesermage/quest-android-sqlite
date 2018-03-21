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

public class PersonAdapter extends ArrayAdapter<PersonModel> {

    public PersonAdapter(@NonNull Context context, int resource, @NonNull List<PersonModel> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_person, parent, false);
        }
        TextView tvFirtname = convertView.findViewById(R.id.text_firstname);
        TextView tvLastname = convertView.findViewById(R.id.text_lastname);
        TextView tvAddress = convertView.findViewById(R.id.text_address);
        TextView tvLanguage = convertView.findViewById(R.id.text_language);

        PersonModel personModel = getItem(position);
        if (personModel != null) {
            tvFirtname.setText(personModel.getFirstname());
            tvLastname.setText(personModel.getLastname());
            tvAddress.setText(personModel.getAddress());
            tvLanguage.setText(personModel.getLanguage());
        }

        return convertView;
    }
}
