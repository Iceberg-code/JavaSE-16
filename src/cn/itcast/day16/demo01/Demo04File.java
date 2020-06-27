package cn.itcast.day16.demo01;

import java.io.File;

/*
* File判断功能的方法
*       - public boolean exists()：此File表示的文件或目录是否实际存在
*       - public boolean isDirectory()：此File表示的是否为目录
*       - public boolean isFile()：此File表示的是否为文件
* */
public class Demo04File {
    public static void main(String[] args) {
        show01();
        System.out.println("=====================");
        show02();
    }

    /*
    * public boolean exists()：此File表示的文件或目录是否实际存在
    * 用于判断构造方法中的路径是否存在
    *       存在：返回true
    *       不存在：返回false
    * */
    private static void show01(){
        File f1 = new File("D:\\JavaProject\\IDEAProject\\basic-code");
        System.out.println(f1.exists());    //true

        File f2 = new File("D:\\JavaProject\\IDEAProject\\basic");  //该文件/文件夹不存在
        System.out.println(f2.exists());    //false，且没有文件或文件夹被创建

        File f3 = new File("out");  //相对路径(相对于当前项目的根目录)，注意：根目录下out文件夹存在
        System.out.println(f3.exists());    //true

        File f4 = new File("a.txt");    //相对路径(相对于当前项目的根目录)，根目录下没有a.txt，
        System.out.println(f4.exists());    //false，根目录下没有创建a.txt，本程序的demo01文件夹下也没有创建a.txt
    }

    /*
    * public boolean isDirectory()：此File表示的是否为目录
    *       用于判断构造方法中给定的路径是否以文件夹结尾
    *           是：返回true
    *           不是：返回false
    * public boolean isFile()：此File表示的是否为文件
    *       用于判断构造方法中给定的路径是否以文件结尾
    *           是：返回true
    *           不是：返回false
    * 注意：
    *       电脑的硬盘中只有文件/文件夹，两个方法是互斥的
    *       这两个方法的使用前提，路径必须是存在的，否则都返回false
    * */
    public static void show02(){
        File f1 = new File("D:\\JavaProject\\IDEAProject\\basic");  //该文件/文件夹不存在
        //不存在就没有必要获取
//        if(f1.exists()){
//            System.out.println(f1.isDirectory());   //false，没有文件/文件夹被创建
//            System.out.println(f1.isFile());    //false，没有文件/文件夹被创建
//        }

        System.out.println(f1.isDirectory());   //false，没有文件/文件夹被创建
        System.out.println(f1.isFile());    //false，没有文件/文件夹被创建

        File f2 = new File("D:\\JavaProject\\IDEAProject\\basic-code"); //存在
        System.out.println(f2.isDirectory());   //true
        System.out.println(f2.isFile());    //false

        File f3 = new File("F:\\云相册\\img.jpg");
        System.out.println(f3.isDirectory());   //false
        System.out.println(f3.isFile());    //true
    }
}
