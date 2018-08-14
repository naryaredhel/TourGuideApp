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
public class HistoricalFragment extends Fragment {

    public HistoricalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<TourInfo> tourInfos =new ArrayList<>();

        tourInfos.add(new TourInfo(getString(R.string.topkapiTitle),getString(R.string.topkapi),
                R.drawable.topkapi));
        tourInfos.add(new TourInfo(getString(R.string.ayasofyaTitle), getString(R.string.ayasofya),
                R.drawable.ayasofya));
        tourInfos.add(new TourInfo(getString(R.string.yerebatanTitle),getString(R.string.yerebatan),
                R.drawable.yerebatan));
        tourInfos.add(new TourInfo(getString(R.string.kizkulesiTitle),getString(R.string.kizkulesi),
                R.drawable.kizkulesi));
        tourInfos.add(new TourInfo(getString(R.string.arkeolojiTitle), getString(R.string.arkeoloji),
                R.drawable.arkeo));

        TourInfoAdapter adapter =
                new TourInfoAdapter(getActivity(), tourInfos);
        ListView listView = (ListView) rootView.findViewById(R.id.tour_list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
