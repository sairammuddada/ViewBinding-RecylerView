package com.example.viewbindingrecylerview;

public class Model {
    int image;
    String name;
    String email;
    String dateOfBirth;
    String mobile;

    public Model(int image, String name, String email, String dateOfBirth, String mobile) {
        this.image = image;
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.mobile = mobile;
    }

    public int getImage() { return image; }

    public void setImage(int image) { this.image = image; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getDateOfBirth() { return dateOfBirth; }

    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getMobile() { return mobile; }

    public void setMobile(String mobile) { this.mobile = mobile; }
}
