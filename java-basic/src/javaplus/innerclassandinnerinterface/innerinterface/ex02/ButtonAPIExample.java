package javaplus.innerclassandinnerinterface.innerinterface.ex02;

public class ButtonAPIExample {
    public static void main(String[] args) {
        //#1. 개발자 1. 클릭했을 때 음악재생
        Button btn1 = new Button();
        btn1.setOnClikcListner(new Button.OnClickListner() {
            @Override
            public void onClick() {
                System.out.println("개발자1 : 음악재생");
            }
        });
        btn1.onClick(); // 개발자2: 네이버 접속

        // #1. 개발자 1. 클릭했을 때 음악재생
        Button btn2 = new Button();
        btn2.setOnClikcListner(new Button.OnClickListner() {
            @Override
            public void onClick() {
                System.out.println("개발자2 : 네이버 접속");
            }
        });
        btn2.onClick(); // 개발자2: 네이버 접속

    }

}
class Button{
    OnClickListner ocl;
    void setOnClikcListner(OnClickListner ocl){
        this.ocl = ocl;
    }
    interface OnClickListner{
        void onClick();
    }

    void onClick(){
        ocl.onClick();
    }
}


