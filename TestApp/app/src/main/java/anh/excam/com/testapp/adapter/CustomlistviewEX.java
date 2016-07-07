package anh.excam.com.testapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import anh.excam.com.testapp.Model.exercises;
import anh.excam.com.testapp.R;

/**
 * Created by MyPC on 06/07/2016.
 */
public class CustomlistviewEX extends RecyclerView.Adapter<CustomlistviewEX.ExViewHolder> {
    private List<exercises> exErcises;

    public CustomlistviewEX(List<exercises> workOutsList) {
        this.exErcises = workOutsList;
    }
    @Override
    public ExViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_ex, parent, false);
        return new ExViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(ExViewHolder holder, int position) {
        exercises ex = exErcises.get(position);
        holder.imageView.setImageResource(ex.getBackground());
        holder.textView.setText(ex.getContent());
    }



    @Override
    public int getItemCount() {
        return exErcises.size();
    }
    public class ExViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;

        public ExViewHolder(View itemView) {
            super(itemView);
            textView=(TextView)itemView.findViewById(R.id.title);
            imageView=(ImageView)itemView.findViewById(R.id.background_ex);

        }
    }
}
