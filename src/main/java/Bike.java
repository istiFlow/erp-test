public class Bike extends Vehicle {
    private int terhelhetoseg;

    public Bike(String type, String marka, int terhelhetoseg) {
        super(type, marka);
        this.terhelhetoseg = terhelhetoseg;
    }

    @Override
    public String toString() {
        return "Típus: " + super.getType() + " ||| " +
               "Márka: " + super.getMarka() + " ||| " +
               "Terhelhetőség: " + terhelhetoseg;
    }
}
