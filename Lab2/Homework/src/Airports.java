public class Airports extends Location{
    private int terminals;

    public Airports(String name, double x, double y, int terminals) {
        super(name, x, y);
        this.terminals = terminals;
    }

    public void setTerminals(int terminals) {
        this.terminals = terminals;
    }

    public int getTerminals() {
        return terminals;
    }
}
