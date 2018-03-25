package com.classichu.popupwindow.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * Created by louisgeek on 2016/11/16.
 */

public class ScreenUtil {
    /**
     * 获得屏幕宽度
     *
     * @return
     */
    public static int getScreenWidth() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        return displayMetrics.widthPixels;

    }

    /**
     * 获得屏幕高度
     *
     * @return
     */
    public static int getScreenHeight() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        return displayMetrics.heightPixels;
    }


    public static int getStatusBarHeight() {
        int statusBarHeight = 0;
        int resourceId = Resources.getSystem().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            statusBarHeight = Resources.getSystem().getDimensionPixelSize(resourceId);
        }
        return statusBarHeight;
    }

    public static int getNavigationBarHeight() {
        int navigationBarHeight = 0;
        int resourceId = Resources.getSystem().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            navigationBarHeight = Resources.getSystem().getDimensionPixelSize(resourceId);
        }
        return navigationBarHeight;
    }
}
