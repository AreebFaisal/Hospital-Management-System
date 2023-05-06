package com.company;

import java.util.Scanner;

public class Patient {
    String pid, pname, disease, gender, admit_status;
    int age;
    void addnewpatient()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("lease Enter ID");
        pid = input.nextLine();
        System.out.print("lease Enter Name");
        pname = input.nextLine();
        System.out.print("lease Enter Disease");
        disease = input.nextLine();
        System.out.print("lease Enter Gender");
        gender = input.nextLine();
        System.out.print("lease Enter Admit Status");
        admit_status = input.nextLine();
        System.out.print("lease Enter Age");
        age = input.nextInt();
    }
    void patientinfo()
    {
        System.out.println(pid + "\t" + pname + " \t" + disease + "     \t" + gender  + "      \t" + admit_status + "\t" + age);
    }
}
