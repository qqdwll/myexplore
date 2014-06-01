package com.explore.supertest;

/**
 * Created by colin on 14-6-1.
 */
public class ImplementB extends SuperA{


    @Override
    public void a(){
        System.out.println("ImplementB.a");
             super.a();
    }

    /**
     * if this method override super class. Then this method will invoke.
     * @param args
     */
//    @Override
//    public void b() {
//        System.out.println("ImplementB.b");
//        super.b();
//    }

    public static void main(String[] args) {
       ImplementB b  = new ImplementB();
               b.a();

    }
}
