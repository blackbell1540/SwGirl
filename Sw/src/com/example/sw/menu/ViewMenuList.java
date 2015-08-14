package com.example.sw.menu;

import com.example.sw.R;
import com.example.sw.R.id;
import com.example.sw.R.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewMenuList extends FrameLayout{

	public ViewMenuList(Context context) {
		super(context); init();
		// TODO Auto-generated constructor stub
	}
	
	public ViewMenuList(Context context, AttributeSet attrs) {
		super(context, attrs); init();
		// TODO Auto-generated constructor stub
	}

	ImageView imageIcon;
	TextView textMenu;
	
	private void init()
	{
		LayoutInflater.from(getContext()).inflate(R.layout.item_menu, this);
		imageIcon = (ImageView)findViewById(R.id.imageMenuIcon);
		textMenu = (TextView)findViewById(R.id.textQ);
	}
	
	MenuList mData;
	public void setDataMenuItem(MenuList data)
	{
		mData = data;
		imageIcon.setImageResource(data.imageResId);
		textMenu.setText(data.menu);
	}
}
