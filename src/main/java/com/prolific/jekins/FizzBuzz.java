package com.prolific.jekins;

public class FizzBuzz {

    public String play(int number) {

        if (number == 0) throw new IllegalArgumentException("Number must not be zero");

        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";

        return String.valueOf(number);
    }


}
