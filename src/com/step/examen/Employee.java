package com.step.examen;

import java.time.LocalDate;
import java.util.Scanner;

//Informația de gestionat: (Employees: nume, prenume, data nașterii, gen, idnp, salariu, funcția.)
public class Employee {



     String name;
     String surname;
     LocalDate birthday;
     String gender;
     int idnp;
     int salary;
     String function;




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


    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public LocalDate getBirthday(){
        return birthday;
    }

    public String getGender(){
        return gender;
    }

    public int getIDNP(){
        return idnp;
    }

    public int getSalary(){
        return salary;
    }

    public String getFunction(){
        return function;
    }

}
