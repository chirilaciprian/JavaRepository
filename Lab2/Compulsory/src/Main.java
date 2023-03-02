public class Main {
    public static void main(String[] args) {
        Location c1 = new Location("Iasi", 10.0, 20.2);
        Location c2 = new Location("Brasov", 12, 30);
        System.out.println(c1);
        System.out.println(c2);
        Road r1 = new Road("Drum", RoadType.EXPRESS, c1, c2);
        System.out.println(r1);
    }
}