public class TextFormatter implements IFormatter {

    public String invoke(Product product) {
        return String.format("Id: %s,\nName: %s,\nCategory: %s,\nPrice: %s",product.getProductId(),product.getName(),product.getCategory(),product.getPrice());
    }
}
