package com.example.sw;

import com.example.sw.R;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

public class ViewQA extends FrameLayout{
	
	public ViewQA(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public ViewQA(Context context) {
		super(context);
		init();
	}
	
	TextView textQ, textA;
	
	private void init()
	{
		LayoutInflater.from(getContext()).inflate(R.layout.item_list, this);
		textQ = (TextView)findViewById(R.id.textQ);
		textA = (TextView)findViewById(R.id.textA);
	}
	
	DataQA mData;
	public void setDataQA(DataQA data)
	{
		mData = data;
		textA.setText(mData.A);
		textQ.setText(mData.Q);
	}
}
