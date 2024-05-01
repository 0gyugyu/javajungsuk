package workspace.ch06.src;

class Data {int x;}
public class Ex6_6 {
    public static void main(String[] args) {
        Data d = new Data(); //객체 생성
        d.x = 10;
        System.out.println("main() x = " + d.x);

        change(d.x); //16번 라인 메서드 실행
        // 대기하고 있던 메인 메서드가 다시 실행
        System.out.println("After change(d.x)"); //출력
        System.out.println("main() : x = " + d.x); //출력
    }

    static void change(int x) {  //기본형 매개변수
        //이름만 같은 지역변수를 변경 main의 x를 변경한게 아님..
        x = 1000;

        //가까운 지역변수 x값을 가져옴
        System.out.println("change() : x = " + x);

        // 처리가 끝나고 다시 10 라인으로 가서 change 메소드는 역할 끝으로 없어짐
    }
}
// stack이 완전히 비워지면서 프로그램 종료