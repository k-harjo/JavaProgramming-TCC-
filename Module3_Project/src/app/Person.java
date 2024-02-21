//P3.6

package app;

public class Person {
    private String name;
    private String friends;

    public Person(String name) {
        this.name = name;
        this.friends = "";
    }

    public void befriend(Person p) {
        friends += p.name + " ";
    }

    public void unfriend(Person p) {
        friends = friends.replace(p.name + " ", "");
    }

    public String getFriendNames() {
        return friends.trim(); // Remove trailing space and return
    }
}

