/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.util;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author Admin
 */
public class Validator {
    public String getString(String text, JLabel msg){
        if(text.isBlank()){
            msg.setText(msg.getName() + " khong duoc trong");
            msg.setForeground(Color.red);
            return null;
        }else{
            msg.setText("");
            return text;
        }
    }
    public float getMark(String text, JLabel msg){
        text = getString(text, msg);
        float result = -1;
        if(text != null){
            try{
                result = Float.parseFloat(text);
                msg.setText("");
                if(result < 0 || result > 10){
                    msg.setText(msg.getName() + " loi du lieu");
                    msg.setForeground(Color.red);
                    result = -1;
                }else{
                    msg.setText("");
                }
            }catch(NumberFormatException e){
                msg.setText(msg.getName() + " loi du lieu");
                msg.setForeground(Color.red);
            }
        }
        return result;
    }
}
