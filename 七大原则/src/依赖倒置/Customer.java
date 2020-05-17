package 依赖倒置;

public class Customer {
    public void shopping(Shop shop)
    {
        //购物
        System.out.println(shop.sell());
    }
}
