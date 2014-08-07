package com.rubin.navdrawer;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class AnimalDiseaseFragment extends Fragment {

ListView animalDisease;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_animal, container,
				false);
		
		animalDisease = (ListView) rootView.findViewById(R.id.animallist);
		animalDisease.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				Toast.makeText(getActivity(), "Clicked on " + position, Toast.LENGTH_SHORT).show();
			}
		});

		return rootView;
	}
}
