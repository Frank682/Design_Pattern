package 访问者;

import javax.swing.text.Element;

class ConcreteElementB implements Element {
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
    public String operationB()
    {
        return "具体元素B的操作。";
    }
}
