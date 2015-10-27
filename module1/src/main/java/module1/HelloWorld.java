package module1;

public class HelloWorld {

    public String hello() {
        return new module1.HelloScala().test();
    }

    public void notCovered() {
        System.out.println("YOLO");
    }

}
