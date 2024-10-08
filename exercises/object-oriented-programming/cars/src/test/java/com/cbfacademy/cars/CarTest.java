package com.cbfacademy.cars;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName(value = "Car tests")
public class CarTest extends ClassExerciseTest {

    // Method to provide test arguments
    public static Stream<Arguments> getCarArguments() {
        return Stream.of(
                Arguments.of(new Car("Toyota", "Corolla", 2010, "Red"), "Toyota", "Corolla", "Red", 2010),
                Arguments.of(new Car("Honda", "Civic", 2015, "Blue"), "Honda", "Civic", "Blue", 2015),
                Arguments.of(new Car("Ford", "Focus", 2018, "Green"), "Ford", "Focus", "Green", 2018)
        );
    }

    @ParameterizedTest
    @MethodSource("getCarArguments")
    @DisplayName("Car object has valid getMake() method")
    public void testCarObjectHasValidGetMakeMethod(Car car, String make, String model, String colour, int year) {
        assertEquals(make, car.getMake());
    }

    @ParameterizedTest
    @MethodSource("getCarArguments")
    @DisplayName("Car object has valid getModel() method")
    public void testCarObjectHasValidGetModelMethod(Car car, String make, String model, String colour, int year) {
        assertEquals(model, car.getModel());
    }

    @ParameterizedTest
    @MethodSource("getCarArguments")
    @DisplayName("Car object has valid getYear() method")
    public void testCarObjectHasValidGetYearMethod(Car car, String make, String model, String colour, int year) {
        assertEquals(year, car.getYear());
    }

    @ParameterizedTest
    @MethodSource("getCarArguments")
    @DisplayName("Car object has valid getColour() method")
    public void testCarObjectHasValidGetColourMethod(Car car, String make, String model, String colour, int year) {
        assertEquals(colour, car.getColour());
    }

    @ParameterizedTest
    @MethodSource("getCarArguments")
    @DisplayName("Car object has valid setColour() method")
    public void testCarObjectHasValidSetColourMethod(Car car, String make, String model, String colour, int year) {
        String newColour = "black";
        car.setColour(newColour);
        assertEquals(newColour, car.getColour());
    }

    @ParameterizedTest
    @MethodSource("getCarArguments")
    @DisplayName("Car object has valid getDetails method")
    public void testCarObjectHasValidGetDetailsMethod(Car car, String make, String model, String colour, int year) {
        String details = car.getDetails();

        assertTrue(details.indexOf(make) >= 0 && details.indexOf(model) >= 0 && details.indexOf(colour) >= 0
                && details.indexOf(Integer.toString(year)) >= 0);
    }
}
