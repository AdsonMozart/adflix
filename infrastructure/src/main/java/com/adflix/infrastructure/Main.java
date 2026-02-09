package com.adflix.infrastructure;

import com.adflix.application.UseCase;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi!");
        System.out.println(new UseCase().execute());
    }

}