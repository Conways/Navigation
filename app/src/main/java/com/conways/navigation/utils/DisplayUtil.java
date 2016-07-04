package com.conways.navigation.utils;

import android.content.Context;

/**
 * Created by Conways on 2016/7/4.
 */
public class DisplayUtil {

    public static int Dp2Px(Context context, float dp) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }

    public static int Sp2Px(Context context, float sp) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (sp * fontScale + 0.5f);
    }

}
