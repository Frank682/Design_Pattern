package 里氏替换;

public class 里氏替换主 {
    public 里氏替换主() {
    }

    public static void main(String[] args)
    {
        Bird bird1=new Swallow();
        Bird bird2=new SmallBird();
        bird1.setSpeed(120);
        bird2.setSpeed(120);
        System.out.println("如果飞行300公里：");
        System.out.println("燕子将飞行"+bird1.getFlyTime(300)+"小时.");
        System.out.println("Small鸟将飞行"+bird2.getFlyTime(300)+"小时。");
    }
}
