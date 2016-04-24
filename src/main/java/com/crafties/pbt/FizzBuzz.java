package com.crafties.pbt;

public class FizzBuzz {

    public String display(int number) {

        if (isMultipleOfThree(number) && isMultipleOfFive(number)) {
            return "fizzbuzz";
        }

        if (isMultipleOfThree(number)) {
            return "fizz";
        }

        if (isMultipleOfFive(number)) {
            return "buzz";
        }

        return String.valueOf(number);
    }

    private boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }
}
