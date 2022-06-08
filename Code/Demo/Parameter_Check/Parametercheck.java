package Demo.Parameter_Check;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Parametercheck {

    static List<String>liste= new ArrayList<>();
    public static void main(String[] args) {

        String wort = "Hallo";
        String wort2 = null;
        add(wort);
        add(wort2);

    }
    public static void add(String wort){
        Objects.requireNonNull(wort);
        liste.add(wort);
    }
}
