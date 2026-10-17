package org.example.inventoryapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Product name cannot be blank")
    private String name;

    @NotBlank(message = "Product category cannot be blank")
    private String category;

    @Min(value = 0, message = "Product quantity cannot be blank")
    private int quantity;

    public Product(Long id, String name, String category, int quantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
    }

    //GETTERS AND SETTERS
    public Long getId() {return id;}
    public String getName() {return name;}
    public String getCategory() {return category;}
    public int getQuantity() {return quantity;}

    public void setId(Long id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setCategory(String category) {this.category = category;}
    public void setQuantity(int quantity) {this.quantity = quantity;}
}
