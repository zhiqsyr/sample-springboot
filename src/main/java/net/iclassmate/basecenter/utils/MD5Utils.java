package net.iclassmate.basecenter.utils;

import java.security.MessageDigest;
import java.util.Arrays;

/**
 * @author zhiqsyr
 * @since 2017/5/11
 */
public class MD5Utils {

    public static String encode(String src) {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            return Arrays.toString(digest.digest(src.getBytes("UTF-8")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
