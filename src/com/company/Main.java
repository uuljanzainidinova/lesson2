package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(name(generateRandomAge(), 36));
        System.out.println(name(generateRandomAge(), -20));
        System.out.println(name(generateRandomAge(), 1));
        System.out.println(name(generateRandomAge(), 15));
        System.out.println(name(generateRandomAge(), 40));

        generateRandomAge();


    }

    public static String name(int randomAge, int temperature) {
        String result = "";
        if (20 < randomAge && 45 > randomAge && -20 < temperature && 30 > temperature) {

            System.out.println("Можно идти гулять ");

        } else if (randomAge < 20 && 0 < temperature && 28 > temperature) {
            System.out.println("Можно идти гулять");
            System.out.println(randomAge);
        } else if (45 < randomAge && -10 < temperature && temperature < 25) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");
        }


        return result;
    }

public static int generateRandomAge() {
    Random random = new Random();
    int randomAge = random.nextInt(70) + 1;
    System.out.println(randomAge);
    return randomAge;
}
}



