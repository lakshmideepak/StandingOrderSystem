// /Invoice class
public class Invoice
{
    private String id;
    private integer fromDate;
    private integer toDate;
    private Customer customer;
    private List<Delivery> deliveries;
    private Real totalCost;
    private integer payDate;
    
    public Invoice(String id, integer fromDate, integer toDate, Customer customer, Real totalCost, integer payDate)
    {
        this.id= id;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.customer = customer;
        deliveries = new ArrayList<Delivery>();
        this.totalCost = totalCost;
        this.payDate = payDate;
    }

    public String getId()
    {
        return id;
    }

    public integer getFromDate()
    {
        return fromDate;
    }

    public integer getToDate()
    {
        return toDate;
    }

    public Customer getCustomer()
    {
        return customer;
    }
    public ArrayList<Delivery> getDeliveries()
    {
        return deliveries;
    }

    public Real getTotalCost()
    {
        return totalCost;
    }

    public integer getPayDate()
    {
        return payDate;
    }

    public String toString()
    {
        return getClass().getName() + " [ Id: " +getId() +" , From Date: " +getFromDate()+ " , To Date: " +getToDate() +" , Customer: " +getCustomer() + " , Deliveries: " +getDeliveries() +" , Total Cost: "+getTotalCost() +" , Pay Date: "+getPayDate() + " ] ";
    }
}