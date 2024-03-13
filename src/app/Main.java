package app;

import java.util.Locale;
import java.util.Scanner;

import entities.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Rent[] vect = new Rent[10];

        System.out.println("How many rooms will be rented? ");
        int rooms = sc.nextInt();

        for(int i = 1; i <= rooms; i++){
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            Rent rent = new Rent(name, email);

            vect[roomNumber] = rent;
        }


        System.out.println();
        System.out.println("Occuped rooms: ");
        for(int i = 0; i < 10; i++){
            if(vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }


        sc.close();
    }
}