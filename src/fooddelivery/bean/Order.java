package fooddelivery.bean;

import java.util.Objects;

public class Order {
    private int orderId;
    private int customerId;
    private String foodName;
    private int quantity;
    private double price;
    private double totalAmount;

    public Order() {
    }

    public Order(int orderId, int customerId, String foodName, int quantity, double price, double totalAmount) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.foodName = foodName;
        this.quantity = quantity;
        this.price = price;
        this.totalAmount = totalAmount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }


    // 4. Generate toString()

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", foodName='" + foodName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", totalAmount=" + totalAmount +
                '}';
    }


    // 5. Generate equals() and hashCode() -> ONLY for orderId

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(orderId);
    }
}