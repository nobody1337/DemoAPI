package Demo.Default_Methoden_in_Interfaces;

public class Cat implements Default{
    public static void main(String[] args) {
        Cat daisy = new Cat();
        daisy.bruellen();
        daisy.bruellen_d();
    }
    
    //Das ist die abstrakte Methode aus dem funktionalen Interface
    @Override
    public void bruellen() {
        System.out.println("Miauuu,ich bin eine Katze");
    }
    

}
