package javaplus.lamda;

interface IAdd2 {
    int add(int x, int y);



    //아래처럼 구성요소가 있더라도 결국은 추상 메서드가 하나이기 때문에 함수형 인터페이스이다.
    final boolean isNumber =true;
    /*default void print() {};
    * static void print2() {}*/
}
