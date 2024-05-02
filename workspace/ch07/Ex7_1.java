class Tv { 		//부모 클래스
    boolean power; //전원상태 on/off
    int channel; //채널

    void power()		{ 	power = !power; }
    void channelUp()		{ 	++ channel; 	}
    void channelDown() 	{	-- channel;		}
}

class SmartTv extends Tv{	//smarttv는 tv에 캡션(자막)을 보여주는 기능을 추가한다. (상속)
    boolean caption;		// 자막상태 on/off
    void displayCaption(String text) {
        if (caption) {		// 자막상태가 on일 때만 text를 출력
            System.out.println(text);
        }
    }
}
public class Ex7_1 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;
        stv.channelUp();
        System.out.println(stv.channel);
        stv.displayCaption("Hello, World");
        stv.caption = true; //자막 기능을 on
        stv.displayCaption("Hello, World");
    }
}
