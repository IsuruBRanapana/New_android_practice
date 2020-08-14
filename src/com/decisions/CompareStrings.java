package com;

import javax.swing.*;

public class CompareStrings {
    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog("Enter Name 1 :");
        String name2 = JOptionPane.showInputDialog("Enter Name 2 :");

        //don't use == to compare strings. use compareTo or equals to compare strings
        if(name1.equals(name2)){
            JOptionPane.showMessageDialog(null,"Names are Same");
        }else {
            JOptionPane.showMessageDialog(null,"Names are Not Same");
        }
    }
}
