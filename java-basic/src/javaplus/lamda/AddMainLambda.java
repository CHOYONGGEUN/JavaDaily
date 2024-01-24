package javaplus.lamda;

public class AddMainLambda {
    public static void main(String[] args) {
        IAdd lambda = (x,y) -> x+y;//람다식 끝에 세미콜론

        int result = lambda.add(1,2);
        System.out.println(result);
    }
}
