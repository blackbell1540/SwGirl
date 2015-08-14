package com.example.sw.menu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.view.Menu;
import android.view.MenuItem;

import com.example.sw.FragBoard;
import com.example.sw.FragCalandar;
import com.example.sw.FragContraception;
import com.example.sw.FragHome;
import com.example.sw.FragMenses;
import com.example.sw.FragPregnancy;
import com.example.sw.R;
import com.example.sw.R.dimen;
import com.example.sw.R.drawable;
import com.example.sw.R.id;
import com.example.sw.R.layout;
import com.example.sw.R.menu;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

public class BaseActivity extends SlidingFragmentActivity{
	protected MenuListFragment mFrag;
	
	public BaseActivity(){}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setBehindContentView(R.layout.frag_menu);
		if(savedInstanceState == null)
		{ 
			FragmentTransaction t = this.getSupportFragmentManager().beginTransaction();
			mFrag = new MenuListFragment();
			t.replace(R.id.menu_frame, mFrag);
			t.commit();
		}else
		{
			mFrag = (MenuListFragment)this.getSupportFragmentManager().findFragmentById(R.id.menu_frame);
		}
		
		SlidingMenu sm = getSlidingMenu();
		sm.setShadowWidthRes(R.dimen.shadow_width);
		sm.setShadowDrawable(R.drawable.shadow);
		sm.setBehindOffsetRes(R.dimen.offset);
		sm.setFadeDegree(0.35f);
		sm.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
		
		getSupportActionBar().setDisplayHomeAsUpEnabled(	true);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			toggle();
			return true;
		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void fragmentReplace(int reqNewFragIndex)
	{
		Fragment newFrag = null;
		newFrag = getFragment(reqNewFragIndex);
		
		final FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		ft.replace(R.id.fragment_mainContainer, newFrag);
		
		getSlidingMenu().showContent();
		
		ft.commit();
	}

	public Fragment getFragment(int idx)
	{
		Fragment newFrag = null;
		switch (idx) {
		case MenuListFragment.MENU_HOME:
			newFrag = new FragHome();
			break;
		case MenuListFragment.MENU_MENSES:
			newFrag = new FragMenses();
			break;
		case MenuListFragment.MENU_CONTRACEPTION:
			newFrag = new FragContraception();
			break;
		case MenuListFragment.MENU_PREGNANCY:
			newFrag = new FragPregnancy();
			break;
		case MenuListFragment.MENU_CAL:
			newFrag = new FragCalandar();
			break;

		default:
			break;
		}
		
		return newFrag;
	}
}
