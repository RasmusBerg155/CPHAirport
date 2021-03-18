package com.example.demo.Factory;

import com.example.demo.Model.Task;

import java.util.ArrayList;

public class TaskFactory {



    public Task create(){
        ArrayList<Task> rootChildren =new ArrayList<>();

        Task root = new Task(0, "root",new ArrayList<>());
        Task passangersOut = new Task(0, "passagengers out", new ArrayList<>());
        Task refuel = new Task(0, "refuel", new ArrayList<>());
        Task cleaning = new Task(0, "cleaning", new ArrayList<>());
        Task passengersIn = new Task(0, "passengers in", new ArrayList<>());
        Task bagageOut = new Task(0, "bagage out", new ArrayList<>());
        Task bagageIn = new Task(0, "bagage in", new ArrayList<>());


        root.addChild(passangersOut);
        root.addChild(bagageOut);
        bagageOut.addChild(bagageIn);
        passangersOut.addChild(refuel);
        passangersOut.addChild(cleaning);

        if(refuel.getTime() > cleaning.getTime()){
            refuel.addChild(passengersIn);
        } else {
            cleaning.addChild(passengersIn);
        }

        return root;
            }
}
