package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 이름을 가지는 Person 클래스를 작성하시오. Person 은 반드시 이름을 포함해야 합니다.
// 이름이 ‘홍길동', ‘한석봉' 인 Person 인스턴스를 생성하고, ArrayList에 담습니다.
// ArrayList에 담긴 모든 Person 인스턴스의 이름을 표시하시오.

// 연습문제 2-3 에서 작성한 Person 클래스로 생성한 ‘홍길동’, ‘한석봉'의 나이를 각각 20, 25살 이라고 할 때, 이름과 나이를 쌍으로 적당한 컬렉션에 넣습니다.
// 그 다음, 컬렉션에 저장한 값을 하나씩 다음과 같이 출력합니다.
// “홍길동의 나이는 20살”
// “한석봉의 나이는 25살”

class Person {
    String name;
    int age;
}


public class Main0314 {
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "홍길동";
        p1.age = 20;
        p2.name = "한석봉";
        p2.age = 25;

        Map<String, Integer> info = new HashMap<>();
        info.put(p1.name, p1.age);
        info.put(p2.name, p2.age);

        for (String key : info.keySet()) {
            int value = info.get(key);
            System.out.println(key + "의 나이는 " + value + "살");
        }

    }

}
