package 简单工厂;

public class ConcreteFactory implements AbstractFactory{
    public Product1 newProduct1()
    {
        System.out.println("具体工厂 1 ");
        return new ConcreteProduct();
    }
    public Product2 newProduct2()
    {
        System.out.println("具体工厂 1");
        return new ConcreteProduct21();
    }
}
