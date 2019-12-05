package com.ecjtu.tool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *
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

            long temp = Long.parseLong( ips[i] ) << 8 * i;
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
            Long temp = ip & 0x000000FF;
            ip = ip >> 8;
            str[i] = String.valueOf( temp );
        }
        List<String> strings = new ArrayList<>( Arrays.asList( str ) );
        return String.join( ".", strings );

    }

    public static void main (String[] args) {
        String ip = "192.168.55.40";
        String s = longToIp( ipToLong( ip ) );
        System.out.println( s.equals( ip ) );

    }
}
