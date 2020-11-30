package com.step.examen;

import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        // write your code here
        EmployeeDataManager dataManager = new EmployeeDataManager();
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t******MENU******");
        System.out.println("\t\t 1. Load local");
        System.out.println("\t\t 2. Load from data base");


        switch (sc.next().charAt(0)) {

            case 49: {
                dataManager.loadLocal();

            }
            break;
            case 50: {

                dataManager.loadDB();

            }break;
        }




        System.out.println("\t\t\t******MENU******");
        System.out.println("\t\t 1. Show employee");
        System.out.println("\t\t 2. Enter a new employee");
        System.out.println("\t\t 3. Update employee");
        System.out.println("\t\t 4. Fire someone");
        System.out.println("\t\t 5. EXIT");
        System.out.println("\n\n\t\t\t\t Be careful the program will not detect other entries!");






        while (true) {
            switch (sc.next().charAt(0)) {

                case 49: {
                    dataManager.show();

                }
                break;
                case 50: {

                    dataManager.create();

                }
                break;
                case 51:
                    dataManager.update();
                    break;
                case 52:
                    dataManager.delete();
                    break;
                case 53: {
                    dataManager.save();
                    System.exit(0);
                    }
                break;


            }

        }

    }}