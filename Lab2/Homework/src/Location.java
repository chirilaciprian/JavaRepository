import java.util.Objects;

public class Location {
    private String name;
    double X, Y;

    public Location() {
    }

    public Location(String name, double x, double y) {
        this.name = name;
        X = x;
        Y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Location)) return false;
        Location location = (Location) o;
        return name.equals(location.name) && (X!=location.X||Y!=location.Y);
    }
}
