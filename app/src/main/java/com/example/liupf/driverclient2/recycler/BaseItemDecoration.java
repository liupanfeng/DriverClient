package com.example.liupf.driverclient2.recycler;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.liupf.driverclient2.adapter.RecyclerAdapter;

/**
 * Created by lpf on 2016/11/25.
 */
public abstract class BaseItemDecoration extends RecyclerView.ItemDecoration {

    protected int mSpace;
    protected RecyclerAdapter mAdapter;

    public BaseItemDecoration(int space, RecyclerAdapter adapter) {
        mSpace = space;
        mAdapter = adapter;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        int position = parent.getChildAdapterPosition(view);
        handleItemOffsets(outRect, view, parent, state, position);
    }

    protected abstract void handleItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state, int position);
}