package com.mabel;

import com.mabel.common.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @project: JavaLearning
 * @description:
 * @author: Mabel.Chen
 * @create: 2019-12-20 22:17
 **/
public class Main {

<<<<<<< HEAD
    private int[] items;

    public Main(int capacity) {
        items = new int[capacity];
    }

    public static String test() {
        try {
            int i = 1 / 0;
            System.out.println("I am in the try block");
            return "try block";
        } catch (Exception exception) {
            System.out.println("I am in the catch block");
            return "return block";
        } finally {
            System.out.println("I am in the finally block");
            return "finally block";
        }
        // 下面这行代码编译不通过
        //return "out of try/catch/finally";
    }

    public static void main(String[] args) {

=======
    public static void main(String[] args) {
>>>>>>> 4a794002ddc2b1c55c08948967269211d757b8ea
    }
}