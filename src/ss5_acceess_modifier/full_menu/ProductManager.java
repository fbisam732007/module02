package ss5_acceess_modifier.full_menu;

import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();

    public void showList() {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void add(Product p) {
        products.add(p);
    }

    public boolean deleteById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                return true;
            }
        }
        return false;
    }

    public void searc(String name) {
        boolean found = false;

        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println(p);
                found = true;

            }
        }
        if (!found) {
            System.out.println("k thấy sản phẩm");
        }
    }

}
