package module1;

public class HelloWorld {

    public String hello() {
        return new HelloScala().test();
    }

    public void notCovered() {
        System.out.println("YOLO");
    }

}
