/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_1913075_project1.java;

/**
 * @author HP
 */
//Renad Felemban, 1913075@uj.edu.sa, 10871, B1, Project:Uber Fare Calculator, 2020\3\12 
import java.util.Scanner;
public class B1_1913075_Project1Java {

    static volatile int  welcom =methwel();;
    static int ix= 0, ex= 0, rx = 0; // counters of how many times the user choose uberX
    static int ixl= 0, exl= 0, rxl= 0; // counters of how many times the user choose uberXL
    static int ixb= 0, exb= 0, rxb= 0; // counters of how many times the user choose uberBlack
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
        // TODO code application logic here
        {mmm();}
    
    public static void sss()
    {
       welcom =methwel();
       
        while (welcom==1) // if the user choose 1 from the welcoming menu
            {char chis1= methch1((char)welcom);
            while (!(chis1=='R' || chis1=='r'))
                {if(chis1=='X' || chis1=='x')
                    {ix++;
                    methchx1();}
                if(chis1=='L' || chis1=='l')
                    {ixl++;
                    methchL1();}
                if(chis1=='B' || chis1=='b')
                    {ixb++;
                    methchb1();}
                chis1=methch1((char)welcom);}
            if(chis1=='R' || chis1=='r')
                sss();}
                
                
        while(welcom==2) // if the user choose 2 from the welcoming menu
            {char chis2=methch1((char)welcom);
            while (!(chis2=='R' || chis2=='r'))
                {if(chis2=='X' || chis2=='x')
                    {ex++;
                    methchx2();}
                if(chis2=='L' || chis2=='l')
                    {exl++;
                    methchL2();}
                if(chis2=='B' || chis2=='b')
                    {exb++;
                    methchb2();}
                chis2=methch1((char)welcom);}
            if(chis2=='R' || chis2=='r')
                sss();}
                
                
        while (welcom==3) // if the user choose 3 from the welcoming menu
            {char chis3=methch1((char)welcom);
            while (!(chis3=='R' || chis3=='r'))
                {if(chis3=='X' || chis3=='x')
                    {rx++;
                    methchx3();}
                if(chis3=='L' || chis3=='l')
                    {rxl++;
                    methchL3();}
                if(chis3=='B' || chis3=='b')
                    {rxb++;
                    methchb3();}
                chis3=methch1((char)welcom);}
            if(chis3=='R' || chis3=='r')
                sss();}
                
                
        while (welcom==4)
            {methch4(ix,ex,rx, ixl,exl,rxl, ixb,exb,rxb);
            break;
            }
                 
    }
    public static void mmm()
    { // TODO code application logic here
        
        while (welcom==1) // if the user choose 1 from the welcoming menu
            {char chis1= methch1((char)welcom);
            while (!(chis1=='R' || chis1=='r'))
                {if(chis1=='X' || chis1=='x')
                    {ix++;
                    methchx1();}
                if(chis1=='L' || chis1=='l')
                    {ixl++;
                    methchL1();}
                if(chis1=='B' || chis1=='b')
                    {ixb++;
                    methchb1();}
                chis1=methch1((char)welcom);}
            if(chis1=='R' || chis1=='r')
                sss();}
                
                
        while(welcom==2) // if the user choose 2 from the welcoming menu
            {char chis2=methch1((char)welcom);
            while (!(chis2=='R' || chis2=='r'))
                {if(chis2=='X' || chis2=='x')
                    {ex++;
                    methchx2();}
                if(chis2=='L' || chis2=='l')
                    {exl++;
                    methchL2();}
                if(chis2=='B' || chis2=='b')
                    {exb++;
                    methchb2();}
                chis2=methch1((char)welcom);}
            if(chis2=='R' || chis2=='r')
                sss();}
                
                
        while (welcom==3) // if the user choose 3 from the welcoming menu
            {char chis3=methch1((char)welcom);
            while (!(chis3=='R' || chis3=='r'))
                {if(chis3=='X' || chis3=='x')
                    {rx++;
                    methchx3();}
                if(chis3=='L' || chis3=='l')
                    {rxl++;
                    methchL3();}
                if(chis3=='B' || chis3=='b')
                    {rxb++;
                    methchb3();}
                chis3=methch1((char)welcom);}
            if(chis3=='R' || chis3=='r')
                sss();}
                
                
        while (welcom==4)
            {methch4(ix,ex,rx, ixl,exl,rxl, ixb,exb,rxb);
            break;}
    }
    
    
    public static int methwel()
        {Scanner input= new Scanner(System.in);
        int welnum;
        
        System.out.println("-----------------------------------------------------");
        System.out.println("  ###       welcome to uber fare calculator     ###  ");
        System.out.println("-----------------------------------------------------");
        System.out.println("| 1  : Get fare information about available rides   |");
        System.out.println("| 2  : Get a Fare Estimate for your Journey         |");
        System.out.println("| 3  : Submit Rating of your Ride                   |");
        System.out.println("| 4  : Exit and display summary                     |");
        System.out.println("-----------------------------------------------------");
        System.out.print(" > Please enter your choice...(1-4): ");
        welnum= input.nextInt();
        
        while (!(welnum==1 | welnum==2 | welnum==3 | welnum==4))
            {System.out.println("                                    ");
            System.out.println("               Invalid Choice!! Please Try again");
            System.out.println("                                    ");
            System.out.println("-----------------------------------------------------");
            System.out.println("  ###       welcome to uber fare calculator     ###  ");
            System.out.println("-----------------------------------------------------");
            System.out.println("| 1  : Get fare information about available rides   |");
            System.out.println("| 2  : Get a Fare Estimate for your Journey         |");
            System.out.println("| 3  : Submit Rating of your Ride                   |");
            System.out.println("| 4  : Exit and display summary                     |");
            System.out.println("-----------------------------------------------------");
            System.out.print(" > Please enter your choice...(1-4): ");
            welnum= input.nextInt();  }
        
        return welnum;
        }
        
        
    public static char methch1(char welcom)
    {
        Scanner input= new Scanner(System.in);
            
        char ch1;
        System.out.println("-------------------------------------");
        System.out.println("***             RIDES             ***");
        System.out.println("-------------------------------------");
        System.out.println("| X or x : UberX                    |");
        System.out.println("| L or l : UberXL                   |");
        System.out.println("| B or b : UberBlack                |");
        System.out.println("| R or r : Return to Main Menu      |");
        System.out.println("-------------------------------------");
        System.out.print(" > Pleas enter your choice... ");
        ch1= input.next().charAt(0);
                
        
        while (!(ch1=='X'|ch1=='x' | ch1=='L'|ch1=='l' | ch1=='B'|ch1=='b' | ch1=='R'|ch1=='r' ))
            {System.out.println("                                    ");
            System.out.println("               Invalid Choice!! Please Try again");
            System.out.println("                                    ");
             System.out.println("-------------------------------------");
             System.out.println("***             RIDES             ***");
             System.out.println("-------------------------------------");
             System.out.println("| X or x : UberX                    |");
             System.out.println("| L or l : UberXL                   |");
             System.out.println("| B or b : UberBlack1               |");
             System.out.println("| R or r : Return to Main Menu      |");
             System.out.println("-------------------------------------");
             System.out.print(" > Pleas enter your choice... ");
             ch1= input.next().charAt(0);}
        return ch1;
    }  
    
    public static void methchx1()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("***            OPTIONS            ***");
        System.out.println("-------------------------------------");
        System.out.println("| B or b: Base fare                 |");
        System.out.println("| M or m: Cost per minute           |");
        System.out.println("| K or k: Cost per Km               |");
        System.out.println("| S or s: Service fee               |");
        System.out.println("| C or c: Caccellation fee          |");
        System.out.println("| F or f: Minimum                   |");
        System.out.println("| R or r: Previous Menu             |");
        System.out.println("-------------------------------------");
        System.out.print(" > Pleas enter your choice... ");
        
        char op;
        op= input.next().charAt(0);
        if (op=='B' | op=='b')
            {System.out.println("Base fare for UberX is 3.2SR");
            System.out.println("                           ");
            methchx1();}    
        if (op=='M' | op=='m')
            {System.out.println("Cost per minute for UberX is 0.25SR");
            System.out.println("                           ");
            methchx1();}
        if (op=='K' | op=='k')
            {System.out.println("Cost per Km for UberX is 0.9SR");
            System.out.println("                           ");
            methchx1();}
        if (op=='S' | op=='s')
            {System.out.println("Service fee for UberX is NA");
            System.out.println("                           ");
            methchx1();}
        if (op=='C' | op=='c')
            {System.out.println("Caccellation fee for UberX is 8SR");
            System.out.println("                           ");
            methchx1();}
        if (op=='F' | op=='f')
            {System.out.println("Minimum for UberX is 8SR");
            System.out.println("                           ");
            methchx1();}
        if (op=='R' | op=='r')
            mmm();
    }
    
    public static void methchL1()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("***            OPTIONS            ***");
        System.out.println("-------------------------------------");
        System.out.println("| B or b: Base fare                 |");
        System.out.println("| M or m: Cost per minute           |");
        System.out.println("| K or k: Cost per Km               |");
        System.out.println("| S or s: Service fee               |");
        System.out.println("| C or c: Caccellation fee          |");
        System.out.println("| F or f: Minimum                   |");
        System.out.println("| R or r: Previous Menu             |");
        System.out.println("-------------------------------------");
        System.out.print(" > Pleas enter your choice... ");
        
        char op;
        op= input.next().charAt(0);
        if (op=='B' | op=='b')
            {System.out.println("Base fare for UberXL is 5.5SR");
            System.out.println("                           ");
            methchL1();}    
        if (op=='M' | op=='m')
            {System.out.println("Cost per minute for UberXL is 0.4SR");
            System.out.println("                           ");
            methchL1();}
        if (op=='K' | op=='k')
            {System.out.println("Cost per Km for UberXL is 1.25SR");
            System.out.println("                           ");
            methchL1();}
        if (op=='S' | op=='s')
            {System.out.println("Service fee for UberXL is NA");
            System.out.println("                           ");
            methchL1();}
        if (op=='C' | op=='c')
            {System.out.println("Caccellation fee for UberXL is 12SR");
            System.out.println("                           ");
            methchL1();}
        if (op=='F' | op=='f')
            {System.out.println("Minimum for UberXL is 12SR");
            System.out.println("                           ");
            methchL1();}
        if (op=='R' | op=='r')
            mmm();
    }
    
    public static void methchb1()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("***            OPTIONS            ***");
        System.out.println("-------------------------------------");
        System.out.println("| B or b: Base fare                 |");
        System.out.println("| M or m: Cost per minute           |");
        System.out.println("| K or k: Cost per Km               |");
        System.out.println("| S or s: Service fee               |");
        System.out.println("| C or c: Caccellation fee          |");
        System.out.println("| F or f: Minimum                   |");
        System.out.println("| R or r: Previous Menu             |");
        System.out.println("-------------------------------------");
        System.out.print(" > Pleas enter your choice... ");
        
        char op;
        op= input.next().charAt(0);
        if (op=='B' | op=='b')
            {System.out.println("Base fare for UberBlack is 9.5SR");
            System.out.println("                           ");
            methchb1();}    
        if (op=='M' | op=='m')
            {System.out.println("Cost per minute for UberBlack is 0.85SR");
            System.out.println("                           ");
            methchb1();}
        if (op=='K' | op=='k')
            {System.out.println("Cost per Km for UberBlack is 1.8SR");
            System.out.println("                           ");
            methchb1();}
        if (op=='S' | op=='s')
            {System.out.println("Service fee for UberBlack is NA");
            System.out.println("                           ");
            methchb1();}
        if (op=='C' | op=='c')
            {System.out.println("Caccellation fee for UberBlack is 20SR");
            System.out.println("                           ");
            methchb1();}
        if (op=='F' | op=='f')
            {System.out.println("Minimum for UberBlack is 20SR");
            System.out.println("                           ");
            methchb1();}
        if (op=='R' | op=='r')
            mmm();
    }
    
    public static void methchx2()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Please provide the informaion about your journey:");
        System.out.println("----------------------------------------------------------");
        System.out.print("Ride time in minutes: ");
        int rtime= input.nextInt();
        System.out.print("Ride distance in KM(s): ");
        double rdis= input.nextDouble();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        double total_fare= (rtime * 0.25) + (rdis * 0.9);
        System.out.printf(" > Expected ride fare: %.2fSR  <%n" ,total_fare);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        mmm();
    }
    
    public static void methchL2()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Please provide the informaion about your journey:");
        System.out.println("----------------------------------------------------------");
        System.out.print("Ride time in minutes: ");
        int rtime= input.nextInt();
        System.out.print("Ride distance in KM(s): ");
        double rdis= input.nextDouble();
        double total_fare= (rtime * 0.4) + (rdis * 1.25);
        System.out.printf(" > Expected ride fare: %.2fSR  <%n" ,total_fare);
        mmm();
    }
    
    public static void methchb2()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Please provide the informaion about your journey:");
        System.out.println("----------------------------------------------------------");
        System.out.print("Ride time in minutes: ");
        int rtime= input.nextInt();
        System.out.print("Ride distance in KM(s): ");
        double rdis= input.nextDouble();
        double total_fare= (rtime * 0.85) + (rdis * 1.8);
        System.out.printf(" > Expected ride fare: %.2fSR  <%n" ,total_fare);
        mmm();
    }
    
    public static void methchx3()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("***            RATING             ***");
        System.out.println("-------------------------------------");
        System.out.println("| 1 Poor                            |");
        System.out.println("| 2 Borderline                      |");
        System.out.println("| 3 Satisfactory                    |");
        System.out.println("| 4 good                            |");
        System.out.println("| 5 Outstanding                     |");
        System.out.println("-------------------------------------");
        System.out.print(" > Pleas enter your choice... (1-5): ");
        int rate= input.nextInt();
        System.out.println("                                     ");
        System.out.println("                                     ");
        System.out.println("Thank you for your rating!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("You give rating > %d < %n" ,rate);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        mmm();
    }
    
    public static void methchL3()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("***            RATING             ***");
        System.out.println("-------------------------------------");
        System.out.println("| 1 Poor                            |");
        System.out.println("| 2 Borderline                      |");
        System.out.println("| 3 Satisfactory                    |");
        System.out.println("| 4 good                            |");
        System.out.println("| 5 Outstanding                     |");
        System.out.println("-------------------------------------");
        System.out.print(" > Pleas enter your choice... (1-5): ");
        int rate= input.nextInt();
        System.out.println("                                     ");
        System.out.println("                                     ");
        System.out.println("Thank you for your rating!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("You give rating > %d < %n" ,rate);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        mmm();
    }
    
    public static void methchb3()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("***            RATING             ***");
        System.out.println("-------------------------------------");
        System.out.println("| 1 Poor                            |");
        System.out.println("| 2 Borderline                      |");
        System.out.println("| 3 Satisfactory                    |");
        System.out.println("| 4 good                            |");
        System.out.println("| 5 Outstanding                     |");
        System.out.println("-------------------------------------");
        System.out.print(" > Pleas enter your choice... (1-5): ");
        int rate= input.nextInt();
        System.out.println("                                     ");
        System.out.println("                                     ");
        System.out.println("Thank you for your rating!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("You give rating > %d < %n" ,rate);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        mmm();
    }
    
    public static void methch4(int ix,int ex,int rx,int ixl,int exl,int rxl,int ixb,int exb,int rxb)
    {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("###                            SUMMARY                             ###");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("| Ride        | # of fare Info. | # Fare Est. | # of Subitted Rating |");
        System.out.printf("| UberX        |              %d |          %d |                   %d |%n", ix,ex,rx);
        System.out.printf("| UberXL       |              %d |          %d |                   %d |%n", ixl,exl,rxl);
        System.out.printf("| UberXBlack   |              %d |          %d |                   %d |%n", ixb,exb,rxb);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Thank you for using Uber Fare Calculation System!");
    }
}

    