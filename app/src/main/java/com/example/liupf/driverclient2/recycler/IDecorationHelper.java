package com.example.liupf.driverclient2.recycler;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by lpf on 2016/11/25.
 */
public interface IDecorationHelper {
    void handleItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state, int position);
}
