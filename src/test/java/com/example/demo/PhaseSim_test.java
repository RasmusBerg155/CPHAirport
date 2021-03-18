package com.example.demo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import java.util.Random;

public class PhaseSim_test {

    private PhaseSim phaseSim;

    @BeforeEach
    void setup() {
        phaseSim = new PhaseSim();
    }

    @Test
    void generateSmall() {
        // insert boolean for switching off randomness for tests
        Task tree = phaseSim.small(false);
        int cost = phaseSim.eval(tree);
        assertEquals(50, cost);
    }

}
