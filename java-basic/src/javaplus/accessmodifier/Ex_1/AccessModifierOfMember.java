package javaplus.accessmodifier.Ex_1;

import javaplus.accessmodifier.Ex_1.pack1.PackEx;
import javaplus.accessmodifier.Ex_1.pack1.PackEx2;
import javaplus.accessmodifier.Ex_1.pack2.PackEx4;
import javaplus.accessmodifier.Ex_1.pack2.ParckEx3;

public class AccessModifierOfMember {
    public static void main(String[] args) {

        PackEx a = new PackEx();
        PackEx2 b = new PackEx2();
        ParckEx3 c = new ParckEx3();
        PackEx4 d= new PackEx4();


        a.print();
        b.print();
        c.print();
        d.print();
    }
}
