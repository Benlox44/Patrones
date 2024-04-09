package Builder;

import java.util.ArrayList;

public class Product {

    public ArrayList<String> parts;

    public Product() {
        parts = new ArrayList<>();
    }

    public void addPart(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("Product's parts:");
        for (String part : parts) {
            System.out.println("- " + part);
        }
    }
}
