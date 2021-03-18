package com.example.demo.Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class AirplaneModel {
    int id;
    int airPlaneSize;
    LocalDate arivalDate;
    LocalTime arivalTime;
    LocalDate departureDate;
    LocalTime departureTime;
    Boolean phase;

    public AirplaneModel(){

    }

    public int getId() {
        return id;
    }

    public int getAirPlaneSize() {
        return airPlaneSize;
    }

    public void setAirPlaneSize(int airPlaneSize) {
        this.airPlaneSize = airPlaneSize;
    }

    public LocalDate getArivalDate() {
        return arivalDate;
    }

    public void setArivalDate(LocalDate arivalDate) {
        this.arivalDate = arivalDate;
    }

    public LocalTime getArivalTime() {
        return arivalTime;
    }

    public void setArivalTime(LocalTime arivalTime) {
        this.arivalTime = arivalTime;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public Boolean getPhase() {
        return phase;
    }

    public void setPhase(Boolean phase) {
        this.phase = phase;
    }

    public void setId(int id) {
        this.id = id;





    }
}
