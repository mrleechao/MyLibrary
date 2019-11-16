package com.example.mytoast;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by lichao on  2019/11/16
 */
public class ToastUtils {
    /**
     * 吐司
     * @param context
     * @param content
     */
    public static  void ShowHint(Context context,String content){
        Toast.makeText(context, content, Toast.LENGTH_SHORT).show();
    }
}
