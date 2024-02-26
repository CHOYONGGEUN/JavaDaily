package javaplus.exceptionhandlingsyntax.ex02;

public class MultiCatch_1 {
    public static void main(String[] args) {

        // #1. try-catch
        try{
            System.out.println(3/0); //실행예외(ArithmeticException)
            System.out.println("프로그램 종료");

        }catch(ArithmeticException e){
            System.out.println("숫자는 0으로 나눌 수 없습니다.");
            System.out.println("프로그램 종료");
        }

        //#2. try-catch finally
        try{
            System.out.println(3/0); //실행예외(ArithmeticException)

        }catch(ArithmeticException e){
            System.out.println("숫자는 0으로 나눌 수 없습니다.");
        }
        finally{
            System.out.println("프로그램 종료");
        }

        try{
            int num = Integer.parseInt("10A"); //실행예외(NumberFormatException)

        }catch(NumberFormatException e){
            System.out.println("숫자로 바꿀 수 없습니다.");
        }
        finally{
            System.out.println("프로그램 종료");
        }

        //#2. 다중 try-catch
        try{
            System.out.println(3/1);
            int num = Integer.parseInt("10A"); //실행예외(NumberFormatException)
        }
        catch(ArithmeticException e){
            System.out.println("숫자로 0으로 나눌 수 없습니다.");
        }
        catch(NumberFormatException e){
            System.out.println("숫자로 바꿀 수 없습니다.");
        }
        finally{
            System.out.println("프로그램 종료");
        }

    }
}
