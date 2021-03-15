package com.xpagesbeast.convertfeetdecimaltofeetinchesfraction.model.json;

public class CalculatorResponse {
    private String status;
    private String[] errors;
    private String fractionPart;
    private long feetPart;
    private long inchesPart;
    private int fractionPartNumerator;
    private int factionPartDenominator;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getErrors() {
        return errors;
    }

    public void setErrors(String[] errors) {
        this.errors = errors;
    }

    public String getFractionPart() {
        return fractionPart;
    }

    public void setFractionPart(String fractionPart) {
        this.fractionPart = fractionPart;
    }

    public long getFeetPart() {
        return feetPart;
    }

    public void setFeetPart(long feetPart) {
        this.feetPart = feetPart;
    }

    public long getInchesPart() {
        return inchesPart;
    }

    public void setInchesPart(long inchesPart) {
        this.inchesPart = inchesPart;
    }

    public int getFractionPartNumerator() {
        return fractionPartNumerator;
    }

    public void setFractionPartNumerator(int fractionPartNumerator) {
        this.fractionPartNumerator = fractionPartNumerator;
    }

    public int getFactionPartDenominator() {
        return factionPartDenominator;
    }

    public void setFactionPartDenominator(int factionPartDenominator) {
        this.factionPartDenominator = factionPartDenominator;
    }
}
