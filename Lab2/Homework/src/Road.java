import java.util.Objects;

abstract public class Road {
    private String name;
    Location l1;
    Location l2;

    public Road() {
    }

    public Road(String name, Location l1, Location l2) {
        this.name = name;
        this.l1 = l1;
        this.l2 = l2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Road road = (Road) o;
        return Objects.equals(name, road.name) ||
                (Objects.equals(l1, road.l1) && Objects.equals(l2, road.l2))
                ||(Objects.equals(l1, road.l2) && Objects.equals(l2, road.l1))
                ||(Objects.equals(l2, road.l1) && Objects.equals(l1, road.l2));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, l1, l2);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Numele drumului: " + name + " Locatia1: " + l1.getName() + " Locatia2: " + l2.getName();
    }

    public Location getL1() {
        return l1;
    }

    public Location getL2() {
        return l2;
    }
}
