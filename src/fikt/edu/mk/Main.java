package fikt.edu.mk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner vnes = new Scanner(System.in);

        covek.student.ocenka ocenki= new covek.student.ocenka();
        covek.student ucenik= new covek.student();
        covek c = new covek();


        System.out.println(c.toString());

        while(true) {

            ucenik.m = 0;
            System.out.println(ucenik.toString());
            ocenki.niza[0] = Integer.parseInt(vnes.nextLine());

            if(ocenki.niza[0]>10 || ocenki.niza[0]<5) {
                System.out.println("Ocenka (5-10)");
                ocenki.niza[0] = Integer.parseInt(vnes.nextLine());
            }
            else if (ocenki.niza[0]<10 || ocenki.niza[0]>5) {
                break;
            }
        }


        while(true) {

            ucenik.m = 1;
            System.out.println(ucenik.toString());
            ocenki.niza[1] = Integer.parseInt(vnes.nextLine());

            if(ocenki.niza[1]>10 || ocenki.niza[1]<5) {
                System.out.println("Ocenka (5-10)");
                ocenki.niza[1] = Integer.parseInt(vnes.nextLine());
            }
            if (ocenki.niza[1]<10 || ocenki.niza[1]>5) {
                break;
            }
        }

        while(true) {

            ucenik.m = 2;
            System.out.println(ucenik.toString());
            ocenki.niza[2] = Integer.parseInt(vnes.nextLine());

            if(ocenki.niza[2]>10 || ocenki.niza[0]<5) {
                System.out.println("Ocenka (5-10)");
                ocenki.niza[2] = Integer.parseInt(vnes.nextLine());
            }
            if (ocenki.niza[2]<10 || ocenki.niza[2]>5) {
                break;
            }
        }

        while(true) {
            ucenik.m = 3;
            System.out.println(ucenik.toString());
            ocenki.niza[3] = Integer.parseInt(vnes.nextLine());

            if(ocenki.niza[3]>10 || ocenki.niza[3]<5) {
                System.out.println("Ocenka (5-10)");
                ocenki.niza[3] = Integer.parseInt(vnes.nextLine());
            }
            if (ocenki.niza[3]<10 || ocenki.niza[3]>5) {
                break;
            }
        }

        while(true) {

            ucenik.m = 4;
            System.out.println(ucenik.toString());
            ocenki.niza[4] = Integer.parseInt(vnes.nextLine());

            if(ocenki.niza[4]>10 || ocenki.niza[4]<5) {
                System.out.println("Ocenka (5-10)");
                ocenki.niza[4] = Integer.parseInt(vnes.nextLine());
            }
            if (ocenki.niza[4]<10 || ocenki.niza[4]>5) {
                break;
            }
        }


        System.out.println(ocenki.toString());
    }
}