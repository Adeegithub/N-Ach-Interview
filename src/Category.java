public class Category {
    int categoryId;
    String categoryName;
    Boolean status;

    public Category(int categoryId, String categoryName, Boolean status) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.status = status;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
