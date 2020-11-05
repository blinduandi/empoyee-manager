package com.step.Main.java;
import sun.print.PSPrinterJob;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.text.ParseException;

public class EmployeeDataManager {

    public static int nrOfEmployee=0;
    public static List<Employee> employee = new ArrayList<Employee>();

    public void show( int index)
    {


        if (nrOfEmployee > 0) {


            for (int i = 0; i < nrOfEmployee; i++) {

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
        else System.out.println("You dont have any employee!");

        }






             public void update()
             {





             }



}