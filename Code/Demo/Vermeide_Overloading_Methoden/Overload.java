package Demo.Vermeide_Overloading_Methoden;

import java.util.function.Function;
import java.util.function.Predicate;

public class Overload implements Overlaoding{

    public static void main(String[] args) {
        Overload o = new Overload();
//        o.add(overlaoding -> overlaoding+"Hallo");
    }

    @Override
    public void addRenderer(Function<Overlaoding, String> renderer) {

    }

    @Override
    public void addLogCondition(Predicate<Overlaoding> logCondition) {

    }

    @Override
    public void add(Function<Overlaoding, String> renderer) {
        System.out.println("Add Methode renderer");
    }

    @Override
    public void add(Predicate<Overlaoding> logCondition) {
        System.out.println("Add Methode logCondition");
    }
}
