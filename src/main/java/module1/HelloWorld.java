package module1;

public class HelloWorld {

    public String hello() {
        return "Hello";
    }

    public void notCovered() {
        System.out.println("YOLO");
    }

    public void fromScala() {
        System.out.println(new HelloScala().test());
    }

}
