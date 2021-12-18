import java.util.HashMap;

public class ProductFormatter {
    HashMap<String,IFormatter> formatterRegistry;
    public ProductFormatter(){
        formatterRegistry = new HashMap<String, IFormatter>();
        formatterRegistry.put("csv", new CsvFormatter());
        formatterRegistry.put("text", new TextFormatter());
    }

    public String format(Product product, String formatAs){
        IFormatter formatter = formatterRegistry.get(formatAs.toLowerCase());
        return formatter.invoke(product);
    }
}


