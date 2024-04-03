package workspace.ch06.src;

public class Ex6_4 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result = mm.max(5, 3);     //둘 중에 큰 값을 반환하는 메서드
        long result1 = mm.add(5, 3);
        long result2 = mm.subtract(5, 3);
        long result3 = mm.multiply(5, 3);
        double result4 = mm.divide(5, 3);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}

class MyMath{
    long add(long a, long b) {
        long result = a + b;
        return result;
    //  return a + b;   //이렇게도 표현가능
    }
    // 두 값을 받아서 둘중에 큰 값을 반환하는 메서드를 작성하시오.
    long max(long a, long b){
        long result = 0; //결과를 담을 result 함수를 초기화
        if(a>b){
            result = a;
        }else {
            result = b;
        }
        return result;
    }

    /*
    // 두 값을 받아서 둘중에 큰 값을 반환하는 메서드를 작성하시오 -> 삼항연산자
    long max(long a, long b){
        return a > b ? a : b;
    }
    */

    long subtract(long a, long b) {return a-b;}
    long multiply(long a, long b) {return a*b;}
    double divide(double a, double b) {return a/b;}
}
