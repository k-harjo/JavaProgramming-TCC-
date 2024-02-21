//P3.14

package app;

public class Greeter {
    private String name;

    public Greeter(String name) {
        this.name = name;
    }

    public String sayHello() {
        return "Hello, " + name;
    }

    public String sayGoodbye() {
        return "Goodbye, " + name;
    }

    public String refuseHelp() {
        return "I am sorry, " + name + ". I am afraid I can’t do that.";
    }
}
