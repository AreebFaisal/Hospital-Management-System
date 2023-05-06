package com.company;

import java.util.Scanner;

public class Medical {
    String medname, medcomp, expdate;
    int cost, quantity;
    void addnewmedicine()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("lease Enter Name");
        medname = input.nextLine();
        System.out.print("lease Enter Composition");
        medcomp = input.nextLine();
        System.out.print("lease Enter Exp Date");
        expdate = input.nextLine();
        System.out.print("lease Enter Cost");
        cost = input.nextInt();
        System.out.print("lease Enter quantity");
        quantity = input.nextInt();
    }
    void medicineinfo()
    {
        System.out.println(medname + "  \t" + medcomp + "    \t" + expdate + "     \t" + cost+ "     \t"+quantity);
    }
}
