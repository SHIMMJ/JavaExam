package com.simminjeong.praticeex.examup10test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.simminjeong.praticeex.examup10.UpCounter;

public class UpCounterTest {

    @Test
    public void setter_테스트() {
        UpCounter counter = new UpCounter();
        counter.setCount(5);

    }

    @Test
    public void getter_테스트() {
        UpCounter counter = new UpCounter();
        counter.getCount();

    }

    @Test
    public void 증가메서드_테스트() {
        UpCounter counter = new UpCounter();
        UpCounter counter1 = new UpCounter();

        counter.setCount(5);
        counter.count();

        counter1.setCount(5);

        assertEquals(6, counter.getCount());
        assertEquals(counter1.getCount() + 1, counter.getCount());

    }

}
