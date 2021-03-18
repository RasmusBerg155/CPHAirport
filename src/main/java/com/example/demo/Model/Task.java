package com.example.demo.Model;

import java.util.ArrayList;

public class Task {

    int time;
    String name;
    ArrayList<Task> children;

    public Task(int time, String name, ArrayList<Task> children) {
        this.time = time;
        this.name = name;
        this.children = children;
    }

    public void addChild(Task task){
        children.add(task);
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

    public ArrayList<Task> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Task> children) {
        this.children = children;
    }
}
