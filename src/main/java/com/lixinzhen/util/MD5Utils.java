package com.lixinzhen.util;

import com.lixinzhen.commom.Constant;
import org.apache.tomcat.util.codec.binary.Base64;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 描述     TODO
 *
 * @author lixinzhen
 * @create 2021/9/15 9:59
 */
public class MD5Utils {
        public static String getMD5Str(String strValue) throws NoSuchAlgorithmException {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            return Base64.encodeBase64String(md5.digest((strValue + Constant.SALT).getBytes()));//采用64位进行转码，并进行第二次salt随机加密
        }
        //测试生成md5的值
//    public static void main(String[] args) {
//        String md5 = null;
//        try {
//            md5 = getMD5Str("1234abcd");
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        }
//        System.out.println(md5);
//    }
}
