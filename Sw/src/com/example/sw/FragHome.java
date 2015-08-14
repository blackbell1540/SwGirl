package com.example.sw;

import com.example.sw.qa.QuestionActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class FragHome extends Fragment {

	ImageView buttonQ;
	Button buttonLogin;
	LinearLayout loginBefore, loginAfter;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.frag_home, container, false);
	
		
		buttonQ = (ImageView)view.findViewById(R.id.imageQuest);
		buttonLogin = (Button)view.findViewById(R.id.buttonLogin);
		loginAfter = (LinearLayout)view.findViewById(R.id.after);
		loginBefore = (LinearLayout)view.findViewById(R.id.before);
		
		buttonQ.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getActivity(), QuestionActivity.class);
				startActivity(intent);
			}
		});
		
		buttonLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getActivity(), "로그인 되었습니다.", Toast.LENGTH_SHORT).show();
				loginBefore.setVisibility(View.GONE);
				loginAfter.setVisibility(View.VISIBLE);
			}
		});
		
		return view;
	}
}
