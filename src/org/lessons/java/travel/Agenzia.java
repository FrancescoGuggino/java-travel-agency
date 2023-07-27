package org.lessons.java.travel;

import java.time.LocalDate;
import java.util.Scanner;

public class Agenzia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Vacanza vacanza = null;
        while (vacanza == null) {
            System.out.println("Inserisci la destinazione: ");
            String destination = scan.nextLine();
            System.out.println("Inserisci la data di partenza (yyyy-mm-dd): ");

            LocalDate startDate = null;
            try {
                startDate = LocalDate.parse(scan.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid date format");
            }
            System.out.println("Inserisci la data di ritorno (yyyy-mm-dd): ");

            LocalDate endDate = null;
            try {
                endDate = LocalDate.parse(scan.nextLine());
            } catch (Exception e) {
                System.out.println("Formato data non valido!");
            }

            try {
                vacanza = new Vacanza(destination,startDate,endDate);
            } catch (RuntimeException e) {
                System.out.println("Parametri non validi!");
                System.out.println(e.getMessage());
            }

        }

        System.out.println("Hai prenotato una vacanza di " + vacanza.getTravelDate() + " giorni a " + vacanza.getDestination() + " dal " + vacanza.getStartDate() + " al " + vacanza.getEndDate());

    }
}
