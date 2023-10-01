package hw3;

import org.junit.jupiter.api.Test;
import seminars.third.hw.MainHW;
import static org.assertj.core.api.Assertions.*;


public class homework3Tests {


    @Test
    void testOddNumber() {
        MainHW homework = new MainHW();
        assertThat(homework.evenOddNumber(6)).isEqualTo(true);
        assertThat(homework.evenOddNumber(5)).isEqualTo(false);
    }

    @Test
    void numInIntervalTest() {
        MainHW homework = new MainHW();
        assertThat(homework.checkNumInInterval(26)).isEqualTo(true);
        assertThat(homework.checkNumInInterval(101)).isEqualTo(false);
    }


}
