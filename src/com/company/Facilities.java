package com.company;

import java.util.Scanner;

public class Facilities {
    String facilityname;
    void addfacility()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("lease Enter Facility Name");
        facilityname = input.nextLine();
    }
    void showallfacility()
    {
        System.out.println(facilityname);
    }
}
