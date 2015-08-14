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
		q1.Q = "������ �߿伺�� ���� �˾ƺ��ô�.";
		q1.A = "21���⸦ ��ư��� �η����� ������ �� �̻� ������ �ƴ϶� �ʼ� ������ ��ȸ�� ������ ������ �������� ������ȹ�� ����ȭ�Ǹ� Ư�� û�ҳ���� �������� ���� �ʿ� ���� ��Ȯ�ϰ� ������ ������ ���� �� �߿������� �ִ�. ������ �ܼ��� �α� ������å���� ��� ������ �ʴ� �ӽ��� ���������ν� ������ ����, ���ư� ������ �ȳ�� ���� ���� ��� ������ ���߾����� �ִ�.	";
		mAdapter.add(q1);
		
		DataQA q2 = new DataQA();
		q2.Q = "���� �ֱ�� ��� �˴ϱ�?";
		q2.A = "�������� ������ ����� ������ ����. ����: ���� �ֱ�� �����ϴ� �� ���� ������ ������ ������ ��������, 21~35��(��� 28��)�� ��� �����̴�. "
				+ "�Ⱓ: ������ ���� 3~5�ϰ� ���ӵǸ� 2~7�ϱ��� �����̴�. ��: ��� 35���̸� 10~80������ �����̴�.";
		mAdapter.add(q2);
		
		DataQA q3 = new DataQA();
		q3.Q = "������ ���ϸ�?";
		q3.A = "���� �� �� (������ 85%)";
		mAdapter.add(q3);
		
		DataQA q4 = new DataQA();
		q4.Q = "������ ���ӹ��� ���� �˷��ּ���";
		q4.A = "ȣ���� �������δ� �汸���Ӿ� (������ 7.6%)�� �ְ� ������� ���� ������ ù������ ���� 21�ϵ��� ���Ͻð��� ��Ģ������ �����Ѵ�. ù �޿��� ����ȿ���� ��Ȯ���ϹǷ� �������� �� ��. \n"
				+ "������ġ (������ 0.15%)\n"
				+ "�ڱ� �� ��ġ �����ڱó���ġ (������ 0.8%) ��̵�(������ �ܵ�) (������ 0.2%)\n"
				+ "���� ���� ���� ���� ���� (������ 0.05%) ";
		mAdapter.add(q4);
		
		DataQA q5 = new DataQA();
		q5.Q = "������ ���ӹ��� ���� �˷��ּ���";
		q5.A = "������ �ܵ� (������ 13.9%)\n ���� ���� : ���� ���� ���� (������ 0.15%) \n�� ��  ���� ���� (������ 23.6%)�����ֱ������� (������ 20.5%)";
		mAdapter.add(q5);
		
		DataQA q6 = new DataQA();
		q6.Q = "���� �߿��� �ӽ��� �� �ȴ�?";
		q6.A = "������ �ƴ϶� �ܼ� ���� ���� ���� �ְ� ���� ���̶�� �ϴ��� �ӽŰ��ɼ��� ���� ���� �ƴմϴ�. ����� �ұ�Ģ���� �� �ְ� ���ڴ� �ڱ� ������ ������ �� �ֱ� ������ ���� �߿��� �ӽ��� �� �ֽ��ϴ�.";
		mAdapter.add(q6);
		
		DataQA q7 = new DataQA();
		q7.Q = "�Դ� ���Ӿ��� ���� ������ ������ �ȴ�?";
		q7.A = "���Ӿ��� ������ ����Ű�� �ʽ��ϴ�.";
		mAdapter.add(q7);
		
		DataQA q8 = new DataQA();
		q8.Q = "�Դ� ���Ӿ��� ���� ���?";
		q8.A = "������ ȣ���� ���� ���Ҵ� ���Ӿ��� �������� , �Ŀ������� ���� ü���� �þ�� ��찡�� �־����� ���� ���Ӿ࿡���� �������� ��쿡 �ش�˴ϴ�.";
		mAdapter.add(q8);
	}
}
