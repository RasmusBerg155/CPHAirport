package com.example.demo.Model;

public class WorkingModel extends EmployeeModel {

    int workingTime;
    int walkingTime;

    public WorkingModel() {

    }

    public int getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(int workingTime) {
        this.workingTime = workingTime;
    }

    public int getWalkingTime() {
        return walkingTime;
    }

    public void setWalkingTime(int walkingTime) {
        this.walkingTime = walkingTime;
    }
}
