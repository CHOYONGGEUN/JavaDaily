package javaplus.reference;



class Birthday2 {
    int day;
    int month;
    int year;

    public void setYear(int year){
        this.year = year;
    }

    public void printThis(){
        System.out.println(this);
    }
}

public class ThisEx {
    public static void main(String[] args) {

        Birthday2 b1 = new Birthday2();
        Birthday2 b2 = new Birthday2();

        System.out.println(b1);
        b1.printThis();

        System.out.println(b2);
        b2.printThis();



    }
}
