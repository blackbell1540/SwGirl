package com.example.sw.menu;

import com.example.sw.R;
import com.example.sw.R.id;
import com.example.sw.R.layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuAdapter extends ArrayAdapter<MenuList>{

	public MenuAdapter(Context context) {
		super(context, 0);
		// TODO Auto-generated constructor stub
	}

	public View getView(int position, View convertView, ViewGroup parent)
	{
		if(convertView == null)
		{ convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_menu, null); }
		
		ImageView icon = (ImageView)convertView.findViewById(R.id.imageMenuIcon);
		icon.setImageResource(getItem(position).imageResId);
		TextView text = (TextView)convertView.findViewById(R.id.textQ);
		text.setText(getItem(position).menu);
		
		return convertView;
	}

	

}
