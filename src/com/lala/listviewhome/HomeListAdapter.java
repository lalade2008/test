package com.lala.listviewhome;

import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeListAdapter extends BaseAdapter{
	private LayoutInflater mInflater;
	private List<HomeModel> mDatas;
	public HomeListAdapter( Context context) {
		// TODO Auto-generated constructor stub
		mInflater=LayoutInflater.from(context);
	}
	public void setAdapterDatas(List<HomeModel> datas){
		this.mDatas=datas;		
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mDatas==null ? 0 : mDatas.size();
	}
	@Override
	public HomeModel getItem(int position) {
		// TODO Auto-generated method stub
		return mDatas.get(position);
	}
	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View view =mInflater.inflate(R.layout.myweixin_list_item, null);
		ImageView icon=(ImageView)view.findViewById(R.id.item_icon);
		TextView name=(TextView)view.findViewById(R.id.item_name);
		TextView time=(TextView)view.findViewById(R.id.item_time);
		TextView msg=(TextView)view.findViewById(R.id.item_msg);
		
		HomeModel model=getItem(position);
			
		icon.setImageResource(model.getPicId());
		name.setText(model.getName());
		time.setText(model.getTime());
		msg.setText(model.getMsg());
		return view;
	}

}
