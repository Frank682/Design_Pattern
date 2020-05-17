package 访问者;
import java.util.*;
interface Element {
    void accept(Visitor visitor);
}
