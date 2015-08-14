package com.example.sw;

import java.util.ArrayList;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class AdapterQA extends BaseAdapter{

	ArrayList <DataQA> items = new ArrayList<DataQA>();
	
	Context mContext;
	
	public AdapterQA(Context context) {
		// TODO Auto-generated constructor stub
		mContext = context;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return items.size();
	}

	public void add(DataQA item)
	{
		items.add(item);
		notifyDataSetChanged();
	}
	
	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return items.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		ViewQA view;
		if(convertView == null)
		{ view = new ViewQA(mContext); }
		else
		{view = (ViewQA)convertView; }
		
		view.setDataQA(items.get(position));
		return view;
	}

}
