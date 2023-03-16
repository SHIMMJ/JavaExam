package com.simminjeong.praticeex.exam14;

import java.util.Calendar;
import java.util.Date;

public class Main {

    // 현재의 날짜를 Date 형으로 얻는다
    // 얻은 날짜정보를 Calendar 에 설정한다
    // Calendar 에서 일(day) 값을 얻는다.
    // 얻은 값에 100을 더한 값을 Calendar 의 일 에 설정한다
    // Calendar 의 날짜정보를 Date 형으로 변환한다
    // SimpleDateFormat 을 이용하여 Date 인스턴스의 내용을 표시한다


    public static void main(String[] args) {

     // 현재의 날짜를 Date 형으로 얻는다
        Date now = new Date();

     // 얻은 날짜정보를 Calendar 에 설정한다
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(now);
        
     // Calendar 에서 일(day) 값을 얻는다.
        int day=calendar.get(Calendar.DATE);
        
     // 얻은 값에 100을 더한 값을 Calendar 의 일 에 설정한다
//        day+100
        
        



    }

}
