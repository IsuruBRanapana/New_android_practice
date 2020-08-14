package com.JoptionPanelPractice;

import javax.swing.*;

public class ReadJOptionPanel {
    public static void main(String[] args) {
        String name;
        String surName;

        name = JOptionPane.showInputDialog("Enter Your First Name");
        surName=JOptionPane.showInputDialog("Enter Your Surname");

        JOptionPane.showMessageDialog(null,name+" "+surName);
    }
}
