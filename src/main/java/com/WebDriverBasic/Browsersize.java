package com.WebDriverBasic;

import org.openqa.selenium.Dimension;

public class Browsersize extends Browser {
    public static void main(String[] args) {
        firefox_launch();
        get_Browser_maximize_size();
        ipad();
       firefox_close();
    }
    public static void get_Browser_maximize_size(){
        int width=driver.manage().window().getSize().getWidth();
        int height=driver.manage().window().getSize().getHeight();
        System.out.println("Width: "+width+"  Height "+height);
        //Width: 1296 Height 813
        // chrome Width: 1050 Height 840
    }

    public static void ipad(){
        driver.manage().window().setSize(new Dimension ( 1296, 813));
        int width=driver.manage().window().getSize().getWidth();
        int height=driver.manage().window().getSize().getHeight();
        System.out.println("ipad Width: "+width+" ipad Height "+height);
    }
}
