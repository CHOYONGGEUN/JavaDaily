package javaplus.lamda;

public class AddMainAnnony {
    public static void main(String[] args) {
        IAdd a = new IAdd() {
            @Override
            public int add(int x, int y) {
                return x+y;
            }
        };
        int result = a.add(1,2);
        System.out.println(result);
    }

}
