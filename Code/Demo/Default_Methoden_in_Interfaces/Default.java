package Demo.Default_Methoden_in_Interfaces;
@FunctionalInterface
public interface Default {
    //Abstrakte-Methode
    void bruellen();
    //Default-Methode
    default void bruellen_d(){
        System.out.println("RAAAW,ich bin default");
    }
}
