package com.Codegym.week3.vd.StackQueue.Reverse;

import java.util.Scanner;

public class MainString {
    public static void main(String[] args) {
        String test="Improve Employees' Business English Communication Skills As Well As Specialized";
        StackOfString stack= new StackOfString(test.length());

        for (int i = 0; i <test.length() ; i++) {
            stack.push(test.charAt(i));
        }
        String a ="";
//        a+='i';
//        a+='b';

        for (int i = 0; i <test.length() ; i++) {
            a += stack.pop();


        }
        System.out.print(a);


    }

}
