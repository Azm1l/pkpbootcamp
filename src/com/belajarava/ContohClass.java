package com.belajarava;

public class ContohClass {
    public static void main(String[] args) {
        System.out.println("Hasil " + luasLingkarang(7));


    }

    public static void memahamiString(){
        System.out.println();
    }

    public static double luasLingkarang (int r) {
        double phi = 3.14;
        if ((r % 7) == 0) {
            return (22 * r * r) / 7;
        }
        else {
           return r * r * phi;
        }
    }

    public static Integer perkalianNonPrimitif(Integer a, Integer b) {
        Integer hasil = a * b;
        return hasil;
    }

    public static int perkalian(int a, int b){
        return a * b;
    }
}
