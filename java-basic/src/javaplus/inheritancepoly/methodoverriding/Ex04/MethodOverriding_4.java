package javaplus.inheritancepoly.methodoverriding.Ex04;

public class MethodOverriding_4 {
}

class A{
    protected void abc(){}
}

class B1 extends A {
    public void abc() {

    }
}class B2 extends A {
//     void abc() { // default 접근 지정자(좁아져서 불가능)
//
//    }
}class B3 extends A {
    protected void abc() {

    }
}//class B4 extends A { // private 접근지정자( 좁아져서 불가능)
//    private void abc() {
//
//    }
//}