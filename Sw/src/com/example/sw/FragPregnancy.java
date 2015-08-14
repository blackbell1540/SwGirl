package com.example.sw;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FragPregnancy extends Fragment {
	
	ListView list;
	AdapterQA mAdapter;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.frag_pregnancy, container, false);
		
		list = (ListView)view.findViewById(R.id.listpreg);
		mAdapter = new AdapterQA(getActivity());
		
		initData();
		list.setAdapter(mAdapter);
		
		return view;
	}
	
	public void initData()
	{
		DataQA q1 = new DataQA();
		q1.Q = "임신이 무엇입니까?";
		q1.A = "난자와 정자의 결합으로 만들어진 수정란이 자궁에 착상하여 태아로 발육하는 과정이다.";
		mAdapter.add(q1);
		
		DataQA q2 = new DataQA();
		q2.Q = "기간은 어떻게 됩니까?";
		q2.A = "평균 29주이다.";
		mAdapter.add(q2);
		
		DataQA q3 = new DataQA();
		q3.Q = "가임기는 언제입니까?";
		q3.A = "초경 후 폐경까지의 기간 전체가 가임기이다. 생리 주기가 28일인 경우 생리 시작 14일 전후로 배란이 되며 이 때가 임신확률이 가장 높은 시기이다.";
		mAdapter.add(q3);
		
		DataQA q4 = new DataQA();
		q4.Q = "관련 질병에 대해 알려주세요";
		q4.A = "전자간증(자간전증, 임신 중독증), 임신성 고혈압, 조기 진통, 조기 양막 파수, 임신성 당뇨, 자궁 외 임신 등이 있다.";
		mAdapter.add(q4);
		
		DataQA q5 = new DataQA();
		q5.Q = "생리대..?";
		q5.A = "생리대의 종류에는 탐폰&패드가 있다. 최근에는 컵생리대 등 다양한 형태의 생리대들이 사용되고 있다. "
				+ "패드는 생리양에 따라 알맞은 크기의 생리대를 속옷에 부착하여 생리혈을 흡수하는 것이고 탐폰의 경우 질안으로 삽입하여 생리혈을 흡수한다. "
				+ "생리대는 자주 갈아주어야 위생적으로 안전하여 합병증을 예방할 수 있다. 탐폰의 경우 두통, 저혈압, 구토 등의 증상을 발생시키는 독성 쇼크"
				+ " 증후근을 일으킬 수 있다. 심한 경우 사망에 이를 수도 있다.";
		mAdapter.add(q5);
		
		DataQA q6 = new DataQA();
		q6.Q = "입덧이 뭐죠?";
		q6.A = "입덧이란 임신 중에 느끼는 구역 및 구토 증상으로, 주로 임신 초기에 발생하는 소화기 계통의 증세를 말한다. 이른 아침 공복 때의 구역질이나 가벼운 구토 외에 식욕부진과 음식물에 대한 기호의 변화 등이 나타난다. 병이라기보다는 일종의 생리적인 현상이다.";
		mAdapter.add(q6);
		
		DataQA q7 = new DataQA();
		q7.Q = "체형, 엉덩이가 크면 골반이 크다?";
		q7.A = "엉덩이의 크기와 골반크기가 비례하는 것은 아니며 아기가 통과하는 속 골반은 오히려 마른체형의 임산부들이 넓은 경우가 더 많다. 오히려 살이 쪘을 경우에 속 골반의 지방량이 많아 산도가 좁아질 가능성이 크다.";
		mAdapter.add(q7);
		
		DataQA q8 = new DataQA();
		q8.Q = "임신 중 관계는 하면 안된다?";
		q8.A = "임신 중 성관계는 무리하게 하지만 않으면 질내사정도 상관없습니다. 다만 출산 1개월 전부터는 피하시는 것이 좋습니다.";
		mAdapter.add(q8);
	}
}
