package security;

public interface UserWebSecurity {

    String createBCrypt(String password);

    void secure(String password);
}
