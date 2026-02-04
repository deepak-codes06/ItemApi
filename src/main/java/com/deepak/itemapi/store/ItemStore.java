package com.deepak.itemapi.store;

import com.deepak.itemapi.model.Item;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class ItemStore {
    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {

        boolean exists = items.stream()
                .anyMatch(i -> i.getId() == item.getId());

        if (exists) {
            throw new RuntimeException("Item with this ID already exists");
        }

        items.add(item);
    }

    public Optional<Item> getItemById(int id) {
        return items.stream()
                .filter(i -> i.getId() == id)
                .findFirst();
    }
}
