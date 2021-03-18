package com.example.demo.Factory;

import com.example.demo.Model.Task;

import java.util.ArrayList;

public class TreeFactory {



    public Task create(int pOutTime, int refuelTime, int cleaningTime, int pInTime, int bOutTime, int bInTime){

        Task root = new Task(0, "root");
        Task passangersOut = new Task(pOutTime, "passagengers out");
        Task refuel = new Task(refuelTime, "refuel");
        Task cleaning = new Task(cleaningTime, "cleaning");
        Task passengersIn = new Task(pInTime, "passengers in");
        Task bagageOut = new Task(bOutTime, "bagage out");
        Task bagageIn = new Task(bInTime, "bagage in");

        root.addChild(passangersOut);
        root.addChild(bagageOut);
        bagageOut.addChild(bagageIn);
        passangersOut.addChild(refuel);
        passangersOut.addChild(cleaning);

        if(refuel.getTime() >= cleaning.getTime()){
            refuel.addChild(passengersIn);
        } else {
            cleaning.addChild(passengersIn);
        }

        return root;

            }
}
