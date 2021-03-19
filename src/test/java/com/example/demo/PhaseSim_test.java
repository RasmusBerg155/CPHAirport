package com.example.demo;

import com.example.demo.Factory.TreeFactory;
import com.example.demo.Model.TaskModel;
import com.example.demo.Service.PhaseSimService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class PhaseSim_test {

    private PhaseSimService phaseSimService;
    private TreeFactory treeFactory;

    @BeforeEach
    void setup() {
        phaseSimService = new PhaseSimService();
        treeFactory = new TreeFactory();
    }

    @Test
    void getTotalTime() {
        // insert boolean for switching off randomness for tests
        TaskModel tree = treeFactory.groundStaffTask(5, 15, 15,15, 5, 25);
        int cost = phaseSimService.phaseBoth(tree);
        assertEquals(35, cost);
    }

    @Test
    void getTimePhaseOne(){
        TaskModel tree = treeFactory.groundStaffTask(5, 15, 15,15, 5, 25);
        int cost = phaseSimService.phaseOne(tree);
        assertEquals(20, cost);
    }

    @Test
    void getTimePhaseOTwo(){
        TaskModel tree = treeFactory.groundStaffTask(5, 15, 15,15, 5, 25);
        int cost = phaseSimService.phaseTwo(tree);
        assertEquals(25, cost);
    }

}
