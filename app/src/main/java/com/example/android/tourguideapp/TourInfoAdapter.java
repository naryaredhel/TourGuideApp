package com.example.android.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class TourInfoAdapter extends ArrayAdapter<TourInfo> {

    public TourInfoAdapter(Context context, ArrayList<TourInfo> tourInfos) {
        super(context,0, tourInfos);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        TourInfo currentTourInfo = getItem(position);

        TextView title = listItemView.findViewById(R.id.title);
        title.setText(currentTourInfo.getmTitle());

        TextView info =  listItemView.findViewById(R.id.info);
        info.setText(currentTourInfo.getmInfo());

        ImageView image =listItemView.findViewById(R.id.image);
        image.setImageResource(currentTourInfo.getmPhotoResourceId());
        image.setVisibility(View.VISIBLE);

        TextView address= listItemView.findViewById(R.id.address);
        address.setText((currentTourInfo.getmAddress()));

        TextView tell= listItemView.findViewById(R.id.tell);
        tell.setText((currentTourInfo.getmTell()));

        return listItemView;
    }
}
