import java.util.*;
public class Main {
    public static void main(String[] args) {
        Location c1 = new Airports("Iasi", 13.2, 52.2,23);
        Location c2 = new Cities("Brasov", 72.23, 23.1,100000);
        Location c3 = new Location("Bucuresti",32,23);
        Location c4 = new Location("Bacau",32,23);
        Location c5 = new Location("Pascani",32,23);
        Location c6 = new Location("Cluj",32,23);
        Road r1 = new Country("A3", c1, c2);
        Road r2 = new Express("A4",c2,c3);
        Road r3 = new Highway("A5",c2,c6);
        Road r4 = new Highway("A6",c5,c1);
        Road r5 = new Highway("A7",c2,c4);
        Road r6 = new Highway("A8",c4,c3);
        Road r7 = new Highway("A9",c1,c6);
        Location[] l = {c1,c2,c3,c4,c5,c6};
        Road[] r = {r1,r2,r3,r4,r5,r6,r7};
        Problem P = new Problem(l,r);
        System.out.println(P.ValidInstance());
        P.PathBetweenCities(c1,c4);
    }
}