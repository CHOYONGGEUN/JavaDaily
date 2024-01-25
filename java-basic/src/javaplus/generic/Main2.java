package javaplus.generic;

public class Main2 {
    public static void main(String[] args) {
        Sample<Integer> s1 = new Sample<>();
        s1.setValue(1);
        Sample<Double> s2 = new Sample<>();
        s2.setValue(1.0);
        Sample<String> s3 = new Sample<>();
        s3.setValue("1");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }
}
