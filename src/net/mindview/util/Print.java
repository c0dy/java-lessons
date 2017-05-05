package net.mindview.util;

import java.io.*;

/**
 * Created by codyy on 10/25/2016.
 */
public class Print {
    public static void print(Object obj) {
        System.out.println(obj);
    }
    public static void print(String s) {
        System.out.println(s);
    }
    public static void printnb(Object obj) {
        System.out.println(obj);
    }
    public static PrintStream
    printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}
