package com.udinus.uas_12884_12871_12154_12886;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.udinus.uas_12884_12871_12154_12886.views.ShopActivity;

import java.util.ArrayList;
import java.util.List;

public class Fragment_Home extends Fragment {
    RecyclerView mList1,mList2;
    List<com.udinus.uas_12884_12871_12154_12886.BestSeller> appList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment__home, container, false);

        CardView button = (CardView) view.findViewById(R.id.cardvoucher);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Diskon.class);
                startActivity(intent);
            }
        });

        CardView btn = (CardView) view.findViewById(R.id.payment);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AccountActivity.class);
                startActivity(intent);
            }
        });

        CardView btnshop = (CardView) view.findViewById(R.id.shop);
        btnshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ShopActivity.class);
                startActivity(intent);
            }
        });

        mList1 = view.findViewById(R.id.list1);
        appList = new ArrayList<>();

        appList.add(new BestSeller(R.drawable.book11,"When The World Was Ours",400000));
        appList.add(new BestSeller(R.drawable.book12,"Solar Bones",300000));
        appList.add(new BestSeller(R.drawable.book3,"Secret Sky",400000));
        appList.add(new BestSeller(R.drawable.book6,"Harry Potter",330000));
        appList.add(new BestSeller(R.drawable.book9,"The Star And I",250000));
        appList.add(new BestSeller(R.drawable.book7,"The Story Behind",450000));

        LinearLayoutManager manager1 = new LinearLayoutManager(getContext());
        manager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        mList1.setLayoutManager(manager1);

        mList1.setAdapter(new BestAdaptor((ArrayList<BestSeller>) appList));

        return view;
    }

}
