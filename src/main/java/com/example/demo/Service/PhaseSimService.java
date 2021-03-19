package com.example.demo.Service;

import com.example.demo.Factory.TreeFactory;
import com.example.demo.Model.TaskModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PhaseSimService {


    @Autowired
    TreeFactory treeFactory;

    Random r = new Random();


    int treeLeft;
    int treeRight;
    int totalTime;

    public int phaseOne(TaskModel tree) {
        treeRight = tree.getChildren().get(1).getTime();
        treeLeft = tree.getChildren().get(0).getTime();

        if (tree.getChildren().get(0).getChildren().get(0).getTime() >= tree.getChildren().get(0).getChildren().get(1).getTime()) {
            treeLeft = treeLeft + tree.getChildren().get(0).getChildren().get(0).getTime();
        } else {
            treeLeft = treeLeft + tree.getChildren().get(0).getChildren().get(1).getTime();
        }

        if (treeLeft >= treeRight) {
            totalTime = treeLeft;
        } else {
            totalTime = treeRight;
        }
        return totalTime;
    }

    public int phaseTwo(TaskModel tree) {
        treeRight = tree.getChildren().get(1).getChildren().get(0).getTime();

        if (tree.getChildren().get(0).getChildren().get(0).getTime() >= tree.getChildren().get(0).getChildren().get(1).getTime()) {
            treeLeft = tree.getChildren().get(0).getChildren().get(0).getChildren().get(0).getTime();
        } else {
            treeLeft = tree.getChildren().get(0).getChildren().get(1).getChildren().get(0).getTime();
        }

        if (treeLeft >= treeRight) {
            totalTime = treeLeft;
        } else {
            totalTime = treeRight;
        }
        return totalTime;
    }

    public int phaseBoth(TaskModel tree) {
        treeLeft = tree.getChildren().get(0).getTime();

        if (tree.getChildren().get(0).getChildren().get(0).getTime() >= tree.getChildren().get(0).getChildren().get(1).getTime()) {
            treeLeft = treeLeft + tree.getChildren().get(0).getChildren().get(0).getTime() + tree.getChildren().get(0).getChildren().get(0).getChildren().get(0).getTime();
        } else {
            treeLeft = treeLeft + tree.getChildren().get(0).getChildren().get(1).getTime() + tree.getChildren().get(0).getChildren().get(1).getChildren().get(0).getTime();
        }

        treeRight = tree.getChildren().get(1).getTime() + tree.getChildren().get(1).getChildren().get(0).getTime();

        if (treeLeft >= treeRight) {
            totalTime = treeLeft;
        } else {
            totalTime = treeRight;
        }
        return totalTime;
    }

    public TaskModel smallAircraft() {
        return treeFactory.groundStaffTask(r.nextInt(10), r.nextInt(15) + 5, r.nextInt(35) + 5, r.nextInt(20) + 10, r.nextInt(15) + 5, r.nextInt(20) + 10);
    }

    public TaskModel mediumAircraft() {
        return treeFactory.groundStaffTask(r.nextInt(15) + 5, r.nextInt(25) + 15, r.nextInt(45) + 5, r.nextInt(25) + 15, r.nextInt(20) + 10, r.nextInt(30) + 20);
    }

    public TaskModel largeAircraft() {
        return treeFactory.groundStaffTask(r.nextInt(20), r.nextInt(35) + 25, r.nextInt(65) + 5, r.nextInt(40) + 30, r.nextInt(25) + 15, r.nextInt(40) + 30);
    }
}