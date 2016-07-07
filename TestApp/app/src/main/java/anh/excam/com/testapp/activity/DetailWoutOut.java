package anh.excam.com.testapp.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import anh.excam.com.testapp.Model.detailworkOut;
import anh.excam.com.testapp.Model.workOut;
import anh.excam.com.testapp.R;
import anh.excam.com.testapp.adapter.CusTomListViewWO;

/**
 * Created by MyPC on 07/07/2016.
 */
public class DetailWoutOut extends AppCompatActivity {
    CusTomListViewWO Adapter;
    ListView listView;
    List<detailworkOut> detailworkOuts;
    workOut workOutsInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_work_out);
        Intent i = getIntent();
        workOutsInfo = (workOut) i.getSerializableExtra("workOutsInfo");
        Log.e("workOutsInfo",workOutsInfo.toString());
        Adapter=new CusTomListViewWO(this,R.layout.list_view_item, (ArrayList<detailworkOut>) createData());
        listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(Adapter);
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
