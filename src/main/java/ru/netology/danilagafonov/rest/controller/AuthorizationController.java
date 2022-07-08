package ru.netology.danilagafonov.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.netology.danilagafonov.rest.authorities.Authorities;
import ru.netology.danilagafonov.rest.exception.InvalidCredentials;
import ru.netology.danilagafonov.rest.exception.UnauthorizedUser;
import ru.netology.danilagafonov.rest.service.AuthorizationService;
import java.util.List;

@RestController
public class AuthorizationController {
    @Autowired AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }

    @ExceptionHandler(InvalidCredentials.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String resolveInvalidCredentials(InvalidCredentials ex) {
        return ex.getMessage();
    }

    @ExceptionHandler(UnauthorizedUser.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    String resolveUnauthorizedUser(UnauthorizedUser ex) {
        System.out.println(ex.getMessage());
        return ex.getMessage();
    }
}