package com.simminjeong.praticeex.examup10test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.simminjeong.praticeex.examup10.Bank;

public class BankTest {

    @Test
    public void setter_테스트() {

        Bank bank = new Bank();
//        bank.setName("은행");
    }
    
    @Test
    public void getter_테스트() {
        
        Bank bank = new Bank();
        bank.setName("은행은행");
        assertEquals("은행은행", bank.getName());
//        assertEquals("은행", bank.getName());
    }

    // 메소드가 특정 예외를 throw 하는지 여부 체크
    @Test
    (expected = IllegalArgumentException.class)
    // IllegalArgumentException 예외를 throw하면 테스트 성공
    public void throwsExceptionWithTwoCharName() {
        throw new IllegalArgumentException();
    }

}
