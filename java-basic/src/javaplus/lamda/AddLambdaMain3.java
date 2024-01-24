package javaplus.lamda;

public class AddLambdaMain3 {
    public static void main(String[] args) {
        int n = result((x,y)-> x+ y); //메서드의 매개변수에 람다식 전달
        System.out.println(n); //3
    }
    public static int result(IAdd lambda){
        return lambda.add(1,2);
    }
}
//메서드의 매개변수에 바로 입력값을 넣는 방식이다.