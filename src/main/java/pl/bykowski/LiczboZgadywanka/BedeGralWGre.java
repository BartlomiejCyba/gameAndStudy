package pl.bykowski.LiczboZgadywanka;

import java.util.Random;
import java.util.Scanner;

public class BedeGralWGre {

     public void main(String[] args) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            int wylosowanaliczba = random.nextInt( 101);
            int iloscProb = 0;

            for(;;){
                System.out.println("Wprowadz liczbe");
                int liczba = scanner.nextInt();
                iloscProb++;
                if (liczba > wylosowanaliczba) {
                    System.out.println("Za duzo!");
                } else if(liczba < wylosowanaliczba) {
                    System.out.println("Za malo!");
                } else {
                    System.out.println("Trafiles !!!" + "ZA " +iloscProb);
                    break;
                }
            }
        }
}
