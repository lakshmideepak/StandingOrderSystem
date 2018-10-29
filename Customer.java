//Customer class has customer details his address and orders.
import java.util.*;
public class Customer
{
    private String customerId;
    private String name;
    private Address address;
    private Order order;
    private ArrayList<Address> addressList;
    private ArrayList<Order> ordersList;

    public Customer(String customerId, String name)
    {
        this.customerId = customerId;
        this.name = name;
        addressList = new ArrayList<Address>();  // Initialization of arrayList
        ordersList = new ArrayList<Order>();  
    }

    
   
   

    public String getCustomerId()
    {
        return customerId;
    }

    public String getName()
    {
        return name;
    }
   
    public void setAddress(Address address)
    {
        addressList.add(address);
    }
    
    public void setOrder(Order orders)
    {
        ordersList.add(orders);
    }
    
    public ArrayList<Address> getAddress()
    {
        return addressList;
    }

    public ArrayList<Order> getOrders()
    {
        return ordersList;
    }

    
    public String toString()
    {
        return getClass().getName()+ "[Customer Id: " +getCustomerId() + ", Name: " +getName() +getAddress() +getOrders() +"]";
    }
    
    
}