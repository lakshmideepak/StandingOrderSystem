//Delivery class has the delivery details of the customer and his order.
import java.util.*;
public class Delivery
{
    private String id;
    private Customer customer;
    private Address address;
    private int date;
    private int dayOfWeek;
    private ArrayList<DeliveryItem> deliveryItems;

    public Delivery(String id, Customer customer, Address address,int date, DeliveryItem deliveryItem)
    {
        this.id = id;
        this.customer = customer;
        this.address = address;
        this.date = date;
        this.dayOfWeek = date % 7;
        deliveryItems = new ArrayList<DeliveryItem>();
        deliveryItems.add(deliveryItem);
    }

    public String getDeliveryId()
    {
        return id;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public Address getAddress()
    {
        return address;
    }

    public int getDate()
    {
        return date;
    }

    public int getDayOfWeek()
    {
        return dayOfWeek;
    }

    public ArrayList<DeliveryItem> getDeliveryItems()
    {
        return deliveryItems;
    }

    public String toString()
    {
        return getClass().getName() +" [Id: "+getDeliveryId() + " , Customer: " +getCustomer() + " , Address: " +getAddress() + " , Date: " +getDate() +" , Day Of Week: "+getDayOfWeek() + " , deliveryItems: " +getDeliveryItems() + "]";
    }
}