import java.util.*;
public class StandingOrderSystemTesterMain
{
    static int testCount =0;
    static String test;
   StandingOrderSystem sos = new StandingOrderSystem();
    public static void main(String[] args) throws Exception
    {
        testInit();
        testAddProduct();
        testAddNewCustomer();
        testAddAdressToExistingCustomer();
        testAddStandingOrder();
        testSort();
        testAddDelivery();
        
        testRemoveOrder();
    }
    
    public static void testRemoveOrder() throws Exception
    {
        test = "Test UC7: Removing Order from the system";
        StandingOrderSystem sos = new StandingOrderSystem();
        System.out.println("\n"+test+"\n");
        sos.addProduct("P1","Chicken");

        sos.addNewCustomer("C1","Deepak","A1","121 Keon Parade","Reservoir","Prasanna",1234);
   
        int[] quant ={12,20,30,40};  
        sos.addStandingOrderToCustomer("C1","Deepak","A1","121 Keon Parade","Reservoir","Prasanna",123,"O1","P1","Chicken",20.00,quant,1,5);
        sos.removeOrder("O1");
        sos.displayRemovedOrder();
    }
    // Testing creation of new System
    public static void testInit() throws Exception
    {
        test = "Test UC0: Create new system";
        StandingOrderSystem sos = new StandingOrderSystem();
        String s = sos.toString();
        System.out.println("\n"+test+ "\n"+ s);
    }

    //Testing adding the product to the system
    public static void testAddProduct() throws Exception
    {
       
        test = "Test UC1: Adding new Product to the system";
        StandingOrderSystem sos = new StandingOrderSystem();
        String test2 = "UC1,Test2: Adding the  Product with same Id";
        sos.addProduct("P1","PIZZA");
        
        System.out.println("\n"+test+ "\n");
        sos.displayProductList();
        
        System.out.println("\n"+test2+"\n");
        sos.addProduct("P1","Milk");
        
        
    }

    //Testing:add new customer to the system
    public static void testAddNewCustomer() throws Exception
    {
       
        test = "Test UC2: Adding new Customer to the system";
        String test2 = "UC2: test2 Adding same customer to the system";
        StandingOrderSystem sos = new StandingOrderSystem();
        sos.addNewCustomer("C1","Deepak","A1","121 Keon Parade","Reservoir","Prasanna",1234);
        System.out.println("\n"+test+"\n");
        sos.displayCustomerList();
        System.out.println("\n"+test2+"\n");
        sos.addNewCustomer("C1","Deepak","A1","121 Keon Parade","Reservoir","Prasanna",1234);

    }
    //Testing:Add a delivery address to an existing customer.
    public static void testAddAdressToExistingCustomer() throws Exception
    {
        
        test = "Test UC3: Adding address to existing customer";
        String test2 = "UC3 test2: Adding same address to existing customer";
        System.out.println("\n"+test+"n");
        
        StandingOrderSystem sos = new StandingOrderSystem();
        sos.addNewCustomer("C1","Deepak","A1","121 Keon Parade","Reservoir","Prasanna",1234);
        sos.addAddressToCustomer("C1","Deepak","A2","122 Keon Parade","Reservoir","sita",1234);
        sos.displayCustomerList();
        System.out.println("\n"+test2+"\n");
        sos.addAddressToCustomer("C2","Ram","A2","122 Keon Parade","Reservoir","sita",5677);
    } 

    //Testing add a standing Order
    public static void testAddStandingOrder() throws Exception
   {
       test = "TEST UC4:Adding Standing order to existing customer ";
       System.out.println("\n"+test+"\n");
       StandingOrderSystem sos = new StandingOrderSystem();
       sos.addProduct("P1","Chicken");

       sos.addNewCustomer("C1","Deepak","A1","121 Keon Parade","Reservoir","Prasanna",1234);
       sos.addNewCustomer("C2","Deepak","A1","122 Keon Parade","Reservoir","Ravi",12345);
       sos.addNewCustomer("C1","Deepak","A2","123 Keon Parade","Reservoir","Teja",1235);
  
       int[] quant ={12,20,30,40};
       sos.addStandingOrderToCustomer("C1","Deepak","A1","121 Keon Parade","Reservoir","Prasanna",123,"O1","P1","Chicken",20.00,quant,1,5);
       //Adding to unexisted Customer
       System.out.println("\n"+"Adding to unexisted Customer"+"\n");
       sos.addStandingOrderToCustomer("C3","Deepak","A4","124 Keon Parade","Reservoir","Prasanna",123,"O2","P1","Chicken",20.00,quant,1,5);
       //Adding to unexisted Address to customer
       System.out.println("\n"+"Adding to unexisted Address to Customer"+"\n");
       sos.addStandingOrderToCustomer("C1","Deepak","A3","125 Keon Parade","Reservoir","Prasanna",123,"O3","P1","Chicken",20.00,quant,1,5);
       //sos.displayProductList();
       //sos.displayAddressList();
       sos.displayCustomerList();
      // sos.displayOrderList();
   } 

   public static void testSort()
   {
      test= "Test UC5:Test sort";
      System.out.println("\n"+test+"\n");
      StandingOrderSystem sos = new StandingOrderSystem();
      sos.addProduct("P1","Chicken");
      sos.addProduct("P2","hicken");
      sos.addProduct("P3","hiken");
      sos.addNewCustomer("C1","Deepak","A1","121 Keon Parade","Reservoir","Prasanna",123);
      sos.addNewCustomer("C2","eepak","A2","122 Keon Parade","Reservoir","Prasanna",1234);
      sos.addNewCustomer("C3","epak","A3","123 Keon Parade","Reservoir","Prasanna",1235);
      int[] quant ={12,20,30,40};
      sos.addStandingOrderToCustomer("C1","Deepak","A1","121 Keon Parade","Reservoir","Prasanna",123,"O1","P1","Chicken",20.00,quant,1,5);  
    
      sos.addStandingOrderToCustomer("C2","eepak","A2","122 Keon Parade","Reservoir","Prasanna",1234,"O2","P2","hicken",20.00,quant,1,5);
      sos.addStandingOrderToCustomer("C3","epak","A3","123 Keon Parade","Reservoir","Prasanna",1235,"O3","P3","hiken",20.00,quant,1,3);
      
      sos.sortedStandingOrderSystem(4);



    }
   //Testing add delivery

   public static void testAddDelivery() throws Exception
   {
       test= "Test UC6: Adding delivery";
       System.out.println("\n"+test +"\n");
       StandingOrderSystem sos = new StandingOrderSystem();
       sos.addProduct("P1","Chicken");
       sos.addNewCustomer("C1","Sekhar","A1","122 bundoora","Reservoir","Peter",960567);
       int[] quant ={12,20,30,40};
       sos.addStandingOrderToCustomer("C1","Deepak","A1","121 Keon Parade","Reservoir","Prasanna",123,"O1","P1","Chicken",20.00,quant,1,5);
       sos.addDelivery("D1","C1","A1",24,"O1", 9,5);
       sos.displayDeliveryList();
       
   }
   
}