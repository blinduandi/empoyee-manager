package com.step.examen;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Scanner;

public class EmployeeDataManager {

    public static int nrOfEmployee=0;
    private ArrayList<Employee> employee = new ArrayList<Employee>();


    public void show( )
    {





            for (int i = 0; i < employee.size(); i++) {

                System.out.println("\n\n\n*******************************************");
                System.out.println("/t/t/tAngajatul " + (i + 1));
                System.out.println("Name [" + (i + 1) + "]: " + employee.get(i).name);
                System.out.println("Surname [" + (i + 1) + "]: " + employee.get(i).surname);
                System.out.println("Birthday [" + (i + 1) + "]: " + employee.get(i).birthday);
                System.out.println("Gender [" + (i + 1) + "]: " + employee.get(i).gender);
                System.out.println("IDNP [" + (i + 1) + "]: " + employee.get(i).idnp);
                System.out.println("Salary [" + (i + 1) + "]: " + employee.get(i).salary);
                System.out.println("Function [" + (i + 1) + "]: " + employee.get(i).function);
                System.out.println("\n\n\n*******************************************");

            }


        }


    public void create( )
    {

        String _name;
        String _surname;
        int _mounth;
        int _year;
        int _day;
        String _gender;
        int _idnp;
        int _salary;
        String _function;


        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n*******************************************");
        System.out.println("Enter name:");
        _name=sc.nextLine();

        System.out.println("Enter surname:");
        _surname=sc.nextLine();

        System.out.println("Enter year of birdth:");
        _year=sc.nextInt();
        System.out.println("Enter mounth of birdth:");
        _mounth=sc.nextInt();
        System.out.println("Enter day of birdth:");
        _day=sc.nextInt();


        System.out.println("Enter gender:");
        _gender=sc.next();

        System.out.println("Enter IDNP:");
        _idnp=sc.nextInt();

        System.out.println("Enter salary:");
        _salary=sc.nextInt();

        System.out.println("Enter function:");
        _function=sc.next();

        System.out.println("\n\n\n*******************************************");

        employee.add(new Employee(_name,_surname, LocalDate.of (_year,_mounth,_day),_gender,_idnp,_salary,_function));
        nrOfEmployee++;
    }





             public void update()
             {

                 show();
                 Scanner sc = new Scanner(System.in);
                 System.out.println("Introdu nr. angajatului pentru care doresti sa il editezi: ");

                 int editempl=sc.nextInt();
                 String _name=employee.get(editempl-1).name;
                 String _surname=employee.get(editempl-1).surname;
                 int _mounth=employee.get(editempl-1).birthday.getMonthValue();
                 int _year=employee.get(editempl-1).birthday.getYear();
                 int _day=employee.get(editempl-1).birthday.getDayOfMonth();
                 String _gender=employee.get(editempl-1).gender;
                 int _idnp=employee.get(editempl-1).idnp;
                 int _salary=employee.get(editempl-1).salary;
                 String _function=employee.get(editempl-1).function;

                 System.out.println("\t\t\t******Edit******");
                 System.out.println("\t\t 1. Edit name");
                 System.out.println("\t\t 2. Edit surname");
                 System.out.println("\t\t 3. Edit birthday");
                 System.out.println("\t\t 4. Edit gender");
                 System.out.println("\t\t 5. Edit IDNP");
                 System.out.println("\t\t 6. Edit salary");
                 System.out.println("\t\t 7. Edit function");
                 System.out.println("\t\t 8. SAVE AND EXIT");
                 System.out.println("\n\n\t\t\t\t Be careful the program will not detect other entries!");

while (true) {
    switch (sc.next().charAt(0)) {

        case 49: {
            System.out.println("Enter name:");
            _name=sc.nextLine();

        }
        
        break;
        case 50: {
            System.out.println("Enter surname:");
            _surname=sc.nextLine();
        }

        break;
        case 51: {
            System.out.println("Enter year of birdth:");
            _year=sc.nextInt();
            System.out.println("Enter mounth of birdth:");
            _mounth=sc.nextInt();
            System.out.println("Enter day of birdth:");
            _day=sc.nextInt();
        }

        break;
        case 52: {
            System.out.println("Enter gender:");
            _gender=sc.next();
        }

        break;
        case 53: {
            System.out.println("Enter IDNP:");
            _idnp=sc.nextInt();
        }

        break;
        case 54: {
            System.out.println("Enter salary:");
            _salary=sc.nextInt();
        }

        break;
        case 55: {
            System.out.println("Enter function:");
            _function=sc.next();
        }

        break;
        case 56: {
            employee.add(editempl-1, new Employee(_name,_surname, LocalDate.of (_year,_mounth,_day),_gender,_idnp,_salary,_function));
            employee.remove(editempl);
            nrOfEmployee++;

        }return;

    }
}

             }


             public void delete()
             {

                 show();
                 Scanner sc = new Scanner(System.in);
                 System.out.println("Introdu nr. angajatului pentru al concedia: ");
                 int delempl=sc.nextInt();

                 employee.remove(delempl-1);
                 System.out.println("Angajatul "+delempl+" a fost concediat!");

             }


}