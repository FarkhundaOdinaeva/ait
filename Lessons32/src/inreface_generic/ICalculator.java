package inreface_generic;

public interface ICalculator<T, R> {

    R add(T value1, T value2);
}
