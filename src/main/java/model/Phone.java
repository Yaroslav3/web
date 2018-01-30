package model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Phone {
    private int id;
    private String name;
    private String color;
    private int memory;
    private int numberOfMegapixels;
    private String photo;

    public Phone() {

    }

    public Phone(int id, String name, String color, int memory, int numberOfMegapixels, String photo) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.memory = memory;
        this.numberOfMegapixels = numberOfMegapixels;
        this.photo = photo;
    }

    public Phone(String name, String color, int memory, int numberOfMegapixels, String photo) {
        this.name = name;
        this.color = color;
        this.memory = memory;
        this.numberOfMegapixels = numberOfMegapixels;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getNumberOfMegapixels() {
        return numberOfMegapixels;
    }

    public void setNumberOfMegapixels(int numberOfMegapixels) {
        this.numberOfMegapixels = numberOfMegapixels;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return name + " "  + color +" " + memory + " " + numberOfMegapixels;
    }
}
