/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import views.View_Message;
import models.Model_Message;
import controllers.Controller_Message;

/**
 *
 * @author Mike
 */
public class main {

    private static View_Message view_Message;
    private static Model_Message model_Message;
    private static Controller_Message controller_Message;

    public static void main(String[] args) {
        view_Message = new View_Message();
        model_Message = new Model_Message();
        controller_Message = new Controller_Message(view_Message, model_Message);
    }
}
