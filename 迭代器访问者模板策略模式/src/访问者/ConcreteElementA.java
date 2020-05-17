package 访问者;

import javax.swing.text.Element;

class ConcreteElementA implements Element {
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
    public String operationA()
    {
        return "具体元素A的操作。";
    }
}
