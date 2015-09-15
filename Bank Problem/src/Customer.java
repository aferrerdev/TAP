/**
 * Created by Alex on 15/09/2015.
 */
public class Customer
{
    private String ID;
    private String name;
    private String address;
    private String phone_number;

    public Customer(String ID, String name, String address, String phone_number) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
