package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Welcome to Hospital Management System ***");
        System.out.println("--------------------------------------------------------------------------------");
        Doctor[] d = new Doctor[25];
        Patient[] p = new Patient[100];
        Lab[] l = new Lab[20];
        Facilities[] f = new Facilities[20];
        Medical[] m = new Medical[100];
        Staff[] s = new Staff[100];
        int i;
        for (i = 0; i < 25; i++)
            d[i] = new Doctor();
        for (i = 0; i < 100; i++)
            p[i] = new Patient();
        for (i = 0; i < 20; i++)
            l[i] = new Lab();
        for (i = 0; i < 20; i++)
            f[i] = new Facilities();
        for (i = 0; i < 100; i++)
            m[i] = new Medical();
        for (i = 0; i < 100; i++)
            s[i] = new Staff();

        d[0].did = "21";
        d[0].dname = "Dr.Ghanendra";
        d[0].specialist = "ENT";
        d[0].appoint = "5-11AM";
        d[0].qualification = "MBBS,MD";
        d[0].room = 17;
        d[1].did = "32";
        d[1].dname = "Dr.Vikram";
        d[1].specialist = "Physician";
        d[1].appoint = "10-3AM";
        d[1].qualification = "MBBS,MD";
        d[1].room = 45;
        d[2].did = "17";
        d[2].dname = "Dr.Rekha";
        d[2].specialist = "Surgeon";
        d[2].appoint = "8-2AM";
        d[2].qualification = "BDM";
        d[2].room = 8;
        d[3].did = "33";
        d[3].dname = "Dr.Pramod";
        d[3].specialist = "Artho";
        d[3].appoint = "10-4PM";
        d[3].qualification = "MBBS,MS";
        d[3].room = 40;

        p[0].pid = "12";
        p[0].pname = "Pankaj";
        p[0].disease = "Cancer";
        p[0].gender = "Male";
        p[0].admit_status = "y";
        p[0].age = 30;
        p[1].pid = "13";
        p[1].pname = "Sumit";
        p[1].disease = "Cold";
        p[1].gender = "Male";
        p[1].admit_status = "y";
        p[1].age = 23;
        p[2].pid = "14";
        p[2].pname = "Alok";
        p[2].disease = "Maleriya";
        p[2].gender = "Male";
        p[2].admit_status = "y";
        p[2].age = 45;
        p[3].pid = "15";
        p[3].pname = "Ravi";
        p[3].disease = "Diabetes";
        p[3].gender = "Male";
        p[3].admit_status = "y";
        p[3].age = 25;

        m[0].medname = "Corex";
        m[0].medcomp = "Cino pvt";
        m[0].expdate = "9-5-16";
        m[0].cost = 55;
        m[0].quantity = 8;
        m[1].medname = "Nytra";
        m[1].medcomp = "Ace pvt";
        m[1].expdate = "4-4-15";
        m[1].cost = 500;
        m[1].quantity = 5;
        m[2].medname = "Brufa";
        m[2].medcomp = "Reckitt";
        m[2].expdate = "12-7-17";
        m[2].cost = 50;
        m[2].quantity = 56;
        m[3].medname = "Pride";
        m[3].medcomp = "DDF pvt";
        m[3].expdate = "12-4-12";
        m[3].cost = 1100;
        m[3].quantity = 100;

        l[0].facilityname = "X-ray     ";
        l[0].labcost = 800;
        l[1].facilityname = "CT Scan   ";
        l[1].labcost = 1200;
        l[2].facilityname = "OR Scan   ";
        l[2].labcost = 500;
        l[3].facilityname = "Blood Bank";
        l[3].labcost = 50;

        f[0].facilityname = "Ambulance";
        f[1].facilityname = "Admit Facility ";
        f[2].facilityname = "Canteen";
        f[3].facilityname = "Emergency";

        s[0].sid = "22";
        s[0].sname = "Prakash";
        s[0].desg = "Worker";
        s[0].gender = "Male";
        s[0].salary = 5000;
        s[1].sid = "23";
        s[1].sname = "Komal";
        s[1].desg = "Nurse";
        s[1].gender = "Female";
        s[1].salary = 2000;
        s[2].sid = "24";
        s[2].sname = "Raju";
        s[2].desg = "Worker";
        s[2].gender = "Male";
        s[2].salary = 5000;
        s[3].sid = "25";
        s[3].sname = "Rani";
        s[3].desg = "Nurse";
        s[3].gender = "Female";
        s[3].salary = 20000;

        Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
        while (status == 1)
        {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Doctors  2. Patients  3.Medicines  4.Laboratories  5. Facilities  6. Staff ");
            System.out.println("-----------------------------------------------------------------------------------");
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                      **DOCTOR SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s1 = 1;
                    while (s1 == 1)
                    {
                        System.out.println("1.Add New Entry\n2.Edit Entry\n3.Delete Entry\n4.Search Entry\n5.Existing Doctors List\n");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                            {
                                d[count1].addnewdoctor();count1++;
                                break;
                            }
                            case 5:
                            {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name\t specialist \t Timing \t Qualification \t Room No.");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count1; j++)
                                {
                                    d[j].doctorinfo();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s1 = input.nextInt();
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     **PATIENT SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s2 = 1;
                    while (s2 == 1)
                    {
                        System.out.println("1.Add New Entry\n2.Edit Entry\n3.Delete Entry\n4.Search Entry\n5.Existing Patients List\n");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                            {
                                p[count2].addnewpatient();count2++;
                                break;
                            }
                            case 2:
                            {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count2; j++) {
                                    p[j].patientinfo();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s2 = input.nextInt();
                    }
                    break;
                }
                case 3:
                {
                    s3 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     **MEDICINE SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s3 == 1)
                    {
                        System.out.println("1.Add New Entry\n2.Edit Entry\n3.Delete Entry\n4.Search Entry\n5.Existing Medicine List\n");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                            {
                                m[count3].addnewmedicine();count3++;
                                break;
                            }
                            case 2:
                            {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Name \t Company \t Expiry Date \t Cost");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count3; j++) {
                                    m[j].medicineinfo();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s3 = input.nextInt();
                    }
                    break;
                }
                case 4:
                {
                    s4 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                    **LABORATORY SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s4 == 1)
                    {
                        System.out.println("1.Add New Entry\n2.Edit Entry\n3.Delete Entry\n4.Search Entry\n5.Existing Laboratories List\n");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                            {
                                l[count4].addnewfacility();count4++;
                                break;
                            }
                            case 2:
                            {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Fecilities\t\t Cost");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count4; j++) {
                                    l[j].showlab();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s4 = input.nextInt();
                    }
                    break;
                }
                case 5:
                {
                    s5 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("          **HOSPITAL FACILITY SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s5 == 1)
                    {
                        System.out.println("1.Add New Entry\n2.Edit Entry\n3.Delete Entry\n4.Search Entry\n5.Existing Facilties List\n");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                            {
                                f[count5].addfacility();count5++;
                                break;
                            }
                            case 2:
                            {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Hospital  Facility are:");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count5; j++) {
                                    f[j].showallfacility();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s5 = input.nextInt();
                    }
                    break;
                }
                case 6:
                {
                    s6 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                       **STAFF SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s6 == 1)
                    {
                        String a = "nurse", b = "worker", c = "security";
                        System.out.println("1.Add New Entry \n2.Existing Nurses List\n3.Existing Workers List \n4.Existing Security List");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                            {
                                s[count6].addnewstaff();count6++;
                                break;
                            }
                            case 2:
                            {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Gender \t Salary");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count6; j++)
                                {
                                    if (a.equals(s[j].desg))
                                        s[j].viewstaff();
                                }
                                break;
                            }
                            case 3:
                            {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Gender \t Salary");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count6; j++)
                                {
                                    if (b.equals(s[j].desg))
                                        s[j].viewstaff();
                                }
                                break;
                            }
                            case 4:
                            {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Gender \t Salary");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count6; j++)
                                {
                                    if (c.equals(s[j].desg))
                                        s[j].viewstaff();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s6 = input.nextInt();
                    }
                    break;
                }
                default:
                {
                    System.out.println(" You Have Enter Wrong Choice!!!");
                }
            }
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = input.nextInt();
        }
    }
    }
