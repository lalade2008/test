package com.lala.listviewhome;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


public class MainActivity extends Activity {
	private ListView mListView;
	private HomeListAdapter mAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mListView=(ListView)findViewById(R.id.homelist);
		List<HomeModel> datas=getDatas();
		mAdapter =new HomeListAdapter(this);
		mAdapter.setAdapterDatas(datas);
		mListView.setAdapter(mAdapter);
	}
	
	Integer PicId[]={R.drawable.itme_icon1,R.drawable.itme_icon2};
	String name[] ={"��Ѷ��ҵ����","΢���Ŷ�"};
	String msg[] ={"��Ѷ��ҵ���䣺���ʼ�֪ͨ","��ӭ���ٴλص�΢�ţ��������ʹ�ù��������κ�������飬�ǵø��ҷ��ŷ���Ŷ��"};
	String time[] ={"����14:57","����14:35"};
	private List<HomeModel> getDatas() {
		// TODO Auto-generated method stub
		List<HomeModel> datas = new ArrayList<HomeModel>();
		for(int i=0;i<name.length;i++){
			datas.add(getModel(i));
		}
		return datas;
	}
	private HomeModel getModel(int i) {
		// TODO Auto-generated method stub
		HomeModel model =new HomeModel();
		model.setPicId(PicId[i]);
		model.setName(name[i]);
		model.setMsg(msg[i]);
		model.setTime(time[i]);
		return model;
	}

	
}
