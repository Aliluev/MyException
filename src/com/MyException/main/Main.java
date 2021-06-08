package com.MyException.main;

public class Main {
    static int a=4;
    static int b=0;
    public static int del(int a,int b){
        try {
            return (a / b);
        }catch (Exception e){
           System.out.println("privet oshibka");
        }finally {
            System.out.println("interesno");
        }
      return a;
    }
    public static void main(String[] args)throws Exception{
        System.out.println(del(a,b));
        if(a>b){
            throw new Exception("MyException");
        }else throw new Exception("NoMyException");
        //System.out.println(del(a,b));
    }
}
