package com.udinus.uas_12884_12871_12154_12886;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BestAdaptor extends RecyclerView.Adapter<BestAdaptor.MyViewHolder>{
    ArrayList<BestSeller> appList;

    public BestAdaptor(ArrayList<BestSeller> appList) {
        this.appList = appList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mName,mPrice;
        ImageView mImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mName = itemView.findViewById(R.id.name);
            mPrice = itemView.findViewById(R.id.price);
            mImage = itemView.findViewById(R.id.imagebest);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.best_item,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        BestSeller app = appList.get(position);

        holder.mName.setText(app.getName());
        holder.mPrice.setText("Rp" + app.getPrice());
        holder.mImage.setImageResource(app.getImagebest());
    }

    @Override
    public int getItemCount() {
        return appList.size();
    }
}
