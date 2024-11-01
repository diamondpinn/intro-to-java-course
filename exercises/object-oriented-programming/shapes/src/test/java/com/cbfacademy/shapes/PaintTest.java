package com.cbfacademy.shapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Paint Tests")
public class PaintTest {

    private Paint paint;
    private final double delta = 0.01;

    @BeforeEach
    void setUp() {
        paint = new Paint(10.0); // Paint with 10 sq ft coverage per gallon
    }

    @Test
    @DisplayName("getAmount() method calculates amount correctly for a Rectangle")
    public void getAmount_CalculatesAmountCorrectlyForRectangle() {
        // Given a rectangle of 50 sq ft
        Shape rectangle = new Rectangle(5, 10); // Area = 5 * 10 = 50 sq ft
        double expectedAmount = 5.0; // 50 sq ft / 10 sq ft per gallon

        // When calculating the paint amount
        double calculatedAmount = paint.getAmount(rectangle);

        // Then the calculated amount should match the expected amount
        assertEquals(expectedAmount, calculatedAmount, delta);
    }
}
