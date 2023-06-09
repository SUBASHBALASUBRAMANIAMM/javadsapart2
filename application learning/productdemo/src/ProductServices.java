import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProductServices {
    List<Product> products = new ArrayList<>();
    public void addProduct(Product p){
        products.add(p);
    }
    public List<Product> getAllProducts(){
        return  products;
    }
    public Product getProduct(String name){
        for(Product p:products){
            if (p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }

    public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList<>();

        for(Product p : products){
            String name = p.getName().toLowerCase();
            String place = p.getPlace().toLowerCase();
            String type = p.getType().toLowerCase();
            if(name.contains(str)||place.contains(str)||type.contains(str)){
                prods.add(p);
            }

        }
        return prods;
    }
}
