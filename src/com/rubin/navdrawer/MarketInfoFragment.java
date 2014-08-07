package com.rubin.navdrawer;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MarketInfoFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_weather, container,
				false);

		// SPINNER LOCATION
		Spinner spinner = (Spinner) rootView.findViewById(R.id.choose_crop_spinner);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				getActivity(), R.array.crop_list,
				android.R.layout.simple_spinner_item); // Create an ArrayAdapter
														// using the string
														// array and a default
														// spinner layout
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // Specify
																						// the
																						// layout
																						// to
																						// use
																						// when
																						// the
																						// list
																						// of
																						// choices
																						// appears
		spinner.setAdapter(adapter); // Apply the adapter to the spinner
		
		return rootView;
	}
}
