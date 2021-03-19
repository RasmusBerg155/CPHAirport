package com.example.demo.Model.Frontend;

import com.example.demo.Model.AirplaneModel;

import java.time.LocalTime;

public class Job {
    private int terminal, gate;
    private LocalTime kickoff, deadline;
    private boolean complete;
    private AirplaneModel flight;

    public Job(int terminal, int gate, LocalTime kickoff, LocalTime deadline, boolean complete, AirplaneModel flight) {
        this.terminal = terminal;
        this.gate = gate;
        this.kickoff = kickoff;
        this.deadline = deadline;
        this.complete = complete;
        this.flight = flight;
    }

    public int getTerminal() {
        return terminal;
    }

    public void setTerminal(int terminal) {
        this.terminal = terminal;
    }

    public int getGate() {
        return gate;
    }

    public void setGate(int gate) {
        this.gate = gate;
    }

    public LocalTime getKickoff() {
        return kickoff;
    }

    public void setKickoff(LocalTime kickoff) {
        this.kickoff = kickoff;
    }

    public LocalTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalTime deadline) {
        this.deadline = deadline;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public AirplaneModel getFlight() {
        return flight;
    }

    public void setFlight(AirplaneModel flight) {
        this.flight = flight;
    }
}
