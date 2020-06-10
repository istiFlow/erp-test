public class Car extends Vehicle {
    private byte ajtok_szama;

    public Car(String type, String marka, byte ajtokSzama) {
        super(type, marka);
        this.ajtok_szama = ajtokSzama;
    }

    @Override
    public String toString() {
        return "Típus: " + super.getType() + " ||| " +
               "Márka: " + super.getMarka() + " ||| " +
               "Ajtók száma: " + ajtok_szama;
    }
}
