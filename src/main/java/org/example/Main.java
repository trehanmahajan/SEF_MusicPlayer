package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter No of Inserts");
        int noOfEntries = Integer.parseInt(S.nextLine().trim());
        for(int i = 0; i<noOfEntries; i++){
            System.out.println("Enter ID");
            String ID = S.nextLine().trim();
            System.out.println("Enter Name");
            String Name = S.nextLine().trim();
            System.out.println("Enter Address");
            String Address = S.nextLine().trim();
            System.out.println("Ente11r Birthdate");
            String Birthdate = S.nextLine().trim();
            System.out.println("Enter Bio");
            String Bio = S.nextLine().trim();
            System.out.println("Enter count of Occupations");
            int OccupationsCount = Integer.parseInt(S.nextLine().trim());
            ArrayList <String >  Occupations = new ArrayList<>();
            while (OccupationsCount-->0){
                System.out.println("Enter Occupations");
                String occ = S.nextLine().trim();
                Occupations.add(occ);
            }
            System.out.println("Enter count of Awards");
            ArrayList <String> Awards = new ArrayList<>();
            int AwardsCount = Integer.parseInt(S.nextLine().trim());
            while (AwardsCount-->0){
                System.out.println("Enter Awards");
                String awd = S.nextLine().trim();
                Awards.add(awd);
            }
            System.out.println("Enter count of Genres");
            ArrayList <String> Genres  = new ArrayList<>();
            int GenresCount = Integer.parseInt(S.nextLine().trim());
            while (GenresCount-->0){
                System.out.println("Enter Genres");
                String awd = S.nextLine().trim();
                Genres.add(awd);
            }
            System.out.println("Enter Action 1: AddArtist, 2:UpdateArtist");
            int acction = Integer.parseInt(S.nextLine().trim());
            Artist A = new Artist(ID, Name, Address, Birthdate, Bio, Occupations, Genres, Awards);
            boolean oprationStatus = false;
            if(acction == 1) {
                 oprationStatus = A.addArtist();
            } else if (acction == 2) {
                 oprationStatus = A.updateArtist();
            }
            if (oprationStatus) {
                System.out.print("✅✅operation Successfull");
            } else {
                System.out.print("operation failed");
            }
        }

    }
}