public class Road {
    private String name;
    private RoadType type;
    Location l1;
    Location l2;

    public Road() {
    }

    public Road(String name, RoadType type, Location l1, Location l2) {
        this.name = name;
        this.type = type;
        this.l1 = l1;
        this.l2 = l2;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Numele drumului: " + name + ",Tipul :" + type + " Locatia1: " + l1.getName() + " Locatia2: " + l2.getName();
    }
}
