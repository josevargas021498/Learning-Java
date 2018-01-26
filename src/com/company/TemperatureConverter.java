package com.company;

import java.util.Scanner;

public class TemperatureConverter {
    public String initUnit;
    public String endUnit;

    public TemperatureConverter(String start, String end) {
        initUnit = start;
        endUnit = end;
    }



    public double convert(double temp, String endUnit, String initUnit) {
        if (this.initUnit.equals(this.endUnit)) {
            return temp;
        } else if (this.initUnit.equals("C") && this.endUnit.equals("F")) {
            temp = temp * 9 / 5 + 32;
            return temp;
        } else if (this.initUnit.equals("C") && this.endUnit.equals("K")) {
            temp = temp + 273.13;
            return temp;
        } else if (this.initUnit.equals("F") && this.endUnit.equals("C")) {
            temp = (temp - 32) * 5 / 9;
            return temp;
        } else if (this.initUnit.equals("F") && this.endUnit.equals("K")) {
            temp = (temp + 459.67) * 5 / 9;
            return temp;
        } else if (this.initUnit.equals("K") && this.endUnit.equals("F")) {
            temp = temp * 9 / 5 - 459.67;
            return temp;
        } else if (this.initUnit.equals("K") && this.endUnit.equals("C")) {
            temp = temp - 273.13;
            return temp;
        }
        return temp;
    }
}




