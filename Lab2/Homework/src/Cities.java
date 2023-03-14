public class Cities extends Location{
    private int population;

    public Cities(String name, double x, double y, int population) {
        super(name, x, y);
        this.population = population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }
}
