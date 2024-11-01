package com.cbfacademy.shapes;

public class PaintCalculator {
    public static void main(String[] args) {
        // Paint coverage in square feet per gallon
        Paint paint = new Paint(10.0); // Assume 10 sq ft per gallon

        // Create shapes
        Shape deck = new Rectangle(35, 20); // Rectangular deck
        Shape ball = new Sphere(15); // Ball with radius 15
        Shape tank = new Cylinder(10, 30); // Tank with radius 10 and height 30

        // Calculate paint needed for each shape
        double paintForDeck = paint.getAmount(deck);
        double paintForBall = paint.getAmount(ball);
        double paintForTank = paint.getAmount(tank);

        // Print amount of paint needed for each shape
        System.out.printf("Paint needed for deck: %.2f gallons%n", paintForDeck);
        System.out.printf("Paint needed for ball: %.2f gallons%n", paintForBall);
        System.out.printf("Paint needed for tank: %.2f gallons%n", paintForTank);

        // Calculate and print total amount of paint needed
        double totalPaintNeeded = paintForDeck + paintForBall + paintForTank;
        System.out.printf("Total paint needed: %.2f gallons%n", totalPaintNeeded);
    }
}
