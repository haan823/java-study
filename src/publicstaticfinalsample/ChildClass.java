package publicstaticfinalsample;

public class ChildClass implements InterfaceSample {

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        int a = childClass.a;
        System.out.println(a);
    }
}
