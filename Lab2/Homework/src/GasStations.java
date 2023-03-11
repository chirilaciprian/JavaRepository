public class GasStations extends Location{
    private double GasPrice;

    public GasStations(String name, double x, double y, double gasPrice) {
        super(name, x, y);
        GasPrice = gasPrice;
    }

    public void setGasPrice(double gasPrice) {
        GasPrice = gasPrice;
    }

    public double getGasPrice() {
        return GasPrice;
    }
}
