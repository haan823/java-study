package designpattern.singletonpattern;

public class Singleton {
    static Singleton singletonObject;

    private Singleton() {
    }

    // 객체 반환 정적 메서드
    public static Singleton getInstance() {
        if (singletonObject == null) {
            return singletonObject = new Singleton();
        }
        return singletonObject;
    }
}
