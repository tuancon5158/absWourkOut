package anh.excam.com.testapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import anh.excam.com.testapp.R;
import anh.excam.com.testapp.Model.workOut;

/**
 * Created by Anh on 7/4/2016.
 */
public class WorkOutsAdapter extends RecyclerView.Adapter<WorkOutsAdapter.WorkOutsViewHolder> {

    private List<workOut> workOutsInfoList;
    private Context context;

    public WorkOutsAdapter(List<workOut> workOutsList, Context context) {
        this.workOutsInfoList = workOutsList;
        this.context = context;
    }

    @Override
    public WorkOutsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        return new WorkOutsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(WorkOutsViewHolder holder, final int position) {
        final workOut workOutsInfo = workOutsInfoList.get(position);
        holder.title.setText(workOutsInfo.getWeek());
        holder.week.setText(workOutsInfo.getTitle());
        holder.layout.setBackgroundResource(workOutsInfo.getBackground());
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.e("Click", "item " + position);
//                Intent i = new Intent(context, TestActivity.class);
//                i.putExtra("workOutsInfo", workOutsInfo);
//                context.startActivity(i);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return workOutsInfoList.size();
    }

    public class WorkOutsViewHolder extends RecyclerView.ViewHolder {
        protected TextView title, week;
        private RelativeLayout layout;

        public WorkOutsViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            week = (TextView) itemView.findViewById(R.id.week);
            layout = (RelativeLayout) itemView.findViewById(R.id.image);
        }
    }


}

