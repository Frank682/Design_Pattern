package 桥连接;

public class BridgeTest {
    public static void main(String[] args)
    {
        Implementor imple=new ConcreteImplementorA();
        Abstraction abs=new RefinedAbstraction(imple);
        abs.Operation();
    }
}
