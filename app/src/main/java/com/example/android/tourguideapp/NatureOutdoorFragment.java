package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NatureOutdoorFragment extends Fragment {

    public NatureOutdoorFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<TourInfo> tourInfos =new ArrayList<>();

        tourInfos.add(new TourInfo(getString(R.string.gulhaneTitle),getString(R.string.gulhane),
                R.drawable.gulhane));
        tourInfos.add(new TourInfo(getString(R.string.emirganTitle),getString(R.string.emirgan),
                R.drawable.emirgan));
        tourInfos.add(new TourInfo(getString(R.string.belgradTitle),getString(R.string.belgrad),
                R.drawable.belgrad));
        tourInfos.add(new TourInfo(getString(R.string.yildizTitle),getString(R.string.yildiz),
                R.drawable.yildiz));
        tourInfos.add(new TourInfo(getString(R.string.bosphorusTitle), getString(R.string.bosphorus),
                R.drawable.bosphorus));

        TourInfoAdapter adapter =
                new TourInfoAdapter(getActivity(), tourInfos);
        ListView listView = (ListView) rootView.findViewById(R.id.tour_list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
