package com.example.liupf.driverclient2.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.liupf.driverclient2.bean.UserInfo;

/**
 * Created by liupf on 2016/11/23.
 */
public abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    protected int mScreenWidth;

    public BaseViewHolder(View itemView,Object... obj) {
        super(itemView);
        mScreenWidth = itemView.getContext().getResources().getDisplayMetrics().widthPixels;
        initViewHolder(itemView, obj);
    }

    /**
     * 初始化ViewHolder布局元素
     *
     * @param itemView
     * @param obj
     */
    protected abstract void initViewHolder(View itemView, Object... obj);

    /**
     * 绑定Viewholder数据
     *
     * @param context
     * @param info
     */
    public abstract void bindViewHolder(Context context, UserInfo info, View.OnClickListener listener);

    /**
     * 处理Viewholder复用
     */
    public abstract void onHolderRecycled();


}
