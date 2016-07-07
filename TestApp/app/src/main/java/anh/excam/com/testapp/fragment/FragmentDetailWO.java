package anh.excam.com.testapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import anh.excam.com.testapp.Model.detailworkOut;
import anh.excam.com.testapp.R;
import anh.excam.com.testapp.adapter.CusTomListViewWO;

/**
 * Created by MyPC on 07/07/2016.
 */
public class FragmentDetailWO extends Fragment {
    CusTomListViewWO adapter;
    ListView listView;
    List<detailworkOut>detailworkOuts;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.detail_work_out, container, false);
        adapter=new CusTomListViewWO(getActivity(),R.layout.list_view_item, (ArrayList<detailworkOut>) createData());
        listView=(ListView)view.findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        Log.e("tuan","con");
        return  view;

    }
    private List<detailworkOut> createData() {
        List<detailworkOut> detailworkOuts= new ArrayList<>();
        detailworkOuts.add(new detailworkOut("Monday","1 Round ","Sit up"));
        detailworkOuts.add(new detailworkOut("Tuesday","1 Round ","Sit up"));
        detailworkOuts.add(new detailworkOut("Wednesday","1 Round ","Sit up"));
        detailworkOuts.add(new detailworkOut("Thursday","1 Round ","Sit up"));
        detailworkOuts.add(new detailworkOut("Friday","1 Round ","Sit up"));
        detailworkOuts.add(new detailworkOut("Saturday","1 Round ","Sit up"));
        detailworkOuts.add(new detailworkOut("Sunday","2 Round ","Sit up"));
        detailworkOuts.add(new detailworkOut("Bonus 1: Bubble","2 Round ","Sit up"));
        detailworkOuts.add(new detailworkOut("Bonus 2: Jakie","2 Round ","Sit up"));
        detailworkOuts.add(new detailworkOut("Bonus 1: Bull","2 Round ","Sit up"));
        return detailworkOuts;
    }
}
