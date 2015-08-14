package com.example.sw;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FragContraception extends Fragment {
	ListView list;
	AdapterQA mAdapter;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.frag_contra, container, false);
		list = (ListView)view.findViewById(R.id.listContra);
		mAdapter = new AdapterQA(getActivity());
		
		initData();
		list.setAdapter(mAdapter);
		
		return view;
	}
	
	public void initData()
	{
		DataQA q1 = new DataQA();
		q1.Q = "피임의 중요성에 대해 알아봅시다.";
		q1.A = "21세기를 살아가는 인류에게 피임은 더 이상 선택이 아니라 필수 여성의 사회적 경제적 지위가 높아지고 가족계획이 보편화되며 특히 청소년들의 성행위가 증가 됨에 따라 정확하고 안전한 피임은 점점 더 중요해지고 있다. 피임은 단순히 인구 억제정책에서 벗어나 원하지 않는 임신을 예방함으로써 여성과 남성, 나아가 가족의 안녕과 삶의 질의 향상에 초점이 맞추어지고 있다.	";
		mAdapter.add(q1);
		
		DataQA q2 = new DataQA();
		q2.Q = "월경 주기는 어떻게 됩니까?";
		q2.A = "정상적인 월경의 양상은 다음과 같다. 간격: 생리 주기는 연속하는 두 번의 생리의 시작일 사이의 간격으로, 21~35일(평균 28일)인 경우 정상이다. "
				+ "기간: 생리는 보통 3~5일간 지속되며 2~7일까지 정상이다. 양: 평균 35㎖이며 10~80㎖까지 정상이다.";
		mAdapter.add(q2);
		
		DataQA q3 = new DataQA();
		q3.Q = "피임을 안하면?";
		q3.A = "피임 안 함 (실패율 85%)";
		mAdapter.add(q3);
		
		DataQA q4 = new DataQA();
		q4.Q = "여성용 피임법에 대해 알려주세요";
		q4.A = "호르몬 피임제로는 경구피임약 (실패율 7.6%)이 있고 복용법은 생리 시작한 첫날부터 복용 21일동안 동일시간에 규칙적으로 복용한다. 첫 달에는 피임효과가 불확실하므로 이중피임 할 것. \n"
				+ "피임패치 (실패율 0.15%)\n"
				+ "자궁 내 장치 구리자궁내장치 (실패율 0.8%) 페미돔(여성용 콘돔) (실패율 0.2%)\n"
				+ "불임 수술 난관 불임 수술 (실패율 0.05%) ";
		mAdapter.add(q4);
		
		DataQA q5 = new DataQA();
		q5.Q = "남성용 피임법에 대해 알려주세요";
		q5.A = "남성용 콘돔 (실패율 13.9%)\n 불임 수술 : 정관 불임 수술 (실패율 0.15%) \n그 외  질외 사정 (실패율 23.6%)월경주기조절법 (실패율 20.5%)";
		mAdapter.add(q5);
		
		DataQA q6 = new DataQA();
		q6.Q = "생리 중에는 임신이 안 된다?";
		q6.A = "월경이 아니라 단순 하혈 중일 수도 있고 월경 중이라고 하더라도 임신가능성이 없는 것은 아닙니다. 배란은 불규칙적일 수 있고 정자는 자궁 내에서 생존할 수 있기 때문에 월경 중에도 임신할 수 있습니다.";
		mAdapter.add(q6);
		
		DataQA q7 = new DataQA();
		q7.Q = "먹는 피임약을 오래 먹으면 불임이 된다?";
		q7.A = "피임약은 불임을 일으키지 않습니다.";
		mAdapter.add(q7);
		
		DataQA q8 = new DataQA();
		q8.Q = "먹는 피임약은 살이 찐다?";
		q8.A = "예전의 호르몬 양이 많았던 피임약은 수분축적 , 식욕증가로 인해 체중이 늘어가는 경우가ㅏ 있었으나 요즘 피임약에서는 예외적인 경우에 해당됩니다.";
		mAdapter.add(q8);
	}
}
