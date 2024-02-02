package javaex;

public class Function {
    public static void main(String[] args) {
        MyFunction myfunc = (str) -> System.out.println(str);
        myfunc.print("Hello World");
    }
}
