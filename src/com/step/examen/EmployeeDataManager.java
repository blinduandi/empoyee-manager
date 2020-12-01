package com.step.examen;

import java.io.*;

import java.time.LocalDate;
import java.util.*;

public class EmployeeDataManager {

    public static int nrOfEmployee = 0;
    private List<Employee> employe = new ArrayList<>();


    public void show() {


        for (int i = 0; i < employe.size(); i++) {

            System.out.println("\n\n\n*******************************************");
            System.out.println("/t/t/tAngajatul " + (i + 1));
            System.out.println("Name [" + (i + 1) + "]: " + employe.get(i).getName());
            System.out.println("Surname [" + (i + 1) + "]: " + employe.get(i).getSurname());
            System.out.println("Birthday [" + (i + 1) + "]: " + employe.get(i).getBirthday());
            System.out.println("Gender [" + (i + 1) + "]: " + employe.get(i).getGender());
            System.out.println("IDNP [" + (i + 1) + "]: " + employe.get(i).getIDNP());
            System.out.println("Salary [" + (i + 1) + "]: " + employe.get(i).getSalary());
            System.out.println("Function [" + (i + 1) + "]: " + employe.get(i).getFunction());
            System.out.println("\n\n\n*******************************************");

        }


    }


    public void create() {

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
        _name = sc.nextLine();

        System.out.println("Enter surname:");
        _surname = sc.nextLine();

        System.out.println("Enter year of birdth:");
        _year = sc.nextInt();
        System.out.println("Enter mounth of birdth:");
        _mounth = sc.nextInt();
        System.out.println("Enter day of birdth:");
        _day = sc.nextInt();


        System.out.println("Enter gender:");
        _gender = sc.next();

        System.out.println("Enter IDNP:");
        _idnp = sc.nextInt();

        System.out.println("Enter salary:");
        _salary = sc.nextInt();

        System.out.println("Enter function:");
        _function = sc.next();

        System.out.println("\n\n\n*******************************************");

        employe.add( nrOfEmployee,new Employee(_name, _surname, LocalDate.of(_year, _mounth, _day), _gender, _idnp, _salary, _function));


        nrOfEmployee++;
    }


    public void update() {

        show();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu nr. angajatului pentru care doresti sa il editezi: ");

        int editempl = sc.nextInt();
        String _name = employe.get(editempl - 1).name;
        String _surname = employe.get(editempl - 1).surname;
        int _mounth = employe.get(editempl - 1).birthday.getMonthValue();
        int _year = employe.get(editempl - 1).birthday.getYear();
        int _day = employe.get(editempl - 1).birthday.getDayOfMonth();
        String _gender = employe.get(editempl - 1).gender;
        int _idnp = employe.get(editempl - 1).idnp;
        int _salary = employe.get(editempl - 1).salary;
        String _function = employe.get(editempl - 1).function;

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
                    _name = sc.next();
                    System.out.println("Name has been edited!");

                }
                break;
                case 50: {
                    System.out.println("Enter surname:");
                    _surname = sc.nextLine();
                    System.out.println("Surname has been edited!");
                }

                break;
                case 51: {
                    System.out.println("Enter year of birdth:");
                    _year = sc.nextInt();
                    System.out.println("Enter mounth of birdth:");
                    _mounth = sc.nextInt();
                    System.out.println("Enter day of birdth:");
                    _day = sc.nextInt();
                    System.out.println("Birthday has been edited!");
                }

                break;
                case 52: {
                    System.out.println("Enter gender:");
                    _gender = sc.next();
                    System.out.println("Gender has been edited!");
                }

                break;
                case 53: {
                    System.out.println("Enter IDNP:");
                    _idnp = sc.nextInt();
                    System.out.println("IDNP has been edited!");
                }

                break;
                case 54: {
                    System.out.println("Enter salary:");
                    _salary = sc.nextInt();
                    System.out.println("Salary has been edited!");
                }

                break;
                case 55: {
                    System.out.println("Enter function:");
                    _function = sc.next();
                    System.out.println("Function has been edited!");
                }

                break;
                case 56: {
                    employe.add(editempl - 1, new Employee(_name, _surname, LocalDate.of(_year, _mounth, _day), _gender, _idnp, _salary, _function));
                    employe.remove(editempl);
                    nrOfEmployee++;
                    System.out.println("ALL has been saved!");

                }
                return;

            }
        }

    }


    public void delete() {

        show();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu nr. angajatului pentru al concedia: ");
        int delempl = sc.nextInt();

        employe.remove(delempl - 1);
        System.out.println("Angajatul " + delempl + " a fost concediat!");

    }


    public void save() {


        try {

            FileWriter csvWriter = new FileWriter("save.csv");


            for (int i=0;i<employe.size();i++) {
                csvWriter.append(employe.get(i).getName());
                csvWriter.append(",");
                csvWriter.append(employe.get(i).getSurname());
                csvWriter.append(",");
                csvWriter.append(String.valueOf(employe.get(i).getBirthday().getYear()));
                csvWriter.append(",");
                csvWriter.append(String.valueOf(employe.get(i).getBirthday().getMonthValue()));
                csvWriter.append(",");
                csvWriter.append(String.valueOf(employe.get(i).getBirthday().getDayOfMonth()));
                csvWriter.append(",");
                csvWriter.append(employe.get(i).getGender());
                csvWriter.append(",");
                csvWriter.append(Integer.toString(employe.get(i).getIDNP()));
                csvWriter.append(",");
                csvWriter.append(Integer.toString(employe.get(i).getSalary()));
                csvWriter.append(",");
                csvWriter.append(employe.get(i).getFunction());

                csvWriter.append("\n");
            }

            csvWriter.flush();
            csvWriter.close();


            System.out.println("Successfully saved.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public void saveDB(){


    }



    public void loadLocal(){


        try{
            BufferedReader br = new BufferedReader(new FileReader("save.csv"));
            String line;

            while ((line=br.readLine())!=null){


                String[] values= line.split(",");
                int kontor=0;
                String name = null;
                String surname = null;
                String gender = null;
                int year=1;
                int month=1;
                int day=1;
                int idnp = 0;
                int salary=0;
                String function = null;


                for(int i=0;i<values.length;i++) {

                    switch(kontor)
                    {
                        case 0 :{
                            name = values[i];
                            kontor++;
                        }break;
                        case 1 :{
                            surname = values[i];
                            kontor++;
                        }break;
                        case 2 :{
                            year = Integer.parseInt(values[i]);
                            kontor++;
                        }break;
                        case 3 :{
                            month = Integer.parseInt(values[i]);
                            kontor++;
                        }break;
                        case 4 :{
                            day = Integer.parseInt(values[i]);
                            kontor++;
                        }break;
                        case 5 :{
                            gender = values[i];
                            kontor++;
                        }break;
                        case 6 :{
                            idnp = Integer.parseInt(values[i]);
                            kontor++;
                        }break;
                        case 7 :{
                        salary = Integer.parseInt(values[i]);
                        kontor++;
                    }break;
                        case 8 :{
                            function = values[i];
                            kontor=0;
                        }break;

                    }



                 }

                employe.add( new Employee(name, surname, LocalDate.of(year,month,day) , gender, idnp, salary, function));







            }
            br.close();

        }

        catch (Exception e) {
            e.printStackTrace();
        }




    }

    public void loadDB(){

    }



}