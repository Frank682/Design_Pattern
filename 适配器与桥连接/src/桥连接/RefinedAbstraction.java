package 桥连接;

public class RefinedAbstraction extends  Abstraction{
    protected RefinedAbstraction(Implementor imple)
    {
        super(imple);
    }
    public void Operation()
    {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问" );
        imple.OperationImpl();
    }
}
