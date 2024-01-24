package javaplus.lamda;

public class AddMainLambda2 {
    public static void main(String[] args) {
        IAdd func = makeFunction();
        int result = func.add(1,2);
        System.out.println(result);
    }
    public static IAdd makeFunction(){
        return (x, y) -> x+y;
    }
}
