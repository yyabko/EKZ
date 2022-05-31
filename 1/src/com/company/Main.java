package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("ВИБЕРІТЬ КАНАЛ ЗА ДОПОМОГОЮ ПУЛЬТА 0-9:");
        int a = sc1.nextInt();
        if (a == 1){
            System.out.println("1 канал - " + " UA -ПЕРШИЙ");
        }
        else if(a == 2){
            System.out.println("2 канал - " + "ICTV");
        }
        else if(a == 3){
            System.out.println("3 канал - " +"1+1");
        }
        else if(a == 4){
            System.out.println("4 канал - " +"2+2");
        }
        else if(a == 5){
            System.out.println("5 канал - " +"НЛО ТВ");
        }
        else if(a == 6){
            System.out.println("6 канал - " +"НОВИЙ КАНАЛ");
        }
        else if(a == 7){
            System.out.println("7 канал - " +"МАЛЯТКО");
        }
        else if(a == 8){
            System.out.println("8 канал - " +"УКРАЇНА");
        }
        else if(a == 9){
            System.out.println("9 канал - " +"ІНТЕР");
        }
        else System.out.println("ТАКОГО КАНАЛУ НЕ ІСНУЄ");
    }
}