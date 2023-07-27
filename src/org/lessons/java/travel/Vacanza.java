package org.lessons.java.travel;

import java.time.LocalDate;
import java.time.Period;

public class Vacanza {

    // attributi

    private String destination;
    private LocalDate startDate;
    private LocalDate endDate;

    // costruttori

    public Vacanza(String destination, LocalDate startDate, LocalDate endDate) throws RuntimeException {

        //controllo
        if (destination == null || destination.isEmpty()){
            //eccezione
            throw new RuntimeException("Destination must not be null or empty!");
        }

        if (startDate == null || startDate.isBefore(LocalDate.now())){
            //eccezione
            throw new RuntimeException("Start time must not be null or in the past!");
        }

        if (endDate == null || endDate.isBefore(startDate)){
            //eccezione
            throw new RuntimeException("End time must not be null or before start time!");
        }

        this.destination = destination;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // getter setter

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }


    // metodi

    public int getTravelDate() {
        Period travelPeriod = Period.between(startDate,endDate);
        return travelPeriod.getDays();
    }

    @Override
    public String toString() {
        return "Vacanza{" +
                "destination='" + destination + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
