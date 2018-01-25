package service;

public interface PhoneService {
    boolean addPhone(String name, String color, double displayResolution, String displayDiagonal, String cpuName,
                     double processorFrequency, byte numberOfCores, byte ram, short memory, byte numberOfMegapixels,
                     int capacityOfTheBattery, short weight, String photo);
}
