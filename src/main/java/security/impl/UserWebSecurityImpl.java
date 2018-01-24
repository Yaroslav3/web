package security.impl;

import dao.DaoFactory.ConnectionDatabase;
import security.UserWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserWebSecurityImpl implements UserWebSecurity {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String qwe = encoder.encode("qwe");
        System.out.println(qwe);
        boolean qwe1 = encoder.matches("qwe", qwe);
        System.out.println(qwe1);
    }

    @Override
    public String createBCrypt(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }

    @Override
    public void secure(String password) {
        ConnectionDatabase database = new ConnectionDatabase();
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    }
}
