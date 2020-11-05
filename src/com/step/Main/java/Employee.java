package com.step.Main.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//Informația de gestionat: (Employees: nume, prenume, data nașterii, gen, idnp, salariu, funcția.)
public class Employee {



    public static String name;
    public static String surname;
    public static LocalDate birthday;
    public static String gender;
    public static int idnp;
    public static int salary;
    public static String function;


    Employee(String _name, String _surname, LocalDate _birthday, String _gender, int _idnp, int _salary , String _function)
    {
        name=_name;
        surname=_surname;
        birthday=_birthday;
        gender=_gender;
        idnp=_idnp;
        salary=_salary;
        function=_function;
    }


    public void create( )
    {
        EmployeeDataManager employeeDataManager = new EmployeeDataManager();


         String _name;
         String _surname;
         int mounth;
         int year;
         int day;
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
        year=sc.nextInt();
        System.out.println("Enter mouth of birdth:");
        mounth=sc.nextInt();
        System.out.println("Enter day of birdth:");
        day=sc.nextInt();


        System.out.println("Enter gender:");
        _gender=sc.nextLine();

        System.out.println("Enter IDNP:");
        _idnp=sc.nextInt();

        System.out.println("Enter salary:");
        _salary=sc.nextInt();

        System.out.println("Enter function:");
        _function=sc.next();

        System.out.println("\n\n\n*******************************************");

        employeeDataManager.employee.add(employeeDataManager.nrOfEmployee, new Employee(_name,_surname,LocalDate.of (year,mounth,day),_gender,_idnp,_salary,_function));
        employeeDataManager.nrOfEmployee++;
    }

}
