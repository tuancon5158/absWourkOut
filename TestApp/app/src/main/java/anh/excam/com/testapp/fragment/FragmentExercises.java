package anh.excam.com.testapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import anh.excam.com.testapp.Model.exercises;

import java.util.ArrayList;
import java.util.List;

import anh.excam.com.testapp.R;
import anh.excam.com.testapp.Support.HelpUser;
import anh.excam.com.testapp.adapter.CustomlistviewEX;

/**
 * Created by Anh on 5/14/2016.
 */
public class FragmentExercises extends Fragment {

    CustomlistviewEX customlistviewEX;
    ListView listView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fr_exercises, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.exercises);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(FragmentExercises.this.getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        customlistviewEX = new CustomlistviewEX(createData());

        recyclerView.setAdapter(customlistviewEX);
        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(HelpUser.LOG_TAG,"vào rồi");
            }
        });

        return view;
    }

    private List<exercises> createData() {
        List<exercises>exercises= new ArrayList<>();
        exercises.add(new exercises(R.drawable.rest,"Rest"));
        exercises.add(new exercises(R.drawable.balljack,"Ball Crunch"));
        exercises.add(new exercises(R.drawable.banhcruchlegs,"Ball Crunch(Legs on ball)"));
        exercises.add(new exercises(R.drawable.ballhype,"Ball Hyperextension"));
        exercises.add(new exercises(R.drawable.ballab,"Ball Ab-rollout"));
        exercises.add(new exercises(R.drawable.abwheel,"Ab wheel roll-out"));
        exercises.add(new exercises(R.drawable.onkness,"Ab wheel roll-out(on kness)"));
        exercises.add(new exercises(R.drawable.leftknee,"Ab wheel roll-out(left kness)"));
        exercises.add(new exercises(R.drawable.rightknee,"Ab wheel roll-out(right-kness)"));
        return exercises;
    }


}
