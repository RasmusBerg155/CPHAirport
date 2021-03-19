package com.example.demo.Factory;

import com.example.demo.Model.TaskModel;
import org.springframework.stereotype.Component;

@Component
public class TreeFactory {

    public TaskModel groundStaffTask(int pOutTime, int refuelTime, int cleaningTime, int pInTime, int bOutTime, int bInTime){

        TaskModel root = new TaskModel(0, "root");
        TaskModel passangersOut = new TaskModel(pOutTime, "passagengers out");
        TaskModel refuel = new TaskModel(refuelTime, "refuel");
        TaskModel cleaning = new TaskModel(cleaningTime, "cleaning");
        TaskModel passengersIn = new TaskModel(pInTime, "passengers in");
        TaskModel bagageOut = new TaskModel(bOutTime, "bagage out");
        TaskModel bagageIn = new TaskModel(bInTime, "bagage in");

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
