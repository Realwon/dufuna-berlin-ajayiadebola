
package com.dufuna.berlin.ajayiadebola.collections;

import com.dufuna.berlin.ajayiadebola.model.LekkiProperty;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

public class CollectionsPractice {

    public static void main(String[] args) {

        // CREATE SAMPLE PROPERTIES
        LekkiProperty property1 = new LekkiProperty();
        property1.setPropertyId("LP001");
        property1.setAddress("Lekki Phase 1");
        property1.setType("Duplex");

        LekkiProperty property2 = new LekkiProperty();
        property2.setPropertyId("LP002");
        property2.setAddress("Victoria Island");
        property2.setType("Apartment");

        // 1. ARRAYLIST
        ArrayList<LekkiProperty> properties = new ArrayList<>();

        properties.add(property1);
        properties.add(property2);
        properties.add(property1);

        System.out.println("=== ARRAYLIST ===");
        for (LekkiProperty property : properties) {
            System.out.println(property.getAddress());
        }
        System.out.println("Total properties: " + properties.size());

        // 2. HASHSET
        HashSet<LekkiProperty> uniqueProperties = new HashSet<>();

        uniqueProperties.add(property1);
        uniqueProperties.add(property2);
        uniqueProperties.add(property1);

        System.out.println("\n=== HASHSET ===");
        for (LekkiProperty property : uniqueProperties) {
            System.out.println(property.getAddress());
        }
        System.out.println("Unique properties: " + uniqueProperties.size());

        // 3. TREESET
        TreeSet<String> propertyAddresses = new TreeSet<>();

        propertyAddresses.add("Lekki Phase 1");
        propertyAddresses.add("Victoria Island");
        propertyAddresses.add("Ikoyi");
        propertyAddresses.add("Lekki Phase 1");

        System.out.println("\n=== TREESET ===");
        for (String address : propertyAddresses) {
            System.out.println(address);
        }

        // 4. HASHMAP
        HashMap<String, LekkiProperty> propertyMap = new HashMap<>();

        propertyMap.put(property1.getPropertyId(), property1);
        propertyMap.put(property2.getPropertyId(), property2);

        System.out.println("\n=== HASHMAP ===");
        System.out.println("LP001: " +
                propertyMap.get("LP001").getAddress());
        System.out.println("Total mapped properties: " + propertyMap.size());

        // 5. QUEUE
        Queue<String> propertyQueue = new LinkedList<>();

        propertyQueue.add("Lekki Phase 1");
        propertyQueue.add("Victoria Island");
        propertyQueue.add("Ikoyi");

        System.out.println("\n=== QUEUE ===");
        System.out.println("Next property: " + propertyQueue.peek());
        System.out.println("Processed property: " + propertyQueue.poll());
        System.out.println("Next in queue: " + propertyQueue.peek());
        System.out.println("Remaining properties: " + propertyQueue.size());
    }
}
