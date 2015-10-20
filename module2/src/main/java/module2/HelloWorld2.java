package module2;

public class HelloWorld2 {

    public String hello() {
        return new module1.HelloWorld().hello();
    }

    public void notCovered() {
        System.out.println(new module1.HelloScala().test());
    }

}
