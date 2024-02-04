package com.javabrains.PracticeREST;

public class UserEntity {
    private int id;

    public static void main(String[] args) {
        boolean isTrue;

        if(1>0){
            isTrue=true;
        }

        String dependsOnIsTrue = isTrue ? "nice" :"bad ";
        System.out.println(dependsOnIsTrue);

    }

    public void helloWorld(){

        System.out.println("Hello World");
    }

    public void add(int n1, int n2){
        System.out.println(n1+n2);
    }
}
