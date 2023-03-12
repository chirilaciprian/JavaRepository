import java.util.*;

public class Main {
    public static void main(String[] args) {
        Node p1 = new Person("Andrei");
        Node p2 = new Person("Alex");
        Node p3 = new Person("Dan");
        Node c1 = new Company("Microsoft");
        Node c2 = new Company("Apple");
        List<Node> nodes = new ArrayList<>();
        nodes.add(p1);
        nodes.add(p2);
        nodes.add(p3);
        nodes.add(c1);
        nodes.add(c2);
        System.out.println(nodes);
    }
}