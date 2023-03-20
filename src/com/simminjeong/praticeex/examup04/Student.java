package com.simminjeong.praticeex.examup04;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student>, Comparator<Student> {
    private String name;
    private int id;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    Student(int id, String name) {
        this.name = name;
        this.id = id;
    }


    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + "]";
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return id == other.id && Objects.equals(name, other.name);
    }



    @Override
    public int compareTo(Student o) {
        return (id < o.id) ? -1 : ((id == o.id) ? 0 : 1); // 숫자 오름차순
        // return this.name.compareTo(o.name) * -1; // 이름 내림차순 기본이 오름차순

    }


    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.id, o2.id);
    }
}


