package com.liumeng.gaobo.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by admin on 2017/7/11.
 */

public class PhoneRule extends BaseValidateRule<String> {
    /**
     * 正则表达式：验证手机号
     */
    private final String REGEX_MOBILE  = "^(\\+?\\d{2}-?)?1[3456789]\\d{9}$";
    private final String REGEX_MOBILE2 = "\"((\\+?\\d{2}-?)?1[3456789]\\d{9})\"";
    String p =                           "\"((\\+?\\d{2}-?)?1[3456789]\\d{9})\"";

    public PhoneRule() {
        this.comment = "";
        this.failedHint = "手机号格式错误";
    }

    @Override
    public boolean validate(String data) {
        if (data != null){
            Pattern numPattern =  Pattern.compile(REGEX_MOBILE2);
            if(numPattern.matcher(data).matches()){
                return true;
            } else {
                return false;
            }
        }else {
            return false;
        }
    }

    public String getPhone(String data) {
        Pattern pattern = Pattern.compile(p);
        Matcher m = pattern.matcher(data);
        String str = "";
        if (m.find()) {
            str = m.group(1);
        }
        return str;
    }
}
