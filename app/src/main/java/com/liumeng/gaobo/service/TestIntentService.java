package com.liumeng.gaobo.service;

import android.app.AlertDialog;
import android.app.IntentService;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.view.WindowManager;

import com.liumeng.gaobo.R;

/**
 * Created by liumeng on 2020/11/17 0017.
 * Describe:
 */
public class TestIntentService extends IntentService {


    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public TestIntentService(String name) {
        super(name);
    }

    public TestIntentService(){
        super("intentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        new Handler(getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder dialog = new AlertDialog.Builder(getApplicationContext());
                dialog.setIcon(R.mipmap.ic_launcher_round);
                dialog.setTitle("普通 AlertDialog");
                dialog.setMessage("Dialog对话框之：\n AlertDialog");
                dialog.setCancelable(false);    //设置是否可以通过点击对话框外区域或者返回按键关闭对话框

                dialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(DialogActivity.this, "确定", Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(DialogActivity.this, "取消", Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog alertDialog = dialog.create();
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){//6.0 　　　　　　
                    alertDialog.getWindow().setType(WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY);
                }else {
                    alertDialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
                }
                alertDialog.show();
            }
        });
    }
}
