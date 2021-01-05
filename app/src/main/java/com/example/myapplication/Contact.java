package com.example.myapplication;

public class Contact {
    private String name;
    private String phone;
    private String email;
    private String image;
    private String id;

    public Contact(){
    }

    public Contact(String name, String phone, String email, String image, String id){
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.image = image;
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
