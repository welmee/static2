package ru.zelenev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner boys = new Scanner(System.in);
        System.out.print("Колличество мальчиков: ");
        int b  = boys.nextInt();
        Scanner girls = new Scanner(System.in);
        System.out.print("Колличество девочек: ");
        int g  = girls.nextInt();
        teamCount(b, g);

    }
    public static void teamCount(int b, int g){

        if ((b + g) >= 3) {
            int team = (b + g) / 3;
            System.out.print("Общее количество команд сформировано:" + " ");
            System.out.print(team);
        } else {
            System.out.println("Недостаточно людей для формирования команд");
        }

    }
}