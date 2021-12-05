package com.WebDriverBasic;

public class WebsiteLaunch extends Browser {
    public static void main(String[] args){
        chrome_launch();
        open_URL();
        //chrome_close();
        driver.manage().window().maximize();
    }
    public  static  void open_URL(){
        driver.get("https://google.com");
    }
    public static  void open_offline_Url(){
        driver.get("file:///H:/Javacode/demo_opencart/Your Store.html");
        driver.get("http://localhost:8080/mypage.html");

    }

}
