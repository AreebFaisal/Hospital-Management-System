package com.company;

import java.util.Scanner;

public class Doctor {
    String did, dname, specialist, appoint, qualification;
    int room;
    void addnewdoctor()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("lease Enter Doctor ID");
        did = input.nextLine();
        System.out.print("lease Enter Name");
        dname = input.nextLine();
        System.out.print("lease Enter Specialization");
        specialist = input.nextLine();
        System.out.print("lease Enter Work time");
        appoint = input.nextLine();
        System.out.print("lease Enter Qualification");
        qualification = input.nextLine();
        System.out.print("lease Enter Room no.");
        room = input.nextInt();
    }
    void doctorinfo()
    {
        System.out.println(did + "\t" + dname + "  \t" + specialist + "     \t" + appoint + "    \t" + qualification + "       \t" + room);
    }
}
