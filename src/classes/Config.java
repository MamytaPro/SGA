/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class Config {
    
    public  Config(JFrame frame){
        String title = "Simulateur Guichet Automatique";
        frame.setTitle(title);
        ImageIcon logo = new ImageIcon(getClass().getResource("/icons/lg.png")); 
        frame.setIconImage(logo.getImage());
        frame.setResizable(false);
    }
}
