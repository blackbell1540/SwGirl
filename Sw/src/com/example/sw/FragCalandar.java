package com.example.sw;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

	

public class FragCalandar extends Fragment {
	
	Button start, end;
	ImageView imageCal;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.frag_cal, container, false);
		
		
		start = (Button)view.findViewById(R.id.buttonStart);
		end = (Button)view.findViewById(R.id.buttonEnd);
		imageCal = (ImageView)view.findViewById(R.id.imageView1);
		
		//init
		start.setVisibility(View.VISIBLE);
		end.setVisibility(View.GONE);
		imageCal.setImageResource(R.drawable.cal3);
		
		
		start.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				start.setVisibility(View.GONE);
				end.setVisibility(View.VISIBLE);
				imageCal.setImageResource(R.drawable.cal4);
			}
		});
		
		
		
		end.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				start.setVisibility(View.VISIBLE);
				end.setVisibility(View.GONE);
			}
		});
		return view;
	}
}
