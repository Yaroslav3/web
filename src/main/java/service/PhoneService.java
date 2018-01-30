package service;

public interface PhoneService {
    boolean addPhone(String name, String color, int memory, int numberOfMegapixels, String photo);
    public void deletePhone(int id);
}
