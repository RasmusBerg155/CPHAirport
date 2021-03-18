package com.example.demo;

import com.example.demo.Factory.TreeFactory;
import com.example.demo.Model.Task;
import com.example.demo.Service.PhaseSimService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        Task tree = treeFactory.create(5, 15, 15,15, 5, 25);
        int cost = phaseSimService.eval(tree);
        assertEquals(35, cost);
    }

}
