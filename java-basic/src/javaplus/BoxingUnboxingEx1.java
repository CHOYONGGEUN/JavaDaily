package javaplus;

public class BoxingUnboxingEx1 {
    public static void main(String[] args) {
        int i = 10;
        Integer boxedInt = i; //자동 박싱

        //자동 박싱 사용
        Integer autoBoxedInt = i;

        //언박싱: 래퍼 클래스 객체를 기본 타입으로 변환
        Integer wrappedInt = 20;
        //명시적 언박싱
        int unboxedInt = wrappedInt.intValue();

        //자동 언박싱 사용
        int autoUnboxedInt = wrappedInt;

        System.out.println("명시적 박싱된 정수: " + boxedInt);
        System.out.println("자동 박싱된 정수: " + autoBoxedInt);
        System.out.println("명시적 언박싱된 정수: " + unboxedInt);
        System.out.println("자동 언박싱된 정수: " + autoUnboxedInt);



    }
}
