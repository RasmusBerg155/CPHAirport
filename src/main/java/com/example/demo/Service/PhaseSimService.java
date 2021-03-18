package com.example.demo.Service;

import com.example.demo.Factory.TreeFactory;
import com.example.demo.Model.Task;

public class PhaseSimService {

    TreeFactory treeFactory;
    int treeLeft;
    int treeRight;
    int totalTime;

    public int phaseOne(Task tree){
        treeRight = tree.getChildren().get(1).getTime();
        treeLeft = tree.getChildren().get(0).getTime();

        if (tree.getChildren().get(0).getChildren().get(0).getTime() >= tree.getChildren().get(0).getChildren().get(1).getTime()){
            treeLeft = treeLeft + tree.getChildren().get(0).getChildren().get(0).getTime();
        } else {
            treeLeft = treeLeft + tree.getChildren().get(0).getChildren().get(1).getTime();
        }

        if (treeLeft >= treeRight){
            totalTime = treeLeft;
        } else {
            totalTime = treeRight;
        }
        return totalTime;
    }

    public int phaseTwo(Task tree){
        treeRight = tree.getChildren().get(1).getChildren().get(0).getTime();

        if (tree.getChildren().get(0).getChildren().get(0).getTime() >= tree.getChildren().get(0).getChildren().get(1).getTime()) {
            treeLeft = tree.getChildren().get(0).getChildren().get(0).getChildren().get(0).getTime();
        } else {
            treeLeft = tree.getChildren().get(0).getChildren().get(1).getChildren().get(0).getTime();
        }

        if (treeLeft >= treeRight){
            totalTime = treeLeft;
        } else {
            totalTime = treeRight;
        }
        return totalTime;
    }


    public int phaseBoth(Task tree) {
        treeLeft = tree.getChildren().get(0).getTime();

        if (tree.getChildren().get(0).getChildren().get(0).getTime() >= tree.getChildren().get(0).getChildren().get(1).getTime()) {
            treeLeft = treeLeft + tree.getChildren().get(0).getChildren().get(0).getTime() + tree.getChildren().get(0).getChildren().get(0).getChildren().get(0).getTime();
        } else {
            treeLeft = treeLeft + tree.getChildren().get(0).getChildren().get(1).getTime() + tree.getChildren().get(0).getChildren().get(1).getChildren().get(0).getTime();
        }

        treeRight = tree.getChildren().get(1).getTime() + tree.getChildren().get(1).getChildren().get(0).getTime();

        if (treeLeft >= treeRight){
            totalTime = treeLeft;
        } else {
            totalTime = treeRight;
        }

            return totalTime;
    }

}