package com.company;

import java.util.Scanner;

public class First {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("1.Default Clock\n" + "2.Time");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                ClockDisplay clock = new ClockDisplay();
                while (true) {
                    System.out.println(clock.getTime());
                    clock.timeTick();
                    Thread.sleep(1000);
                }
            case 2:
                int hour = scanner.nextInt();
                int min = scanner.nextInt();
                int sec = scanner.nextInt();
                ClockDisplay perSetClock = new ClockDisplay(hour, min, sec);
                while (true) {
                    System.out.println(perSetClock.getTime());
                    perSetClock.timeTick();
                    Thread.sleep(1000);
                }
        }
    }
}
