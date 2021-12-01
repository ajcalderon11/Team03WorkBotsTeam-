
package ec.edu.espe.inventory.view;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author WorBotsTeam
 */
public class InventoryTireStore {

    
    static Scanner input = new Scanner(System.in);
    static String name;
    static double price;
    static int option,stock,code;
    
    public static void main(String[] args) {
        
        
        Product product;
        Vector products = new Vector();        
        do{
            System.out.print("\nMENU \n 1. Register purchase --> \n 2. Register sale --> \n 3. Search product --> \n 4. Exit -->");
            option = input.nextInt();
            
            switch(option){
                case 1:
                     System.out.print("Please enter code: ");
                     code = input.nextInt(); 
                     System.out.print("Please enter name: ");
                     name = input.next();
                     System.out.print("Please enter price: ");
                     price = input.nextDouble();
                     System.out.print("Exit: ");
                     stock = input.nextInt();
                     product = search(code, products);
                     if(product==null){
                        products.addElement(new Product(code,name,price,stock));
                        System.out.print("Product added");
                     }
                     else
                         System.out.print("this product already exists");
                         
                    break;
                    
                case 2:  
                     System.out.print("Please enter code: ");
                     code = input.nextInt();
                     product = search(code, products);
                     if(product!=null){
                         if(product.getStock() > 0){ 
                            product.setStock(product.getStock() - 1);
                            System.out.print("Sale made");
                            product.showResult();
                         }
                         else
                             System.out.print("Out of stock");
                     }
                     else 
                        System.out.print("Non-existent product");
                     
                    break;
                    
                case 3:
                     System.out.print("Please enter code: ");
                     code = input.nextInt();
                     product = search(code, products);
                     if(product!=null)
                        product.showResult();
                     else 
                        System.out.print("Non-existent product");                     
                    break;
                    
                case 4:
                    break;
                    
                default: System.out.println("please enter menu option");
            }            
        }while(option!= 4);
    }    
    static Product search(int codigo, Vector products){
        boolean band = false;
        Product product,retornP = null;
        for(int x = 0; x < products.size(); x++){ 
            product = (Product) products.elementAt(x);
            if(product.getCodigo() == codigo)
                retornP = product;
        }
        return retornP;
    }
}

class  Product{
    int code ,stock;
    double price;
    String name;
    
    Product(int code, String name, double price, int stock){
        this.code = code;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void setStock(int stock){
        this.stock = stock;
    }
    public int getCodigo(){
        return this.code;
    }
    public int getStock(){
        return this.stock;
    }
    public void showResult(){
        System.out.println("\nName is = " + this.name + "\t  Price is = "+ this.price + "\t  Stock is = "+ this.stock);
    }
    public void showResultGraphic(){
        javax.swing.JOptionPane.showMessageDialog(null,"\nName is = " + this.name + "\t  Price is = "+ this.price + "\t  Stock is = "+ this.stock);
    }
}
