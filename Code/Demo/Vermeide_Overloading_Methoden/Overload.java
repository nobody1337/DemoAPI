package Demo.Vermeide_Overloading_Methoden;

import java.util.function.Function;
import java.util.function.Predicate;

public class Overload implements Overloading{

    public static void main(String[] args) {
        Overload o = new Overload();
        o.addRenderer(overloading -> overloading +"Hallo");
    }

	@Override
	public void addRenderer(Function<Overloading, String> renderer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addLogCondition(Predicate<Overloading> logCondition) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Function<Overloading, String> renderer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Predicate<Overloading> logCondition) {
		// TODO Auto-generated method stub
		
	}

}
