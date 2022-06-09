package Demo.Funkionale_Interfaces_Annotationen;

@FunctionalInterface
public interface Annotationen{
    void functional();
    default void func2 () {
    	int x  = 1 +2 ;
    }
}
