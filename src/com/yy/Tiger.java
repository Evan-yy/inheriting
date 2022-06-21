package com.yy;

public class Tiger extends Felidae{
    public Tiger(int age, int weight) {
        super(age, weight);
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger(5,60);
        tiger.running();
        tiger.eating();
        tiger.behavior();
    }
}
