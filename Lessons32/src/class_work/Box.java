package class_work;

// обобобщенный класс
public class Box<T> { // <T, R, Q> - generics

    private T value; // Box<CAR> -> T -> Car

    public Box(T value) { // Box<CAR> -> T -> Car
        this.value = value;
    }

    public T getContent() { // Box<CAR> ->  T -> Car
        return this.value;
    }
}