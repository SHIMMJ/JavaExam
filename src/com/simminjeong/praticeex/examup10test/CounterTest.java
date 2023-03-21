package com.simminjeong.praticeex.examup10test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.simminjeong.praticeex.examup10.Counter;

public class CounterTest {

    @Test
    public void setter_테스트() {
        Counter counter = new Counter();
        counter.setCount(5);

    }

    @Test
    public void getter_테스트() {
        Counter counter = new Counter();
        counter.getCount();

    }

    @Test
    public void 증가메서드_테스트() {
        Counter counter = new Counter();
        Counter counter1 = new Counter();

        counter.setCount(5);
        counter.increase();

        counter1.setCount(5);

        assertEquals(6, counter.getCount());
        assertEquals(counter1.getCount() + 1, counter.getCount());

    }


}
