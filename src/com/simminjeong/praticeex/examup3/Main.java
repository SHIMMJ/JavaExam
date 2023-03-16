package com.simminjeong.praticeex.examup3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        
        List<String> strs=new ArrayList<>();
        strs.add("이동학");
        strs.add("박경덕");
        strs.add("강태근");
        strs.add("최유림");
        
        Collections.sort(strs);
        System.out.println(strs);
        
        List<Integer> nums=new ArrayList<>();
        nums.add(5);
        nums.add(1);
        nums.add(8);
        nums.add(2);
        
        Collections.sort(nums);
        System.out.println(nums);
        
        
        List<Student> students=new ArrayList<>();
        
        students.add(new Student(0,"이동학"));
        students.add(new Student(1,"박경덕"));
        students.add(new Student(2,"강태근"));
        students.add(new Student(3,"최유림"));
        
        
       
        
        Collections.sort(students);//내가 만든건 안해줘
        // 어떤 기준으로 해줘야하는지 모르기 때문에
        System.out.println(students);
 
        
        
        
        
        List<Student> list = new ArrayList<>();
        //list가 arraylist보다 상위에 있거나
        //list 인터페이스를 쓰지 않았을까 생각
        //f3 해서 한번 찾아보기
        // 다형성에 의해서
        
        

    }

}
