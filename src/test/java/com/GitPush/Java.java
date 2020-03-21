package com.GitPush;

public class Java {
    public static void main(String[] args) {
        String str="selenium";
        String reverse="";
        for (int i=str.length()-1; i>=0; i--){
            reverse+=str.substring(i,i+1);
        }
        System.out.println("reverse = " + reverse);
        System.out.println("hello world");
        System.out.println("selenium");
        System.out.println("cucumber"); //line13
    }
}
