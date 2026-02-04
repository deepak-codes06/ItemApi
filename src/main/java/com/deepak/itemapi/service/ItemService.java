package com.deepak.itemapi.service;

import com.deepak.itemapi.model.Item;
import com.deepak.itemapi.store.ItemStore;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemService {
    private final ItemStore store;

    public ItemService(ItemStore store) {
        this.store = store;
    }

    public void addItem(Item item) {
        store.addItem(item);
    }

    public Optional<Item> getItemById(int id) {
        return store.getItemById(id);
    }
}
