package Demo.Funkionale_Interfaces_Annotationen;
@FunctionalInterface
public interface Annotationen{
    /*
        Functional Interfaces sind im Prinzip ganz normale Interfaces, die genau eine abstrakte Methode haben sowie beliebig viele default und static Methoden.
        Man spricht daher auch von SAM Interfaces: Single Abstract Method. Das package java.util.function enthält bereits eine umfangreiche Auswahl an
        Functional Interfaces für (fast) jeden Zweck. Natürlich kann man auch eigene Interfaces definieren
     */
    void functional();
    static void test(){
        int x = 1+2;
    }
    default void testen(){
        int y = 1+2;
    }
}
