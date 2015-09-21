package com.xuyongjin.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by 许勇进 on 2015-9-18.
 */
public class WhoAmI {
    public static void main(String[] args) throws UnknownHostException {
        /*System.out.println(args.length);
        if (args.length != 1) {
            System.err.println("Usage: WhoAmI MachineName");
            System.exit(1);
        }*/
        InetAddress a = InetAddress.getByName("Yongjin_Note");
        System.out.println(a);
    }
}
