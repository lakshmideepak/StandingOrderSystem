//Standing order System class
import java.util.*;
public class StandingOrderSystem
{
    private List<Product> productList;
    private List<Customer> customerList;
    private List<Order> orderList;
    private List<Delivery> deliveryList;
    //private List<Invoice> invoiceList;
    private List<Address> addressList;
    private  List<Order> o2;
    public StandingOrderSystem()
    {
        productList = new ArrayList<Product>();
        customerList = new ArrayList<Customer>();
        orderList = new ArrayList<Order>();
        deliveryList = new ArrayList<Delivery>();
        //invoiceList = new ArrayList<Invoice>();
        addressList = new ArrayList<Address>();
        o2 = new ArrayList<Order>();
    }
    //Use-Case1:Method for adding a product to the Standing Order System.
    public void addProduct(String id, String description) 
    {
        boolean found = false;

        //Pre-Condition:Checking whether the product already exists in the productList.
        for(Product p: productList)
        {
            if(p.getProductId().equals(id))
            {
               found = true; 
            }
        }
        if(found== false)
        {
            //Post-Condition:Creating product object and adding it to the productList of the system.
            productList.add(new Product(id,description));
            
        }
        else
        {
           System.out.println("Product already exists");
        }
    }
    //Method to display productList ArrayList.
    public void displayProductList()
    {
        for(Product p : productList)
        {
            System.out.println(p);
        }
    }
   //Use-Case2:Method to add a new customer with one address.
   public void addNewCustomer(String customerId, String name, String addressId, String line1,String line2,String contactPerson,int contactPhone)
    {
        boolean customerFound = false;
        boolean addressFound = false;
        
        //Pre-Condition : Checking whether the customer and existing in the customerList and addressList.
        for(Customer c: customerList)
        {
            
            if(c.getCustomerId().equals(customerId))
            {
               customerFound = true; 
               
            }
           
        }
        for(Address a: addressList)
        {
            if(a.getAddressId().equals(addressId))
            {
               addressFound = true; 
            }
        }
        if((customerFound==false) && addressFound==false)
        {
            //Post-Condition: Creating customer and address objects and adding them to their respective lists.
            Customer c2 = new Customer(customerId,name);
            customerList.add(c2);
            Address a1 = new Address(addressId,line1,line2,contactPerson,contactPhone);
            c2.setAddress(a1);
            addressList.add(a1);
        }
        else if(customerFound ==true)
        {
            System.out.println("Customer already exists");
        }
        else
        {
            System.out.println("Address already exists");
        }

    }

    //Method to display CustomerList ArrayList.
    public void displayCustomerList()
    {
        for(Customer c : customerList)
        {
            System.out.println(c);
        }
    }

    //UseCase3: Adding new address to the existing customer.
    public void addAddressToCustomer(String customerId,String name, String addressId, String line1,String line2,String contactPerson,int contactPhone)
    {
        boolean customerFound = false;
        boolean addressFound = false;
        Customer c1 = null;

        //Pre-Condition:Checking whether customer exists.
        //Checking whether the address is having to the customer.
        for (Customer c:customerList)
        {
            if(c.getCustomerId().equals(customerId))
            {
                customerFound = true;
                 c1=c;
            for (Address a : c.getAddress())
            {
                if(a.getAddressId().equals(addressId))
                {
                    addressFound = true;
                }
            }
        }
        }
           
        if((customerFound== true)&& addressFound==false)
        {
            //Post-Condition:Creating address object and adding it to customer's addresses arrayList and addressList.
            Address a1 = new Address(addressId,line1,line2,contactPerson,contactPhone);
            c1.setAddress(a1);
            addressList.add(a1);
        }
        else
        {
            System.out.println("Customer already has this address ");
        }
    }

    //Method for displaying addressList.
    public void displayAddressList()
    {
        for (Address a : addressList)
        {
            System.out.println(a);
            
        }
    }

  //UseCase:4 Add standing order to the existing customer.  
   public void addStandingOrderToCustomer(String customerId,String name,String addressId, String line1,String line2,String contactPerson,int contactPhone,String orderId,String productId,String description,double price,int[] quantities,int startDate,int endDate)
    {
        boolean customerFound = false;
        boolean addressFound = false;
        boolean productFound = false;
        Customer c1 = null;
        for(Customer c: customerList)
        {
            if(c.getCustomerId().equals(customerId))
            {
               customerFound = true; 
               c1 = c;
            }
        }
        if(customerFound== false)
        {
            System.out.println("Customer doesnot exists");
            
        }
        Product p1 = null;
        for(Product p: productList)
        {
            if(p.getProductId().equals(productId))
            {
               productFound = true; 
               p1 =p;
            }
        }
        if(productFound == false)
        {
            System.out.println("Product doesnot exists");
            
        }
        Address a1 = null;
        for(Address a: addressList)
        {
            if(a.getAddressId().equals(addressId))
            {
               addressFound = true; 
               a1=a;
            }
        }
        if(addressFound == false)
        {
            System.out.println("Customer doesn't has this address");
        }
        

        
        
        if(customerFound==true)
        {
            
            if(addressFound==true)
            {
               
                if(productFound ==true)
                {
                    
           
           
        
            Order tempO = new Order(orderId,c1, a1, p1,price,quantities,startDate,endDate);
            c1.setOrder(tempO);          
            orderList.add(tempO);
            
            
                }  
            }
        }
    
    }

    public void displayOrderList()
    {
       
        for (Order o : orderList)
        {
            System.out.println(o);
                  
        }
    }
    //UseCase5: Display the orders according to input date
    public void sortedStandingOrderSystem(int date)
    {
       for (Order o : orderList)
       {
           
           if((o.getEndDate()>date) && o.getStartDate()<date)
           {
               System.out.println(o);
           }
           
       }  
    }

    //UseCase:6 Add delivery
    public void addDelivery(String id,String customerId,String addressId, int date,String orderId, int quantity,int difference)
    {
        boolean deliveryFound =false;
        boolean customerFound = false;
        boolean addressFound = false;
        boolean orderFound = false;
        Order o1=null;
        Customer c1 = null;
        Address a1 = null;
        for (Delivery d : deliveryList)
        {
            if(d.getDeliveryId().equals(id))
            {
                deliveryFound = true;
               
            }
        }
        for(Customer c: customerList)
        {
            if(c.getCustomerId().equals(customerId))
            {
                customerFound = true;
                 c1 =c;
            }
        }
        for(Customer c: customerList)
        {
            
            for (Address a : c.getAddress())
            {
                if(a.getAddressId().equals(addressId))
                {
                    addressFound = true;
                     a1 =a;
                }          
            }
        
            for (Order o : orderList)
            {
                if(o.getOrderId().equals(orderId))
                {
                    orderFound = true;
                     o1 =o;
                }
                
            }
            
        }
        if((deliveryFound ==false && customerFound ==true) && (addressFound ==true && orderFound == true))
        {
            deliveryList.add(new  Delivery(id,c1,a1,date,new DeliveryItem(o1,quantity,difference))) ; 
        }
        else if(customerFound==false)
        {
            System.out.print("Customer not found");
        }
        else if(addressFound==false)
        {
            System.out.print("Address not found");
        }
        else if(orderFound==false)
        {
            System.out.println("Order doesnot exists");
        }
        else
        {
            System.out.println("Delivery already exists");
        }
    }

    public void displayDeliveryList()
    {
         for (Delivery d : deliveryList)
         {
             System.out.println(d);
             
         }
    }
    
    //Extra UseCase to remove order.
    public void removeOrder(String orderId)
    {
       
       
        for(Order o: orderList)
        {
            if(o.getOrderId().equals(orderId))
            {
                o.setOrderStatus("Closed");
                o2.add(o);
               // orderList.remove(o);
            }
        }
    }
    public void displayRemovedOrder()
    {
        for(Order o:o2)
        {
            System.out.println(o2);
        }
    }
    public String toString()
    {
        return getClass().getName() +"\n\n"+ customerList+"\n\n" + addressList+"\n\n" +productList+"\n\n"+orderList +"\n\n" +deliveryList+"\n\n";
    }
}