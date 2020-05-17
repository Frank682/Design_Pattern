package 抽象工厂;

public class AbstractFactoryTest {
    public static void main(String[] args)
    {
        try
        {
            Product a;
            AbstractFactory af;
            af=(AbstractFactory) .getObject();
            a=af.newProduct();
            a.show();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
