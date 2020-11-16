package com.step.examen;

import java.time.LocalDate;
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




    Employee(String name, String surname, LocalDate birthday, String gender, int idnp, int salary , String function)
    {
        this.name=name;
        this.surname=surname;
        this.birthday=birthday;
        this.gender=gender;
        this.idnp=idnp;
        this.salary=salary;
        this.function=function;
    }




}
