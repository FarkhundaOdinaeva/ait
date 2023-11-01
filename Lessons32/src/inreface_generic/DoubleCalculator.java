package inreface_generic;

public class DoubleCalculator implements ICalculator<Double, Integer> {


    @Override
    public Integer add(Double value1, Double value2) {
        return (int) (value1 + value1);
    }
}
