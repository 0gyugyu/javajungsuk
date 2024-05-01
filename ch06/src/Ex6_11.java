package workspace.ch06.src;

class Data_1{
    int value;
    Data_1() {} //기본생성자를 컴파일러가 자동으로 추가
}

class  Data_2{
    int value;

//  Data_2() {} //기본 생성자 꼭 해야함
    Data_2(int x) { //매개변수가 있는 생성자.
        value = x;
    }
}
// 클래스 만들 때 기본생성자를 만드는 습관을 들이자.
// 에러는 찾기가 힘듬

public class Ex6_11 {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2(); //compile error 발생
        //The constructor Data_2() is undefined
    }
}
