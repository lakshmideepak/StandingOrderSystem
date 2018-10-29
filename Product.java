//Product  class has  product details
public class Product
{

    private String productId;
    private String description;

    public Product(String productId, String description)
    {
        this.productId=productId;
        this.description = description;
    }

    public String getProductId()
    {
        return productId;
    }

    public String getDescription()
    {
        return description;
    }

    public String toString()
    {
        return getClass().getName() + "[Id: "+ getProductId()+ ", Description: "+getDescription()+"]";
    }
}