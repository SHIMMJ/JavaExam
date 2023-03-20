package com.simminjeong.praticeex.examup04;

//금고 클래스에 담는 인스턴스의 타입은 미정
//금고에는 1개의 인스턴스를 담을 수 있음
//put() 메서드로 인스턴스를 저장하고 get() 메서드로 인스턴스를 얻을 있음
//get() 으로 얻을 때는 별도의 타입 캐스팅을 사용하지 않아도 됨




public class enumTest {
    
    enum KeyType{
        PADLOCK(1024), 
        BUTTON(10000), 
        DIAL(30000),
        FINGER(1000000);
        
        private final int count;

        private KeyType(int count) {
            this.count = count;
        }

        public int getCount() {
            return count;
        }
        

    }
    
//    public void put(T data) {
//        this.data=data;
//    }
//    public T get() {
//        return this.data;
//    }
    
    public static void main(String[] args) {
        
        System.out.println(KeyType.BUTTON.getDeclaringClass());
        
//        
//        int keytypeCount=KeyType.valueOf(null)

                
        
    }


}
