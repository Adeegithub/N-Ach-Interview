import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        Category c1 =  new Category(1,"Cat 1",true);
        Category c2 =  new Category(2,"Cat 2",true);
        Category c3 =  new Category(3,"Cat 3",false);

        Product p1 = new Product(new Category(c1.categoryId,c1.categoryName,c1.status),"Prod 1", 1,78,1);
        Product p2 = new Product(new Category(c1.categoryId,c2.categoryName,c2.status),"Prod 2", 2,20,0);
        Product p3 = new Product(new Category(c1.categoryId,c3.categoryName,c3.status),"Prod 3", 3,10,1);
        Product p4 = new Product(new Category(c1.categoryId,c1.categoryName,c1.status),"Prod 4", 4,8,1);

        //Calling addProduct()
        addProduct(p1);
        addProduct(p2);
        addProduct(p3);
        addProduct(p4);


        //Calling editProduct
        Product p5 = new Product(new Category(c1.categoryId,c1.categoryName,c1.status),"Update Prod 1", 1,78,1);
        editProduct(p5);

        //Deleting Product
        deleteProduct(1);


        //Calling getAll Method
       List<Product> newList = getAll();
        for (Product product : newList) {
            System.out.println(product.productName);
        }

        System.out.println("---------------------");

        //Calling getById method

        Product retrieveProduct = getById(2);
        System.out.println(STR."The retrived prodcut is \{retrieveProduct.productName}");
    }

    public static boolean addProduct(Product product){
        return products.add(product);
    }

    public static boolean editProduct(Product updateProduct){
        for (Product product : products){
            if (product.productId == updateProduct.productId){
                product.setProductName(updateProduct.getProductName());
                product.setProductId(updateProduct.getProductId());
                product.setQuantity(updateProduct.getQuantity());
                product.setStatus(updateProduct.getStatus());
                return true;
            }
        }
        return false;
    }

    public static boolean deleteProduct(int productId){
        for (Product product: products){
            if (product.productId == productId){
                products.remove(product);
                return true;
            }
        }
        return false;
    }

    public static List<Product> getAll(){
        return products;
    }

    public static Product getById(int id){
        for (Product product : products){
            if (product.productId == id){
                return product;
            }
        }
        return null;
    }

}
