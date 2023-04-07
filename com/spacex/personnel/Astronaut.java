// Astronaut.java
// D. Singletary 
// 3/20/23
// class representing an astronaut

package com.spacex.personnel;

import java.time.LocalDateTime;
import java.text.DecimalFormat;

public class Astronaut {
    private String name;
    private double heightCm;  // height in centimeters
    private double weightKg;  // weight in kilograms
    
    // overload, create an astronaut with specified name, height, and weight
    public Astronaut(String name, double heightCm, double weightKg) {
        this.name = name;
        this.heightCm = heightCm;
        this.weightKg = weightKg;
    }
    
    public String toString() {
        DecimalFormat decFormatter = new DecimalFormat(".#");
        
        return "name: " + name + "\n" + 
               "height: " + decFormatter.format(heightCm) + " (cm)\n" +
               "weight: " + decFormatter.format(weightKg) + " (kg)\n";
    }
}

