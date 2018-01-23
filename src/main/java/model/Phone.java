package model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Phone {
    private String name;
    private String color;
    private double DisplayResolution;
    private String displayDiagonal;
    private String cpuName;
    private double ProcessorFrequency;
    private byte NumberOfCores;
    private byte ram;
    private short memory;
    private byte NumberOfMegapixels;
    private int CapacityOfTheBattery;
    private short weight;
    private String photo;

    public Phone() {

    }

    public Phone(String name, String color, double displayResolution,
                 String displayDiagonal, String cpuName,
                 double processorFrequency, byte numberOfCores, byte ram,
                 short memory, byte numberOfMegapixels,
                 int capacityOfTheBattery, short weight, String photo) {
        this.name = name;
        this.color = color;
        DisplayResolution = displayResolution;
        this.displayDiagonal = displayDiagonal;
        this.cpuName = cpuName;
        ProcessorFrequency = processorFrequency;
        NumberOfCores = numberOfCores;
        this.ram = ram;
        this.memory = memory;
        NumberOfMegapixels = numberOfMegapixels;
        CapacityOfTheBattery = capacityOfTheBattery;
        this.weight = weight;
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", DisplayResolution=" + DisplayResolution +
                ", displayDiagonal='" + displayDiagonal + '\'' +
                ", cpuName='" + cpuName + '\'' +
                ", ProcessorFrequency=" + ProcessorFrequency +
                ", NumberOfCores=" + NumberOfCores +
                ", ram=" + ram +
                ", memory=" + memory +
                ", NumberOfMegapixels=" + NumberOfMegapixels +
                ", CapacityOfTheBattery=" + CapacityOfTheBattery +
                ", weight=" + weight +
                ", photo='" + photo + '\'' +
                '}';
    }
}
