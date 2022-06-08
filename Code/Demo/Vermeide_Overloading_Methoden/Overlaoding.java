package Demo.Vermeide_Overloading_Methoden;


import java.util.function.Function;
import java.util.function.Predicate;

public interface Overlaoding {

    void addRenderer(Function<Overlaoding,String> renderer);
    void addLogCondition(Predicate<Overlaoding> logCondition);

    void add(Function<Overlaoding, String> renderer);
    void add(Predicate<Overlaoding> logCondition);

//    void add(int x,int y);
//    void add(int x,int z);
}
