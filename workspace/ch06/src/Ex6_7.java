package workspace.ch06.src;

class Data2 {int x;}

public class Ex6_7 {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() x = " + d.x);

        change(d); // main에 있는 d의 값이 change의 영역으로 복사가 되어진다.
            // 따라서 이 참조변수도 객체(인스턴스)의 주소값을 가지고 있음 (변경가능)
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(Data2 d) { //참조형 매개변수
        d.x = 1000;  //참조변수 d가 가르키는 x에 저장
        System.out.println("change() : x = " + d.x);
    }
}
