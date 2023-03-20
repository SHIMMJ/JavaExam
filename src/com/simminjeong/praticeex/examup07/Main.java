package com.simminjeong.praticeex.examup07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// 총무부 리더 ‘홍길동(41세)’의 인스턴스를 생성하고 직렬화하여 company.dat 파일에 쓰는 프로그램을 작성하시오.
// 직렬화를 위해 위의 2개 클래스를 일부 수정해도 됩니다.


public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Department chongle = new Department("총무부", new Employee("홍길동", 41));

        // 총무부리더를 직렬화하여 저장
        FileOutputStream fos = new FileOutputStream("company.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(chongle);
        oos.flush();
        oos.close();

        // 총무부리더 복원
        // 로드
//        FileInputStream fis=new FileInputStream("company.dat");
//        ObjectInputStream ois=new ObjectInputStream(fis);
//        
//        if (ois.readObject() instanceof Department) {
//            Department rechongle = (Department) ois.readObject();    
//          
//        }
//        ois.close();


    }
}
