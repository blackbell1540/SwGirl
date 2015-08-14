package com.example.sw.menu;

import com.example.sw.R;
import com.example.sw.R.drawable;
import com.example.sw.R.layout;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class MenuListFragment extends ListFragment{


	MenuAdapter mAdapter;
	
	//menu number
	public static final int MENU_INVALID = -1;
	public static final int MENU_HOME = 0;
	public static final int MENU_MENSES = 1;
	public static final int MENU_CONTRACEPTION = 2;
	public static final int MENU_PREGNANCY = 3;
	public static final int MENU_CAL = 4;

	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.list, null);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		mAdapter = new MenuAdapter(getActivity());
		
		MenuList hData = new MenuList();
		hData.imageResId = R.drawable.home;
		hData.menu = "홈";
		mAdapter.add(hData);
		
		MenuList mData = new MenuList();
		mData.imageResId = R.drawable.moon;
		mData.menu = "월경";
		mAdapter.add(mData);
		
		MenuList coData = new MenuList();
		coData.imageResId = R.drawable.condom;
		coData.menu = "피임";
		mAdapter.add(coData);
		
		MenuList pData = new MenuList();
		pData.imageResId = R.drawable.pregnant;
		pData.menu = "임신";
		mAdapter.add(pData);
		
		MenuList cData = new MenuList();
		cData.imageResId = R.drawable.calendar;
		cData.menu = "달력";
		mAdapter.add(cData);
		
		setListAdapter(mAdapter);
	}
	
		
   
    public void onListItemClick(ListView l, View v, int position, long id) {
          
        switch (position) {
        case 0:
            ((BaseActivity)getActivity()).fragmentReplace(0);
            break;
            
        case 1:
            ((BaseActivity)getActivity()).fragmentReplace(1);
            break;
  
        case 2:
            ((BaseActivity)getActivity()).fragmentReplace(2);
            break;
            
        case 3:
            ((BaseActivity)getActivity()).fragmentReplace(3);
            break;
            
        case 4:
            ((BaseActivity)getActivity()).fragmentReplace(4);
            break;
        }
        
        super.onListItemClick(l, v, position, id);
    }
	
	
	
	
}
