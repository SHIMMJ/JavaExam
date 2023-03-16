package com.simminjeong.praticeex.exam13;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

         Slime slime = new Slime();
         Monster monster = new Slime();
         slime.run();
         monster.run();


        X obj = new A();
        obj.a();
        // obj.b();
        // obj.c();
        //
        Y y1 = new A();
        Y y2 = new B();
        y1.a();
        y2.a();



        ArrayList <Y> al = new ArrayList<>();
        al.add(new A());
        al.add(new B());

        for (int i=0;i<al.size();i++) {
            al.get(i).b();
        }
        
        

    }

}
