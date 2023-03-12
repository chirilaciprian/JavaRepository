public class Company implements Node {
    private String name;

    public Company(String name) {
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

    public String toString() {
        return name;
    }
}
