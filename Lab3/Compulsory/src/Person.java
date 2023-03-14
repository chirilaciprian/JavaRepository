import java.util.*;

public class Person implements Node {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Node o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return name;
    }
}
