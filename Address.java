//Address class has the address of the customers
public class Address
{
    private String addressId;
    private String line1;
    private String line2;
    private String contactPerson;
    private int contactPhone;

    public Address(String addressId, String line1, String line2, String contactPerson, int contactPhone)
    {
        this.addressId = addressId;
        this.line1 = line1;
        this.line2 = line2;
        this.contactPerson = contactPerson;
        this.contactPhone =  contactPhone;
    }

    public String getAddressId()
    {
        return addressId;
    }   
    public String getLine1()
    {
        return line1;
    }

    public String getLine2()
    {
        return line2;
    }

    public String getContactPerson()
    {
        return contactPerson;
    }

    public int getContactPhone()
    {
        return contactPhone;
    }
    public String toString()
    {
        return getClass().getName()+"[Address Id: "+getAddressId() +" , Line1: " +getLine1() + " , Line 2: " +getLine2() + " , contactPerson: " +getContactPerson() + ", contactPhone: " +getContactPhone() +"\n" +" ]";
    }
   
}