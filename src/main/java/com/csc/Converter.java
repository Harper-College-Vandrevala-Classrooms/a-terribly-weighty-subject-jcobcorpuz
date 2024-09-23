package com.csc;

public class Converter {

  public String toPounds(){
    return toPounds(0);
  }

  public String toPounds(int ounces) {
    double pounds = ounces / 16.0;
    String unit;

    if (pounds == 1.0)
    {
      unit = "lb";
    }
    else {
      unit = "lbs";
    }
    return String.format("%.4f %s", pounds, unit);
  }

  public String toPoundsAndOunces(){
    return toPoundsAndOunces(0);
  }

  public String toPoundsAndOunces(int ounces) {
    int pounds = ounces / 16;
    int remainder = ounces % 16;

    String unit2;
    if (pounds == 1){
      unit2 = "lb";
    }
    else{
      unit2 = "lbs";
    }
    return pounds + " " + unit2 + " " + remainder + " oz";
  }

  public String toOunces(int pounds, int ounces){
    int totalOunces = (pounds * 16) + ounces;
    return totalOunces + " ounces";
  }
}
