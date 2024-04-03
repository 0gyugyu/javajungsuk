package workspace.ch06.src;

public class Ex6_3 {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number
                        + "이며, 크기는 (" + c1.width + ", " + c1.height + ")"   );
        System.out.println("c2은 " + c2.kind + ", " + c2.number
                        + "이며, 크기는 (" + c2.width + ", " + c2.height + ")"   );
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");

        Card.width = 50; //기존의 c1.으로 적게되면 인스턴스 변수랑 헷갈릴 수 있게 되어진다
        Card.height = 50; // 따라서 클래스 변수(CV)를 이용해서 Card.으로 작성해준다

        System.out.println("c1은 " + c1.kind + ", " + c1.number
                + "이며, 크기는 (" + c1.width + ", " + c1.height + ")"   );
        System.out.println("c2은 " + c2.kind + ", " + c2.number
                + "이며, 크기는 (" + c2.width + ", " + c2.height + ")"   );

    }
}

class Card{
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}
