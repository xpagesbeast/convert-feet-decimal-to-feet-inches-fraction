package com.xpagesbeast.convertfeetdecimaltofeetinchesfraction.model.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CalculatorRequest {

    @JsonProperty("decimalFeet")
    private double decimalFeet;

    public double getDecimalFeet() {
        return decimalFeet;
    }

    public void setDecimalFeet(double decimalFeet) {
        this.decimalFeet = decimalFeet;
    }
}
