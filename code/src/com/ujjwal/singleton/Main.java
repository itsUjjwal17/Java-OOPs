package com.ujjwal.singleton;

import com.ujjwal.access.A;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

        // all 3 ref variables are pointing to just one object

        A a = new A(10, "Ujjwal");
        a.getNum();
//        int n = a.num;
    }
}
