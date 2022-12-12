package SigunUniversity.Members;

public class Organizer extends User {
    private String unit;

    public Organizer(String id, String name, String phoneNo, String email, String unit) {
        super(id, name, phoneNo, email);
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return "Organizer{id='" + this.getId() + '\'' + ", name='" + this.getName() + '\'' + ", unit='" + this.unit + '\'' + '}';
    }

}
