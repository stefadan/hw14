package org.fasttrackit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TDDTestTransorm {

    @Test
    @DisplayName("GIVEN temperature Fahrenheit =100 WHEN Fahrenheit To Celsius")
    public void testFahrenheitToCelsius100(){
        //GIVEN
        TDDTest test = new TDDTest();
        double temperatueFahrenheit = 100;
        double result;
        //WHEN
        result = Transformation.fahrenheitToCelsius(temperatueFahrenheit);
        //THEN
        Assertions.assertThat(result).isEqualTo(37.777777778);

    }

    @Test
    @DisplayName("GIVEN temperature Fahrenheit =0 WHEN Fahrenheit To Celsius")
    public void testFahrenheitToCelsiusTest0(){
        //GIVEN
        TDDTest test = new TDDTest();
        double temperatueFahrenheit = 0;
        double result;
        //WHEN
        result = Transformation.fahrenheitToCelsius(temperatueFahrenheit);
        //THEN
        Assertions.assertThat(result).isEqualTo(-17.777777778);

    }

    @Test
    @DisplayName("GIVEN temperature Fahrenheit =50 WHEN Fahrenheit To Celsius")
    public void testFahrenheitToCelsiusTest50(){
        //GIVEN
        TDDTest test = new TDDTest();
        double temperatueFahrenheit = 50;
        double result;
        //WHEN
        result = Transformation.fahrenheitToCelsius(temperatueFahrenheit);
        //THEN
        Assertions.assertThat(result).isEqualTo(10);

    }

    @Test
    @DisplayName("GIVEN temperature Celsius = 37.777777778 WHEN Celsius To Fahrenheit")
    public void testCelsiusToFahrenheit100(){
        //GIVEN
        TDDTest test = new TDDTest();
        double temperatureCelsius = 37.777777778;
        double result;
        //WHEN
        result = Transformation.celsiusToFahrenheit(temperatureCelsius);
        //THEN
        Assertions.assertThat(result).isEqualTo(100);
    }

    @Test
    @DisplayName("GIVEN temperature Celsius = -17.777777778 WHEN Celsius To Fahrenheit")
    public void testCelsiusToFahrenheit0(){
        //GIVEN
        TDDTest test = new TDDTest();
        double temperatureCelsius = -17.777777778;
        double result;
        //WHEN
        result = Transformation.celsiusToFahrenheit(temperatureCelsius);
        //THEN
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("GIVEN temperature Celsius = 10 WHEN Celsius To Fahrenheit")
    public void testCelsiusToFahrenheit50(){
        //GIVEN
        TDDTest test = new TDDTest();
        double temperatureCelsius = 10;
        double result;
        //WHEN
        result = Transformation.celsiusToFahrenheit(temperatureCelsius);
        //THEN
        Assertions.assertThat(result).isEqualTo(50);
    }

}
