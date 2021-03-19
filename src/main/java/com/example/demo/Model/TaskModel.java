package com.example.demo.Model;

import java.util.ArrayList;

public class TaskModel {

    int time;
    String name;
    ArrayList<TaskModel> children;

    public TaskModel(int time, String name) {
        this.time = time;
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void addChild(TaskModel taskModel){
        children.add(taskModel);
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<TaskModel> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<TaskModel> children) {
        this.children = children;
    }
}
