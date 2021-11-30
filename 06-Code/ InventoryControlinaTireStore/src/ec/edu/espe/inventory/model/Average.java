
package ec.edu.espe.inventory.model;

/**
 *
 * @author WorkbotsTeam
 */
public class Average {
    
    private float sale;
    private float purchase;
    private float price;

    public Average(float sale, float purchase, float price) {
        this.sale = sale;
        this.purchase = purchase;
        this.price = price;
    }
    
    public Average() {
        this.sale = sale;
        this.purchase = purchase;
        this.price = price;
    }
    public void gain(){
        
    }
    
    public void lost(){
        
    }
    
    public void average(){
        
    }

    /**
     * @return the sale
     */
    public float getSale() {
        return sale;
    }

    /**
     * @param sale the sale to set
     */
    public void setSale(float sale) {
        this.sale = sale;
    }

    /**
     * @return the purchase
     */
    public float getPurchase() {
        return purchase;
    }

    /**
     * @param purchase the purchase to set
     */
    public void setPurchase(float purchase) {
        this.purchase = purchase;
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
