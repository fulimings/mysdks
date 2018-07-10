package com.liming.mylibrary;

import android.util.Log;

/**
 * Created by YQ04150 on 2018/7/10 0010.
 */

public class Utils {
    /**
     * 两个整型相加方法
     *
     * @param x 参数1
     * @param y 参数2
     * @return
     */
    public static int add(int x, int y) {
        return x + y;
    }

    /**
     * 日志打印
     * @param TAG   标签
     * @param msg   日志内容
     */

    public static void logs(String TAG, String msg) {
        Log.d(TAG, msg);
    }

}
