package Demo.Vermeide_Overloading_Methoden;


import java.util.function.Function;
import java.util.function.Predicate;

public interface Overloading {

	//Richtig
    void addRenderer(Function<Overloading,String> renderer);
    void addLogCondition(Predicate<Overloading> logCondition);

    //Falsch
    void add(Function<Overloading, String> renderer);
    void add(Predicate<Overloading> logCondition);

//    void add(int x,int y);
//    void add(int x,int z);
}
