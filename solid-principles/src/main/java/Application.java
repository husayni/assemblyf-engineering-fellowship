public class Application {
    public static void main(String[] args){
        Product product = new Product("Pepsi","Food", "50");
        ProductFormatter formatter = new ProductFormatter();
        System.out.println(formatter.format(product,"Text"));
    }
}
