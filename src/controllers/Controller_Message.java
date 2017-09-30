/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Model_Message;
import views.View_Message;

/**
 *
 * @author Mike
 */
public class Controller_Message implements ActionListener {

    private final Model_Message model_Message;
    private final View_Message view_Message;

    public Controller_Message(View_Message view_Message, Model_Message model_Message) {
        this.view_Message = view_Message;
        this.model_Message = model_Message;
        view_Message.jb_hello.addActionListener(this);
        view_Message.jb_bye.addActionListener(this);
        initView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view_Message.jb_hello) {
            jb_helloActionPerformed();
        } else if (e.getSource() == view_Message.jb_bye) {
            jb_byeActionPerformed();
        }
    }

    private void jb_helloActionPerformed() {
        model_Message.setMessage("Hello from MVC");
        view_Message.jl_message.setText(model_Message.getMessage());
    }

    private void jb_byeActionPerformed() {
        model_Message.setMessage("Bye MVC");
        view_Message.jl_message.setText(model_Message.getMessage());
    }

    private void initView() {
        view_Message.setTitle("Hello MVC");
        view_Message.setLocationRelativeTo(null);
        view_Message.jl_message.setText(model_Message.getMessage());
        view_Message.setVisible(true);
    }
}
