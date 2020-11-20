package com.liumeng.gaobo.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.liumeng.gaobo.R;
import com.liumeng.gaobo.service.TestIntentService;

public class HandlerActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 100;
    Handler mHandler;
    private static final String TAG = "HandlerActivity";
    Handler mHandler2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);
        init();
//        new HashMap<>()
    }

    private void init() {
        //        method1();

        method2();
    }

    private void method2() {
        //动态申请权限
        Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION);
        intent.setData(Uri.parse("package:" + getPackageName()));
        startActivityForResult(intent, REQUEST_CODE);

        HandlerThread handlerThread = new HandlerThread("handlerThread线程");
        handlerThread.start();
        mHandler2 = new Handler(handlerThread.getLooper()) {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                Log.d(TAG, "handleMessage: 线程名" + Thread.currentThread().getName());
            }
        };
    }

    private void method1() {
        initHandler();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Message message = new Message();
                message.arg1 = 1;
                message.arg2 = 2;
                Bundle bundle = new Bundle();
                bundle.putString("key", "value");
                bundle.putChar("k", 'v');
                message.setData(bundle);
                mHandler.sendMessage(message);
            }
        }).start();
    }

    private void initHandler() {
        mHandler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                int arg1 = msg.arg1;
                int arg2 = msg.arg2;
                char aChar = msg.getData().getChar("k");
                String string = msg.getData().getString("key");
                Log.d(TAG, "handleMessage: " + arg1 + arg2 + aChar + string);
            }
        };
    }

    public void btnHandlerThread(View view) {
        mHandler2.sendEmptyMessage(0);
    }

    public void btnIntentService(View view) {
        startService(new Intent(this, TestIntentService.class));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if (Settings.canDrawOverlays(this)) {
                    Log.i("xqxinfo", "onActivityResult granted");
                }
            }
        }
    }


}
