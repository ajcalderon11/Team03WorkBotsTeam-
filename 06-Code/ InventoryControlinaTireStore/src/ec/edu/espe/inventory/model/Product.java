package ec.edu.espe.inventory.model;

/**
 *
 * @author WorBotsTeam
 */
public class Product {
    private int code;
    private String name;
    private float price;

    public Product(int code, String name, float price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }
    
    public Product() {
        this.code = code;
        this.name = name;
        this.price = price;
    }
    
    public void viewInStock(){
    }
    
    public boolean sell(){
        return false;
    }
    public boolean buy (){
        return false;  
    } 

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
 }
    
