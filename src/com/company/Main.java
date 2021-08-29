package com.company;

public class Main {

    public static void main(String[] args) {
        int age = 27;
        int temperature = 30;
        System.out.println(name(23, 36));
        System.out.println(name(2, -20));
        System.out.println(name(67, 1));
        System.out.println(name(8, 15));
        System.out.println(name(38, 40));


    }

    public static String name(int age, int temperature) {
        String result = "";
        if (20 < age && 45 < age && -20 < temperature && 30 < temperature) {

            System.out.println("Можно идти гулять ");

        } else if (age < 20 && 0 < temperature && 28 < temperature) {
            System.out.println("Можно идти гулять");
        } else if (45 < age && -10 < temperature && temperature < 25) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");
        }


        return result;
    }


}



