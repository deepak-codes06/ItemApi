package com.deepak.itemapi.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Item {
    private int id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Description is required")
    private String description;
}
