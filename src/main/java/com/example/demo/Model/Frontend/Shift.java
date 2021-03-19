package com.example.demo.Model.Frontend;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Shift {
    private LocalDate date;
    private LocalTime start;
    private LocalTime end;
    private LocalTime lunch;
    private ArrayList<Job> jobs;

    public Shift(LocalDate date, LocalTime start, LocalTime end, LocalTime lunch, ArrayList<Job> jobs) {
        this.date = date;
        this.start = start;
        this.end = end;
        this.lunch = lunch;
        this.jobs = jobs;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    public LocalTime getLunch() {
        return lunch;
    }

    public void setLunch(LocalTime lunch) {
        this.lunch = lunch;
    }

    public ArrayList<Job> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }
}
