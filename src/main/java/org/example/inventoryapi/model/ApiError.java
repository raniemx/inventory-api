package org.example.inventoryapi.model;

public class ApiError {
    private String message;
    private int status;

    public ApiError(String message, int status) {
        this.message = message;
        this.status = status;
    }

    //GETTERS
    public String getMessage() {return message;}
    public int getStatus() {return status;}
}
