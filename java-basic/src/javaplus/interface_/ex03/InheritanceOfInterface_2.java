package javaplus.interface_.ex03;

public class InheritanceOfInterface_2 {
}


//접근 지정자
interface A{
    public abstract void abc();
}
interface B{
    void bcd(); //생략시 public abstract
}
class C implements A{
    @Override
    public void abc() {
        //...
    }
}
//class D implements B{
//    @Override
//     void bcd() { // public -> default 불가능
//
//    }
//}