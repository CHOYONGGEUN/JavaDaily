package javaplus.exceptionhandlingsyntax.ex05;

import java.io.IOException;
import java.io.InputStreamReader;


//참고 . System.in 리소스를 해제하면 더 이상 콘솔 입력이 불가
public class TryWithResource {
    public static void main(String[] args) {
        //#자동 리소스 헤제
        try(InputStreamReader isr1 = new InputStreamReader(System.in)){
            char input = (char) isr1.read();
            System.out.println("입력글자 = " + input);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        //#2. 수동 리소스 해제
        InputStreamReader isr2 = null;
        try{
            isr2 = new InputStreamReader(System.in);
            char input = (char) isr2.read();
            System.out.println("입력글자 = " + input);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            //리소스 해제 구문
            if(isr2!=null){
                try {
                    isr2.close(); //리소스 해제
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
