package com.deepak.itemapi.controller;

import com.deepak.itemapi.model.Item;
import com.deepak.itemapi.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class ItemController {
    private final ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<String> addItem(@Valid @RequestBody Item item) {
        service.addItem(item);
        return ResponseEntity.ok("Item added");
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getItem(@PathVariable int id) {
        return service.getItemById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
