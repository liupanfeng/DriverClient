package com.example.liupf.driverclient2.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.liupf.driverclient2.R;
import com.example.liupf.driverclient2.adapter.RecyclerAdapter;
import com.example.liupf.driverclient2.bean.UserInfo;

/**
 * Created by liupf on 2016/11/23.
 */
public class UserViewHolder extends BaseViewHolder {

    private TextView tvName;

    public UserViewHolder(View itemView,RecyclerAdapter adapter) {
        super(itemView);
    }

    @Override
    protected void initViewHolder(View itemView, Object... obj) {
        tvName= (TextView) itemView.findViewById(R.id.tv_name);
    }

    @Override
    public void bindViewHolder(Context context, UserInfo info) {
        tvName.setText(info.getName());
    }

    @Override
    public void onHolderRecycled() {

    }
}
