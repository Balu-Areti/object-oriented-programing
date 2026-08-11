package com.java.collections;

import com.java.model.Customer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CustomerSet {

    static void main() {
        Set<Customer> customers = new HashSet<>();
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();
        Customer customer4 = new Customer();

        customer1.setId(103).setName("Balu").setPhoneNumber("9989959789").setEmail("balu@gmail.com").setActive(true).setPassword("Balu@123");
        customer2.setId(102).setName("Madhu").setPhoneNumber("93456789").setEmail("madhu@gmail.com").setActive(true).setPassword("Madhu@1234");
        customer3.setId(101).setName("Madhu Samala").setEmail("customer1@gmail.com").setPhoneNumber("9876543210L").setActive(true).setPassword("Abcd@1234");
        customer4.setId(101).setName("Madhu Samala").setEmail("customer1@gmail.com").setPhoneNumber("9876543210L").setActive(true).setPassword("Abcd@1234");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);

        System.out.println(customers);


        // Collections (Set, List, Queue) we use to Iteration
        // Interface Iterator
        //hasNext(): (Return type: boolean)
       // next(): (Return type: Object / Customer)
        //remove(): (Return type: void)
        Iterator<Customer> iterator = customers.iterator();
        Customer customer = null;
        CustomerService customerService = new CustomerService();
        while (iterator.hasNext()){
            customer = iterator.next();
            customerService.displayCustomer(customer);
        }


    }

}
