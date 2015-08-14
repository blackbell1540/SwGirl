package com.example.sw;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FragMenses extends Fragment {

	ListView list;
	AdapterQA mAdapter;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.frag_menses, container, false);

		list = (ListView)view.findViewById(R.id.listMenses);
		mAdapter = new AdapterQA(getActivity());
		
		initData();
		list.setAdapter(mAdapter);
		return view;
	}
	
	
	public void initData()
	{
		DataQA q1 = new DataQA();
		q1.Q = "월경이 무엇입니까?";
		q1.A = "가임기 여성의 자궁내막은 주기적으로 분비된 호르몬에 의하여 증식하여 배아의 착상을 준비하는데 임신이 되지 않으면 자궁내막이 저절로 탈락되며 이 현상을 월경이라고 한다.";
		mAdapter.add(q1);
		
		DataQA q2 = new DataQA();
		q2.Q = "월경 주기는 어떻게 됩니까?";
		q2.A = "정상적인 월경의 양상은 다음과 같다. 간격: 생리 주기는 연속하는 두 번의 생리의 시작일 사이의 간격으로, 21~35일(평균 28일)인 경우 정상이다. "
				+ "기간: 생리는 보통 3~5일간 지속되며 2~7일까지 정상이다. 양: 평균 35㎖이며 10~80㎖까지 정상이다.";
		mAdapter.add(q2);
		
		DataQA q3 = new DataQA();
		q3.Q = "가임기는 언제입니까?";
		q3.A = "초경 후 폐경까지의 기간 전체가 가임기이다. 생리 주기가 28일인 경우 생리 시작 14일 전후로 배란이 되며 이 때가 임신확률이 가장 높은 시기이다.";
		mAdapter.add(q3);
		
		DataQA q4 = new DataQA();
		q4.Q = "월경통에 대해 알려주세요";
		q4.A = "일차성 월경통은 자궁근육의 수축으로 인한 자궁내압의 증가로 발생하며 증상은 월경이 나타나기 수시간 전 혹은 직전에 시작되어 2~3일간 지속 될 수 있다. "
				+ "자궁을 쥐어짜는 듯한 통증을 느끼며 꼬리뼈 부위의 통증, 허벅지 통증, 근육통, 메스꺼움, 구토, 설사 등의 증상 등이 나타나며 출산시 산통과"
				+ " 유사한 증상이 나타난다. 월경통이 심한경우 실신에 이르는 경우도 있다. 소염진통제로 증상을 완화할 수 있으며 통증이 있는 기간에만 일시적으로 "
				+ "사용하며 비마약성 진통제이므로 부작용은 거의 걱정할 필요가 없다.  //  이차성 월경통은 월경 시작 1~2주 전부터 시작되어 월경 출혈이 끝난 후에도"
				+ " 수일간 지속 될 수 있다. 증상, 원인 또한 매우 다양하지만 대개 골반강 내의 이상 징후에 의해 자궁경부가 막히거나, 자궁내에 혹이 생기거나, "
				+ "이물질로 인한 반응으로 자궁근육이 강하게 수축하면서 프로스타글란딘의 생성이 증가한 것이 원인이 된다. "
				+ "일차성 월경통과 달리 진통제나 복합피임제로 증상이 나아지지 않는다. "
				+ "월경통의 원인은 다양하고 증상의 정도 차이도 심하기 때문에 심한 월경통이 지속되는 경우 산부인과 진찰을 받아보는 것이 좋다.";
		mAdapter.add(q4);
		
		DataQA q5 = new DataQA();
		q5.Q = "생리대..?";
		q5.A = "생리대의 종류에는 탐폰&패드가 있다. 최근에는 컵생리대 등 다양한 형태의 생리대들이 사용되고 있다. "
				+ "패드는 생리양에 따라 알맞은 크기의 생리대를 속옷에 부착하여 생리혈을 흡수하는 것이고 탐폰의 경우 질안으로 삽입하여 생리혈을 흡수한다. "
				+ "생리대는 자주 갈아주어야 위생적으로 안전하여 합병증을 예방할 수 있다. 탐폰의 경우 두통, 저혈압, 구토 등의 증상을 발생시키는 독성 쇼크"
				+ " 증후근을 일으킬 수 있다. 심한 경우 사망에 이를 수도 있다.";
		mAdapter.add(q5);
		
		DataQA q6 = new DataQA();
		q6.Q = "생리대는 몸무게에 따라 크기를 결정한다.?";
		q6.A = "생리대는 생리혈의 양, 혹은 개인의 필요에 따라 결정됩니다.";
		mAdapter.add(q6);
		
		DataQA q7 = new DataQA();
		q7.Q = "생리는 하루만 한다?";
		q7.A = "생리는 2~7일정도 지속되며 하루 만에 깔끔하게 끝나는 경우는 거의 없다고 봐도 무방합니다.";
		mAdapter.add(q7);
		
		DataQA q8 = new DataQA();
		q8.Q = "생리는 참을 수 있다?";
		q8.A = "생리는 자궁내막이 저절로 탈락되며 피가 나오는 것이므로 여성이 마음대로 조절할 수 없습니다.";
		mAdapter.add(q8);
	}
}
