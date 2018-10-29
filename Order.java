//Order class has  the orders of the customer.
public class Order
{
    private String orderId;
    private Customer customer;
    private Address address;
    private Product product;
    private double price;
    private int[] quantities;
    private int startDate;
    private int endDate;
    private String status;

    public Order(String orderId, Customer customer, Address address, Product product, double price, int[] quantities, int startDate, int endDate)
    {
        this.orderId = orderId;
        this.customer = customer;
        this.address = address;
        this.product = product;
        this.price = price;
        this.quantities = quantities;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = "active";
    }

    public Order(String orderId,Product product, double price,int[] quantities, int startDate,int endDate)
    {
          this.orderId = orderId;
          this.product = product;
          this.price = price;
          this.quantities = quantities;
          this.startDate = startDate;
          this.endDate = endDate;
          this.status = "active";
    }

    public String getOrderId()
    {
        return orderId;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    public Address getAddress()
    {
        return address;
    }
    public void setAddress(Address address)
    {
        this.address = address;
    }
    public void setOrderStatus(String status)
    {
        this.status = status;
    }
    public Product getProduct()
    {
        return product;
    }
    public void setProduct(Product product)
    {
        this.product = product;
    }
    public double getPrice()
    {
        return price;
    }
    public int getQuantity() 
    {
        int a =0;
        for(int i=0;i<quantities.length;i++)
        {
           a+=quantities[i];
        }
        return a;
    }
    
    public int getStartDate() 
    {
        return startDate;
    }
    public int getEndDate() 
    {
        return endDate;
    }
    public String getStatus() 
    {
        return status;
    }

    public String toString()
    {
        return getClass().getName() + "[Id:" +getOrderId() + " , customer: " +getCustomer().getCustomerId() +", address: "+getAddress().getAddressId() +", Product: "+getProduct().getProductId() + ", Price: "+getPrice()+", quantities: "+getQuantity()+", Start date: " +getStartDate() +" , End Date:" +getEndDate() +", Status:" +getStatus() +"]";
    }
}