package javaplus.interface_.ex02;

public class InheritanceOfInterface_1 {
}

interface A{}
interface B{}

//1. 단일인터페이스 상속
class C implements  A{

}

//2. 다중 인터페이스 상속
class D implements A, B{

}

//3. 클래스와 인터페이스를 한번에 상속(extends와 implements의 순서는 변경 불가)
class E extends D implements  A,B{

}