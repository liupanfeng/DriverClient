package com.example.liupf.driverclient2.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.liupf.driverclient2.R;
import com.example.liupf.driverclient2.activity.ResultActivity;
import com.example.liupf.driverclient2.adapter.RecyclerAdapter;
import com.example.liupf.driverclient2.bean.AnimationUtil;
import com.example.liupf.driverclient2.bean.UserInfo;
import com.example.liupf.driverclient2.recycler.ItemDivideDecoration;

import java.util.ArrayList;
import java.util.List;

public class ShowUserActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_lock_user;
    private RecyclerView recycler;
    private RecyclerAdapter mAdapter;
    private List<UserInfo> mList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_user);
        recycler=(RecyclerView)findViewById(R.id.recycler);
        UserInfo userInfo=new UserInfo();
        userInfo.setName("lpf");
        userInfo.setTelNumber("18810765302");
        mList.add(userInfo);

        userInfo=new UserInfo();
        userInfo.setName("zxw");
        userInfo.setTelNumber("18810765303");
        mList.add(userInfo);

        userInfo=new UserInfo();
        userInfo.setName("yp");
        userInfo.setTelNumber("18810765303");
        mList.add(userInfo);

        mAdapter=new RecyclerAdapter(this,recycler,mList);

        recycler.setAdapter(mAdapter);
        recycler.addItemDecoration(new ItemDivideDecoration(AnimationUtil.dip2px(this, 7), mAdapter));
        recycler.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(this, ResultActivity.class));
    }
}
