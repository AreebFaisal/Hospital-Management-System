package com.company;

import java.util.Scanner;

public class Lab {
    String facilityname;
    int labcost;
    void addnewfacility()
    {
        Scanner input = new Scanner(System.in);
        System.out.print(" lease Enter Facility Name");
        facilityname = input.nextLine();
        System.out.print("lease Enter Cost");
        labcost = input.nextInt();
    }
    void showlab()
    {
        System.out.println(facilityname + "\t\t" + labcost);
    }
}
