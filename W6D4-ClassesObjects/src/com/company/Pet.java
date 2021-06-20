package com.company;

class Pet {
    private String name, location, type;
    private int age;

    public Pet() {
        name = "";
        location = "";
        type = "";
        age = 0;
    }

    public Pet(String name, String location, int age) {
        this.name = name;
        this.location = location;
        age = 3;
    }

    public Pet(String name, String location, String type, int age) {
        this.name = name;
        this.location = location;
        this.type = type;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation(String location) {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getType() {
        System.out.println(type);
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                '}';
    }

    public boolean isNewShop() {
        return age >= 3;
    }
    public static void main(String[] args) {
        //Send Help Plz
    }

}