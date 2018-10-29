//Delivery Item has item details for delivery
public class DeliveryItem
{
    private Order orders;
    public int quantity;
    public int difference;

    public DeliveryItem(Order orders, int quantity, int difference)
    {
        this.orders = orders;
        this.quantity = quantity;
        this.difference = difference;
    }

    public Order getOrders()
    {
        return orders;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public int getDifference()
    {
        return difference;
    }

    public String toString()
    {
        return getClass().getName() + "[ Orders: " +getOrders() + " , Quantity: " +getQuantity() +" , Difference: " +getDifference() +"]";
    }

}