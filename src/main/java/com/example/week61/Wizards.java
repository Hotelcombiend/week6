package com.example.week61;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;

@Component
public class Wizards implements Serializable {
    public ArrayList<Wizard> model;

    public Wizards() {
        model = new ArrayList<>();
    }
}
