package test.java;

import main.java.BMICalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    @Test
    void testConstructor() {
        BMICalculator bmiCalculator = new BMICalculator("Max", "Mustermann", 180, 75, 'm');
        assertEquals("Max", bmiCalculator.getFirstname());
        assertEquals("Mustermann", bmiCalculator.getLastname());
        assertEquals(180, bmiCalculator.getBodyHeight());
        assertEquals(75.0, bmiCalculator.getBodyWeight());
        assertEquals('m', bmiCalculator.getGender());
    }

    @Test
    void testCalculateBMI() {
        BMICalculator bmiCalculator = new BMICalculator("Lisa", "Musterfrau", 170, 70, 'w');
        assertEquals(24.22, bmiCalculator.calculateBMI(), 0.01);

        BMICalculator bmiCalculator2 = new BMICalculator("Tom", "Beispiel", 180, 120, 'm');
        assertEquals(37.04, bmiCalculator2.calculateBMI(), 0.01);
    }

    @Test
    void testCalculateBMICategory() {
        BMICalculator bmiCalculator = new BMICalculator("Lisa", "Musterfrau", 170, 70, 'w');
        assertEquals(1, bmiCalculator.calculateBMICategory());

        BMICalculator bmiCalculator2 = new BMICalculator("Tom", "Beispiel", 180, 120, 'm');
        assertEquals(2, bmiCalculator2.calculateBMICategory());
    }

    @Test
    void testGetBMICategoryName() {
        BMICalculator bmiCalculator = new BMICalculator("Lisa", "Musterfrau", 170, 70, 'w');
        assertEquals("Übergewicht", bmiCalculator.getBMICategoryName());

        BMICalculator bmiCalculator2 = new BMICalculator("Tom", "Beispiel", 180, 120, 'm');
        assertEquals("Sehr starkes Übergewicht", bmiCalculator2.getBMICategoryName());
    }
}
