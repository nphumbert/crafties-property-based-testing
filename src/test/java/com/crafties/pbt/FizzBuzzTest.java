package com.crafties.pbt;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assume.assumeTrue;

@RunWith(JUnitQuickcheck.class)
public class FizzBuzzTest {

    @Property(shrink = false)
    public void should_display_number_as_string(@InRange(minInt = 1, maxInt = 100) int number) {
        // given
        assumeTrue(number % 3 != 0);
        assumeTrue(number % 5 != 0);
        FizzBuzz fizzbuzz = new FizzBuzz();

        // when
        String result = fizzbuzz.display(number);

        // then
        assertThat(result).isEqualTo(String.valueOf(number));
    }

    @Property(shrink = false)
    public void should_display_fizz_when_multiple_of_3(@InRange(minInt = 1, maxInt = 100) int number) {
        // given
        assumeTrue(number % 3 == 0);
        assumeTrue(number % 5 != 0);
        FizzBuzz fizzbuzz = new FizzBuzz();

        // when
        String result = fizzbuzz.display(number);

        // then
        assertThat(result).isEqualTo("fizz");
    }

    @Property(shrink = false)
    public void should_display_buzz_when_multiple_of_5(@InRange(minInt = 1, maxInt = 100) int number) {
        // given
        assumeTrue(number % 3 != 0);
        assumeTrue(number % 5 == 0);
        FizzBuzz fizzbuzz = new FizzBuzz();

        // when
        String result = fizzbuzz.display(number);

        // then
        assertThat(result).isEqualTo("buzz");
    }

    @Property(shrink = false)
    public void should_display_fizzbuzz_when_multiple_of_5_and_3(@InRange(minInt = 1, maxInt = 100) int number) {
        // given
        assumeTrue(number % 3 == 0);
        assumeTrue(number % 5 == 0);
        FizzBuzz fizzbuzz = new FizzBuzz();

        // when
        String result = fizzbuzz.display(number);

        // then
        assertThat(result).isEqualTo("fizzbuzz");
    }

}
