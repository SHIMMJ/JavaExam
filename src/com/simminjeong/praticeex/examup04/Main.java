package com.simminjeong.praticeex.examup04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import com.simminjeong.praticeex.exam12pratice.Asset;

class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
    
}

public class Main {

    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<>();

        
        students.add(new Student(1,"홍길동"));
        students.add(new Student(3,"홍길동"));
        students.add(new Student(4,"홍길동"));
        students.add(new Student(2,"홍길동"));
        
        students.sort(new StudentComparator());   //1
        
        // 익명클래스
        students.sort(new Comparator<Student>() { //2

            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
  
        });

    }

}
