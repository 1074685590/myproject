package com.liumeng.gaobo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.gson.Gson;
import com.liumeng.gaobo.R;
import com.liumeng.gaobo.bean.Student;
import com.liumeng.gaobo.util.PhoneRule;
import com.liumeng.gaobo.util.Util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class MainActivity extends AppCompatActivity {

    EditText mEtPhone;
    private static final String TAG = "MainActivity";
    String mPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEtPhone = (EditText) findViewById(R.id.et_phonenumber);
        Student student = new Student();
        student.name = "张三";
        student.sex="男";
        student.phone = "13127593678";
        String toJson = new Gson().toJson(student);
        mEtPhone.setText(toJson);
    }

    public void gogogo(View view)  {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //协议传输层安全 TLS(transport layer secure)
                    SSLContext sslContext = SSLContext.getInstance("TLS");
                    //创建信任管理器（TrustManager 负责校验证书是否可信）
                    TrustManager[] tm = new TrustManager[]{new EmptyX509TrustManager()};
                    //使用自定义的信任管理器初始化 SSL 上下文对象
                    sslContext.init(null, tm, null);
                    //设置全局的 SSLSocketFactory 工厂（对所有 ssl 链接都产生影响）
//                    HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
                    //URL url = new URL("https://www.baidu.com");
                    URL url = new URL("https://kyfw.12306.cn/otn/");
                    HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
                    InputStream in = conn.getInputStream();
                    System.out.println(Util.inputstream2String(in));
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                } catch (KeyManagementException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

    public void rule(View view) {

        String phoneNumber = mEtPhone.getText().toString();
        PhoneRule phoneRule = new PhoneRule();
        boolean validate = phoneRule.validate(phoneNumber);
        Log.d(TAG, "rule: "+validate);
        mPhone = phoneRule.getPhone(phoneNumber);
        Log.d(TAG, "rule: phone = "+ mPhone);
    }

    public void test(View view) {
//        String text = "链接：https://pan.baidu.com/s/14Ohd4jLuMWLRtqIt6eUNKg\n" +
//                "提取码：5dlw\n" +
//                "复制这段内容后打开百度网盘手机App，操作更方便哦";
//        String str = getLink(text);
//        assertEquals("https://pan.baidu.com/s/14Ohd4jLuMWLRtqIt6eUNKg", str);
        String replace = mEtPhone.getText().toString().replace(mPhone, "131****3678");
        mEtPhone.setText(replace);
    }

    private class EmptyX509TrustManager implements X509TrustManager {
        @Override
        public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {

        }

        @Override
        public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {

        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }

    public static String getLink(String text) {
        Pattern pattern = Pattern.compile("链接：(.*)");
        Matcher m = pattern.matcher(text);
        String str = "";
        if (m.find()) {
            str = m.group(1);
        }
        return str;
    }

    public static String getCode(String text) {
        Pattern pattern = Pattern.compile("提取码：(.*)");
        Matcher m = pattern.matcher(text);
        String str = "";
        if (m.find()) {
            str = m.group(1);
        }
        return str;
    }
}
