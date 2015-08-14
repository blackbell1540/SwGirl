package com.example.sw.qa;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sw.MainActivity;
import com.example.sw.R;

public class QuestionActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quest);
		
		EditText editQ;
		Button buttonQ;
		
		editQ = (EditText)findViewById(R.id.editQuestoion);
		buttonQ = (Button)findViewById(R.id.buttonQuestion);
		
		buttonQ.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				AlertDialog.Builder dial = new AlertDialog.Builder(QuestionActivity.this);
				dial.setMessage("질문해주셔서 감사해요~").setCancelable(false).setPositiveButton("확인", new OnClickListener() {
					
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						Intent intent = new Intent(QuestionActivity.this, MainActivity.class);
						startActivity(intent);
						finish();
					}
				});
				
				AlertDialog alert = dial.create();
				alert.show();
			
			}
		});
		
		
	}
}
