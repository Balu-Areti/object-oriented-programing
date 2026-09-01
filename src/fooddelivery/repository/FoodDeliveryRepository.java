package fooddelivery.repository;

import fooddelivery.bean.Customer;
import fooddelivery.bean.Order;

import java.util.HashSet;
import java.util.Set;

public class FoodDeliveryRepository {

    // HashSets to store our data (As per assignment rules)
    private final Set<Customer> customers = new HashSet<>();
    private final Set<Order> orders = new HashSet<>();

    // --- Customer Methods ---
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Searches for a customer by their ID
    public Customer findCustomerById(int customerId) {
        for (Customer c : customers) {
            if (c.getCustomerID() == customerId) {
                return c;
            }
        }
        return null;
    }

    // --- Order Methods
    // Adds an order to the HashSet
    public void addOrder(Order order) {
        orders.add(order);
    }

    // Retrieves all orders for a specific customer
    public Set<Order> getOrdersByCustomerId(int customerId) {
        Set<Order> customerOrders = new HashSet<>();
        for (Order o : orders) {
            if (o.getCustomerId() == customerId) {
                customerOrders.add(o);
            }
        }
        return customerOrders;
    }

    // --- Bonus Challenge Method
    // Removes an order by its ID
    public boolean removeOrder(int orderId) {
        for (Order o : orders) {
            if (o.getOrderId() == orderId) {
                return orders.remove(o);
            }
        }
        return false;
    }
}