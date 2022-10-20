package com.javabrains.PracticeREST;

public class UserEntity {
    private int id;

    public static void main(String[] args) {
        boolean isTrue;

        if(1>0){
            isTrue=false;
        }

        String dependsOnIsTrue = isTrue ? "nice" :"bad ";
        System.out.println(dependsOnIsTrue);

    }
}
