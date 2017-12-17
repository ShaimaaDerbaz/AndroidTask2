package com.example.shaimaaderbaz.taskh2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Shaimaa Derbaz on 12/12/2017.
 */

public class ListAdapter extends ArrayAdapter<ImageItem> {

    ArrayList<ImageItem> _images;
    Context c;
    public ListAdapter(Activity context, ArrayList<ImageItem> images) {

        super(context, 0, images);
        _images=images;
        c=context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // return super.getView(position, convertView, parent);
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(
                    getContext()).inflate(R.layout.item_list, null, false);
        }
       /* LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View listItemView = inflater.inflate(R.layout.item_list, parent, false);*/


        ImageItem currentImage = getItem(position);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_cell_image_view);
        imageView.setImageResource(currentImage.getImage());
        TextView imageIdTextView = (TextView) listItemView.findViewById(R.id.image_id_text_view);
        imageIdTextView.setText(currentImage.getId());


        return listItemView;
    }
}
