package edu.wgu.c169;

import java.util.ArrayList;

public class Test {

private int age1 = 44;
private Integer age2 = 33;
private String name = "Jason";
private ArrayList<Integer> ages1 = new ArrayList<>();
private Integer[] ages2;

    public static void main (String[] args){

        Test my_test = new Test();
        System.out.println(my_test.age1);
        System.out.println(my_test.age2);
        my_test.ages1.add(89);
        my_test.ages1.add(99);
        my_test.ages1.add(79);
        System.out.println(my_test.ages1.get(0)+" ");

        for (int i = 0; i < 3; i++){
            System.out.print(my_test.ages1.get(i)+" ");
        }
        System.out.println();
        for (Integer my_age : my_test.ages1){
            System.out.print(my_age+" ");
        }
        System.out.println();
        int i = 0;
        while(i < 3){
            System.out.print(my_test.ages1.get(i)+" ");
            i++;
        }
        System.out.println();
        i = 0;
        do {
            System.out.print(my_test.ages1.get(i)+" ");
            i++;
        } while(i < 3);
        my_test.ages2[1] = 98;

    }
}
