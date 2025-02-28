package testeunitario.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import testeunitario.controllers.UserController;

public class UserControllerTest {

    @Test
    void verificarGetUser(){

        UserController userController = new UserController();

        assertEquals("get user was called muito massa doido", userController.getUser());
    }

}
