package replaceType;

public class NewVehicleQuery {
    public String brand;
    public String description;
    // TODO Remove this field
    public String brandDescription;

    public NewVehicleQuery(String brand, String description) {
        this.brand = brand;
        this.description = description;
    }
}
