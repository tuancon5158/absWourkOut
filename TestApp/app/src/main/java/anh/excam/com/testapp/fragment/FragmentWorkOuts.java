package anh.excam.com.testapp.fragment;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import anh.excam.com.testapp.R;
import anh.excam.com.testapp.adapter.WorkOutsAdapter;
import anh.excam.com.testapp.Model.workOut;
import anh.excam.com.testapp.Support.*;


/**
 * Created by Anh on 5/14/2016.
 */

public class FragmentWorkOuts extends Fragment {
    RCVOnItemClick mCallback;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mCallback=(RCVOnItemClick)activity;
    }
    public FragmentWorkOuts() {
    }

    private List<workOut> createList() {
        List<workOut> result = new ArrayList<>();
        result.add(new workOut(R.drawable.section_week1,"Week1","Full ahead"));
        result.add(new workOut(R.drawable.section_week2,"Week2","Get your skates on"));
        result.add(new workOut(R.drawable.section_week3,"Week3","Full ahead"));
        result.add(new workOut(R.drawable.section_week4,"Week4","Fet your skates on"));
        result.add(new workOut(R.drawable.section_week3,"Week5","Full ahead"));
        result.add(new workOut(R.drawable.section_week4,"Week6","Get your skates on"));
        result.add(new workOut(R.drawable.section_week5,"Week7","Full ahead"));
        result.add(new workOut(R.drawable.section_week3,"Week8","Full ahead"));
//        do size ảnh nặng nên giật thôi.
        //ok cảm ơn nhé
        return result;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fr_workouts, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.cardList);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(FragmentWorkOuts.this.getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        WorkOutsAdapter workOutsAdapter = new WorkOutsAdapter(createList(), getContext());
        recyclerView.setAdapter(workOutsAdapter);
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getActivity(), new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        // TODO Handle item click
                        mCallback.changeViewPagerItem(position);
                    }
                })
        );


        return view;

    }
    public interface RCVOnItemClick{
        public void changeViewPagerItem(int position);
    }


}



