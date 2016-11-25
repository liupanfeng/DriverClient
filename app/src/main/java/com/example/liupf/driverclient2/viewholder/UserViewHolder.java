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
    private TextView tvTel;
    private TextView tvFrom;
    private TextView tvTo;

    public UserViewHolder(View itemView,RecyclerAdapter adapter) {
        super(itemView);
    }

    @Override
    protected void initViewHolder(View itemView, Object... obj) {
        tvName= (TextView) itemView.findViewById(R.id.tv_name);
        tvTel= (TextView) itemView.findViewById(R.id.tv_tel);
        tvFrom= (TextView) itemView.findViewById(R.id.tv_from);
        tvTo= (TextView) itemView.findViewById(R.id.tv_to);
    }

    @Override
    public void bindViewHolder(Context context, UserInfo info, View.OnClickListener listener) {
        tvName.setText("name:"+info.getName());
        tvTel.setText("tel:"+info.getTelNumber());
    }

    @Override
    public void onHolderRecycled() {

    }
}
