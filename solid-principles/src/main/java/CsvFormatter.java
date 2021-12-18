public class CsvFormatter implements IFormatter{
    public String invoke(Product product) {
        return product.getProductId()+","+product.getName()+","+product.getCategory()+","+product.getPrice();
    }
}
