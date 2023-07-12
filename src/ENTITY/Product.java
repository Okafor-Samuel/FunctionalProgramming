package ENTITY;

import java.util.Comparator;

public class Product implements Comparable<Product> {
    private  int unit;
    private String description;
    private double unitPrice;
    private  double amount;

    public Product(){}

    public Product(int unit, String description, double unitPrice, double amount) {
        this.unit = unit;
        this.description = description;
        this.unitPrice = unitPrice;
        this.amount = amount;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "unit=" + unit +
                ", description='" + description + '\'' +
                ", unitPrice=" + unitPrice +
                ", amount=" + amount +
                '}';
    }

    @Override
    public int compareTo(Product other) {
        Comparator<Product> comparator = Comparator.comparingInt(Product::getUnit);
        return comparator.compare(this, other);
    }
}
