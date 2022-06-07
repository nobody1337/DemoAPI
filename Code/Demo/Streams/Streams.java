package Demo.Streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class Streams {

    private String[]test = {"Hallo","Welt",};
    public static void main(String[] args) {

        Streams s = new Streams();
        System.out.println(s.teststream());
        System.out.println("--------------");
        System.out.println(s.teste());
        System.out.println("--------------");
        for (int i = 0; i < s.teste().length; i++) {
            s.teste()[i]= "" + i;
        }
        for (int i = 0; i < s.teste().length; i++) {
            System.out.println(s.teste()[i]);
        }
//        s.teststream().forEach(test->test.setP
    }
    public Stream<String> teststream(){
        return Stream.of(test);
    }
    public String [] teste(){
        return test;
    }
    public String[] getTest() {
        return test;
    }
    public void setTest(String[] test) {
        this.test = test;
    }
}
