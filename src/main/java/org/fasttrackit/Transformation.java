package org.fasttrackit;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Transformation {
    public static double fahrenheitToCelsius(double temperature){
        String bigDecimal = roundDecimalUsingBigDecimal(Double.toString((temperature - 32) * 5/9), 9);
        return Double.parseDouble(bigDecimal);
    }

    public static double celsiusToFahrenheit(double temperature){
        String bigDecimal = roundDecimalUsingBigDecimal(Double.toString((temperature * 9/5 + 32)), 9);
        return Double.parseDouble(bigDecimal);

    }

    public static String roundDecimalUsingBigDecimal(String strValue, int decimalPlace) {
        return new BigDecimal(strValue).setScale(decimalPlace, RoundingMode.HALF_UP).stripTrailingZeros().toPlainString();
    }

}
