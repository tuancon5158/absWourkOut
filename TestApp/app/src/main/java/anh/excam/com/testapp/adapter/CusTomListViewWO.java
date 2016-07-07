package anh.excam.com.testapp.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import anh.excam.com.testapp.Model.detailworkOut;
import anh.excam.com.testapp.Model.exercises;
import anh.excam.com.testapp.R;

/**
 * Created by MyPC on 06/07/2016.
 */
public class CusTomListViewWO extends ArrayAdapter<detailworkOut> {
    private Activity activity;
    private int idlayout;
    private ArrayList<detailworkOut> list;
    public CusTomListViewWO(Activity activity, int idlayout, ArrayList<detailworkOut>list){
        super(activity,idlayout,list);
        this.activity=activity;
        this.idlayout=idlayout;
        this.list=list;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();

        convertView=inflater.inflate(idlayout,null);
         TextView round=(TextView)convertView.findViewById(R.id.round);
         TextView day=(TextView)convertView.findViewById(R.id.Day);
         TextView data=(TextView)convertView.findViewById(R.id.data);
        detailworkOut item = (detailworkOut) getItem(position);


        day.setText(item.getDay());
        data.setText(item.getData());
        round.setText(item.getData());

        return convertView;
    }
}
