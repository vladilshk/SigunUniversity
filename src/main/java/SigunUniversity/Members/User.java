package SigunUniversity.Members;

public abstract class User {
    private final String id;
    private String name;
    private String phoneNo;
    private String email;

    public User(String id, String name, String phoneNo, String email) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNo() {
        return this.phoneNo;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString() {
        return "User{id='" + this.id + '\'' + ", name='" + this.name + '\'' + ", phoneNo='" + this.phoneNo + '\'' + ", email='" + this.email + '\'' + '}';
    }
}