
package ec.edu.espe.inventory.view;

import ec.edu.espe.inventory.model.Average;
import ec.edu.espe.inventory.model.Company;
import ec.edu.espe.inventory.model.Price;
import ec.edu.espe.inventory.model.Products;
import ec.edu.espe.inventory.model.Provider;
import ec.edu.espe.inventory.model.Purchase;
import ec.edu.espe.inventory.model.Sale;
import ec.edu.espe.inventory.model.Seller;
import ec.edu.espe.inventory.model.Stock;
import ec.edu.espe.inventory.model.Time;

/**
 *
 * @author WorBotsTeam
 */
public class InventoryTireStore {
    public static void main(String[] args) {
        Time time = new Time(0);
        Stock stock = new Stock();
        Seller seller = new Seller();
        Sale sale = new Sale();
        Purchase purchase = new Purchase();
        Provider provider = new Provider();
        Price price = new Price();
        Products products = new Products();
        Company company = new Company();
        Average average = new Average();
        
        
        System.out.println("the time");
        System.out.println("-->"+ time);        
        
        System.out.println("the stock");
        System.out.println("-->"+ stock);        
        
        System.out.println("the sale");
        System.out.println("-->"+ sale);        
        
        System.out.println("the purchase");
        System.out.println("-->"+ purchase);        
        
        System.out.println("the provider");
        System.out.println("-->"+ provider);        
        
        System.out.println("the price");
        System.out.println("-->"+ price);        
        
        System.out.println("the products");
        System.out.println("-->"+ products);        
        
        System.out.println("the company");
        System.out.println("-->"+ company);        
        
        System.out.println("the average");
        System.out.println("-->"+ average);
        
    }
}
