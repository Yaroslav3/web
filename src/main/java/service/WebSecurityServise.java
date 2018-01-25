package service;

public interface WebSecurityServise {
    String createBCrypt(String password);

    void secure(String password);
}

