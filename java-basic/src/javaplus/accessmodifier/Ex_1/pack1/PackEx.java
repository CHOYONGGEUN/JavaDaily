package javaplus.accessmodifier.Ex_1.pack1;

public class PackEx {
    public int a = 1;
    protected int b = 2; //같은 패키지 + 다른 패캐지 자식 클래스
    int c = 3;
    private int d = 4;

    public void print(){
        System.out.print(a + " ");//가능
        System.out.print(b + " " );//가능
        System.out.print(c + " ");//가능
        System.out.println(d);//가능
        System.out.println();
    }
}
