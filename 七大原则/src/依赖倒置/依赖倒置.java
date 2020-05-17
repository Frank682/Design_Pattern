package 依赖倒置;

public class 依赖倒置 {
    public static void main(String[] args)
    {
        Customer wang=new Customer();
        System.out.println("顾客购买以下商品：");
        wang.shopping(new OneShop());
        wang.shopping(new TwoShop());
    }
}
