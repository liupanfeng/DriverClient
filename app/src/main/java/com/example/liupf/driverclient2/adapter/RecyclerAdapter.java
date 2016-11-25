package com.example.liupf.driverclient2.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.liupf.driverclient2.R;
import com.example.liupf.driverclient2.bean.UserInfo;
import com.example.liupf.driverclient2.viewholder.BaseViewHolder;
import com.example.liupf.driverclient2.viewholder.UserViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liupf on 2016/11/23.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private RecyclerView mRecyclerView;
    private UserViewHolder viewHolder;
    private List<UserInfo> mList=new ArrayList<>();

    public RecyclerAdapter(final Context context, RecyclerView recyclerView,List<UserInfo> list) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
        mRecyclerView = recyclerView;
        mList=list;
//        mHandler = new MyHandler();
    }


    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        view = mLayoutInflater.inflate(R.layout.layout_item_user_info, parent, false);
        viewHolder = new UserViewHolder(view, this);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.bindViewHolder(mContext,mList.get(position));
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
