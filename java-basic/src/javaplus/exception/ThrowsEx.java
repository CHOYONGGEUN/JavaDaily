package javaplus.exception;

public class ThrowsEx {
    public static void main(String[] args) {
        ThrowsEx ex = new ThrowsEx();
        try {
            ex.throwsException(11);
        } catch (Exception e) {
            System.err.println("예외 발생: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void throwsException(int number) throws Exception {
        if (number > 10) {
            throw new Exception("숫자가 10보다 큽니다.");
        }
        System.out.println("입력 숫자: " + number);
    }
}
