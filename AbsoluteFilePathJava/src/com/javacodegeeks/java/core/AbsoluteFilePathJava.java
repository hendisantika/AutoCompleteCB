/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javacodegeeks.java.core;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Uchiha Itachi
 */
public class AbsoluteFilePathJava {
    public static void main(String[] args) {

//        String filepath = "src/com/javacodegeeks/java/core/Istiqra.txt";
        String filepath = "C:\\Users\\hendi.santika\\Documents\\NetBeansProjects\\AbsoluteFilePathJava\\src\\com\\javacodegeeks\\java\\core\\Istiqra.txt";

        File file = new File(filepath);

        String absoluteFilePath = file.getAbsolutePath();
        
        String parentDir = absoluteFilePath.substring(0,
                absoluteFilePath.lastIndexOf(File.separator));

//        System.out.println("Absolute File path : " + absoluteFilePath);
//        
        JOptionPane.showMessageDialog(null, "Absolute File path : " + absoluteFilePath +
                "\nParent Directory path : " + parentDir);

        

//        System.out.println("Parent Directory path : " + parentDir);       
      

    }
    
}
