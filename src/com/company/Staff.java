package com.company;

import java.util.Scanner;

public class Staff {
    String sid, sname, desg, gender;
    int salary;
    void addnewstaff()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("  lease Enter Staff ID");
        sid = input.nextLine();
        System.out.print("lease Enter Name");
        sname = input.nextLine();
        System.out.print("lease Enter Designation");
        desg = input.nextLine();
        System.out.print("lease Enter Gender");
        gender = input.nextLine();
        System.out.print("lease Enter Salary");
        salary = input.nextInt();
    }
    void searchstaff(){

    }
    void deletestaff(){

    }
    void editstaff(){

    }
    void viewstaff()
    {
        System.out.println(sid + "\t" + sname + "\t" + gender + "\t" + salary);
    }
}
