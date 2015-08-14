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
		q1.Q = "�ӽ��� �����Դϱ�?";
		q1.A = "���ڿ� ������ �������� ������� �������� �ڱÿ� �����Ͽ� �¾Ʒ� �����ϴ� �����̴�.";
		mAdapter.add(q1);
		
		DataQA q2 = new DataQA();
		q2.Q = "�Ⱓ�� ��� �˴ϱ�?";
		q2.A = "��� 29���̴�.";
		mAdapter.add(q2);
		
		DataQA q3 = new DataQA();
		q3.Q = "���ӱ�� �����Դϱ�?";
		q3.A = "�ʰ� �� �������� �Ⱓ ��ü�� ���ӱ��̴�. ���� �ֱⰡ 28���� ��� ���� ���� 14�� ���ķ� ����� �Ǹ� �� ���� �ӽ�Ȯ���� ���� ���� �ñ��̴�.";
		mAdapter.add(q3);
		
		DataQA q4 = new DataQA();
		q4.Q = "���� ������ ���� �˷��ּ���";
		q4.A = "���ڰ���(�ڰ�����, �ӽ� �ߵ���), �ӽż� ������, ���� ����, ���� �縷 �ļ�, �ӽż� �索, �ڱ� �� �ӽ� ���� �ִ�.";
		mAdapter.add(q4);
		
		DataQA q5 = new DataQA();
		q5.Q = "������..?";
		q5.A = "�������� �������� Ž��&�е尡 �ִ�. �ֱٿ��� �Ż����� �� �پ��� ������ ��������� ���ǰ� �ִ�. "
				+ "�е�� �����翡 ���� �˸��� ũ���� �����븦 �ӿʿ� �����Ͽ� �������� ����ϴ� ���̰� Ž���� ��� �������� �����Ͽ� �������� ����Ѵ�. "
				+ "������� ���� �����־�� ���������� �����Ͽ� �պ����� ������ �� �ִ�. Ž���� ��� ����, ������, ���� ���� ������ �߻���Ű�� ���� ��ũ"
				+ " ���ı��� ����ų �� �ִ�. ���� ��� ����� �̸� ���� �ִ�.";
		mAdapter.add(q5);
		
		DataQA q6 = new DataQA();
		q6.Q = "�Ե��� ����?";
		q6.A = "�Ե��̶� �ӽ� �߿� ������ ���� �� ���� ��������, �ַ� �ӽ� �ʱ⿡ �߻��ϴ� ��ȭ�� ������ ������ ���Ѵ�. �̸� ��ħ ���� ���� �������̳� ������ ���� �ܿ� �Ŀ������ ���Ĺ��� ���� ��ȣ�� ��ȭ ���� ��Ÿ����. ���̶�⺸�ٴ� ������ �������� �����̴�.";
		mAdapter.add(q6);
		
		DataQA q7 = new DataQA();
		q7.Q = "ü��, �����̰� ũ�� ����� ũ��?";
		q7.A = "�������� ũ��� ���ũ�Ⱑ ����ϴ� ���� �ƴϸ� �ƱⰡ ����ϴ� �� ����� ������ ����ü���� �ӻ�ε��� ���� ��찡 �� ����. ������ ���� ���� ��쿡 �� ����� ���淮�� ���� �굵�� ������ ���ɼ��� ũ��.";
		mAdapter.add(q7);
		
		DataQA q8 = new DataQA();
		q8.Q = "�ӽ� �� ����� �ϸ� �ȵȴ�?";
		q8.A = "�ӽ� �� ������� �����ϰ� ������ ������ ���������� ��������ϴ�. �ٸ� ��� 1���� �����ʹ� ���Ͻô� ���� �����ϴ�.";
		mAdapter.add(q8);
	}
}
