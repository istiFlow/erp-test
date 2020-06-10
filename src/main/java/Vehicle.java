public abstract class Vehicle {
    private String type;
    private String marka;

    public Vehicle(String type, String marka) {
        this.type = type;
        this.marka = marka;
    }

    public String getType() {
        return type;
    }

    public String getMarka() {
        return marka;
    }
}
