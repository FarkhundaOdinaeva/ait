package inreface_generic;

// эта реализация интерфейса ICalculator, должна принимать тип Integer, возвращать тип String
public class ConcatIntegerAsString implements ICalculator<Integer, String> {

    @Override
    public String add(Integer value1, Integer value2) {
        return value1.toString() + value2.toString();
    }
}