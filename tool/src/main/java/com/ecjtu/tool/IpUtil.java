package com.ecjtu.tool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * ip转换为long类型的数字
 * long数字转换为ip
 * 方法一一对应
 * 参考：Java 位运算(移位、位与、或、异或、非）
 * （https://blog.csdn.net/xiaochunyong/article/details/7748713）
 * </p>
 *
 * @author xiexiang
 * @date 2019/12/05 11:01:23
 */
public class IpUtil {
    /**
     * ip to long
     *
     * @param strIp ipv4地址
     * @return {@link long}
     */
    public static long ipToLong (String strIp) {
        //分割
        String[] ips = strIp.split( "\\." );
        long result = 0;
        for (int i = 0; i < ips.length; i++) {
            //左移8*i位
            long temp = Long.parseLong( ips[i] ) << 8 * i;
            //进行"位或运算"
            result = result | temp;
        }
        return result;
    }

    /**
     * long to ip
     *
     * @param ip 长整型ip
     * @return {@link String} ipv4地址
     */
    public static String longToIp (long ip) {
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            //进行"位与运算" 0x000000FF=255
            Long temp = ip & 0x000000FF;
            //每次右移8位
            ip = ip >> 8;
            str[i] = String.valueOf( temp );
        }
        List<String> strings = new ArrayList<>( Arrays.asList( str ) );
        return String.join( ".", strings );

    }
}
