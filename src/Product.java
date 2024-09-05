public class Product {
    Category categoryId;
    String productName;
    int productId;
    int quantity;
    int status;

    public Product(){

    }

    public Product(Category categoryId, String productName, int productId, int quantity, int status) {
        this.categoryId = categoryId;
        this.productName = productName;
        this.productId = productId;
        this.quantity = quantity;
        this.status = status;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getStatus() {
        return status;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}