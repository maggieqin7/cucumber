package com.cucumber.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.Thread.sleep;

public class CucumberExample {
    public static void main(String[] args) throws InterruptedException {
        // 设置 ChromeDriver 的路径
        ChromeOptions options = new ChromeOptions();
        // 允许所有请求
        options.addArguments("--remote-allow-origins=*");
        // 初始化 Chrome 浏览器驱动
        WebDriver webDriver = new ChromeDriver(options);
        // 打开指定的网页
        webDriver.get("https://www.baidu.com");
        // 进行其他操作，如查找元素、与元素交互等
        //等待5秒
        sleep(5000);
        // 关闭浏览器
        webDriver.quit();
    }
}
