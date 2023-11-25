class Products {
    String name;
    int id;
    String description;
    double price;
    static int count;

    Products(String name, String description, double price) { // full constructors .
        count++;
        this.name = name;
        this.description = description;
        this.price = price;
        id = count;
    }

    Products(String name, double price) { // constructors for name and price.
        this(name, "The product description has not been set", price);
    }

    Products(String name, String description) { // constructors for name and description.
        this(name, description, 00.00);
    }

    Products() { // default constructors .
        this("The product name has not been set",
                "The product description has not been set", 00.00);
    }

    void desplay() {
        System.out.println(
                "| ID " + id + " \n| Name: " + name + " \n| Description: " + description + " \n| Price: " + price);
        System.out.println("|_____________________________________________");
    }
}

class ProductsTest {
    public static void main(String[] arge) {
        Products product_1 = new Products();
        Products product_2 = new Products("shoes", "white shoes, size 43", 399.99);
        Products product_3 = new Products("T-shirt", 12);
        Products product_4 = new Products("pants", "black pants, size 43");
        product_1.desplay();
        product_2.desplay();
        product_3.desplay();
        product_4.desplay();
    }
}