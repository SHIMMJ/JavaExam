package com.simminjeong.praticeex.examup10test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.simminjeong.praticeex.examup10.Account;

public class AccountTest {

    @Test
    public void 생성자_테스트() {
        Account account = new Account("홍길동", 30000);
        assertEquals("홍길동", account.getOwner());
        assertEquals(30000, account.getBalance());
    }

    @Test
    public void transfer_테스트() {
        Account account = new Account("홍길동", 30000);
        Account account2 = new Account("한석봉", 0);

        account.transfer(account2, 10000);

        assertEquals(20000, account.getBalance());
        assertEquals(10000, account2.getBalance());

        Account account3 = new Account("한석봉(가짜)", 0);
        account3.transfer(account, 10000);
        assertEquals(account, 20000);
        assertEquals(account3, 0);

    }

}
