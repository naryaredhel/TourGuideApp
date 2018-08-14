package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NightLifeFragment extends Fragment {

    public NightLifeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<TourInfo> tourInfos =new ArrayList<>();

        tourInfos.add(new TourInfo(getString(R.string.karakoyTitle),getString(R.string.karakoy),
                R.drawable.karakoy));
        tourInfos.add(new TourInfo(getString(R.string.arnavutkoyTitle),getString(R.string.arnavutkoy),
                R.drawable.arnavutkoy));
        tourInfos.add(new TourInfo(getString(R.string.nisantasiTitle), getString(R.string.nisantasi),
                R.drawable.nisantasi));
        tourInfos.add(new TourInfo(getString(R.string.cihangirTitle),getString(R.string.cihangir),
                R.drawable.cihangir));
        tourInfos.add(new TourInfo(getString(R.string.kadikoyTitle),getString(R.string.kadikoy),
                R.drawable.kadikoy));

        TourInfoAdapter adapter =
                new TourInfoAdapter(getActivity(), tourInfos);
        ListView listView = (ListView) rootView.findViewById(R.id.tour_list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
