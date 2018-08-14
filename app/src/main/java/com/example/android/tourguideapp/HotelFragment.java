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
public class HotelFragment extends Fragment {

    public HotelFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.tour_list, container, false);

            final ArrayList<TourInfo> tourInfos =new ArrayList<>();

            tourInfos.add(new TourInfo(getString(R.string.celalSultanTitle),
                    getString(R.string.celalSultan),R.drawable.celal_sultan,
                    getString(R.string.celalSultanAddress),
                    getString(R.string.celalSultanTell)));
            tourInfos.add(new TourInfo(getString(R.string.ertenKonakTitle),
                    getString(R.string.ertenKonak),R.drawable.erten_konak,
                    getString(R.string.ertenKonakAddress),
                    getString(R.string.ertenKonakTell)));
            tourInfos.add(new TourInfo(getString(R.string.wyndhamTitle),
                    getString(R.string.wyndham),R.drawable.wyndham,
                    getString(R.string.wyndhamAddress),
                    getString(R.string.wyndhamTell)));

        TourInfoAdapter adapter =
                new TourInfoAdapter(getActivity(), tourInfos);
        ListView listView = (ListView) rootView.findViewById(R.id.tour_list);
        listView.setAdapter(adapter);

            return rootView;
    }

}
