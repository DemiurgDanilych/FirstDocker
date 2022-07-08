package ru.netology.danilagafonov.rest.repository;

import ru.netology.danilagafonov.rest.authorities.Authorities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {

        Map<String, String> users = new HashMap<>();
        users.put("111", "222");
        List<Authorities> authoritiesList = new ArrayList<>();
        authoritiesList.add(Authorities.DELETE);
        authoritiesList.add(Authorities.WRITE);

        if (users.containsKey(user) && users.containsValue(password)) {
            return authoritiesList;
        } else {
            return new ArrayList<>();
        }
    }
}