package com.example.liupf.driverclient2.recycler;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.liupf.driverclient2.adapter.RecyclerAdapter;

/**
 * Created by lpf on 2016/11/25.
 */
public class ItemDivideDecoration extends BaseItemDecoration {
    public ItemDivideDecoration(int space, RecyclerAdapter adapter) {
        super(space, adapter);
    }

    @Override
    protected void handleItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state, int position) {
        outRect.top=mSpace;
    }
}
