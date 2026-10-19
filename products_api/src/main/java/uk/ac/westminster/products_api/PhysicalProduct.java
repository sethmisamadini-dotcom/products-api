
package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it has
// all the common properties of a Product.
// A ShoppingCart HAS-A Product because it contains products.

public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    // Empty constructor
    public PhysicalProduct() {
    }

    // Full constructor
    public PhysicalProduct(Long id, String name,
                           double price, double weightKg,
                           String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    // Getter for weightKg
    public double getWeightKg() {
        return weightKg;
    }

    // Getter for dimensions
    public String getDimensions() {
        return dimensions;
    }
}

