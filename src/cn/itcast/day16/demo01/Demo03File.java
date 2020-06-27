package cn.itcast.day16.demo01;

import java.io.File;

/*
* File类获取功能的方法
*       - public String getAbsolutePath()：返回此File的绝对路径名字符串
*       - public String getPath()：将此File转换为路径名字符串
*       - public String getName()：返回由此File表示的文件或目录的名称
*       - public long length()：返回由此File表示的文件的长度
* */
public class Demo03File {
    public static void main(String[] args) {
        show01();
        System.out.println("====================");
        show02();
        System.out.println("====================");
        show03();
        System.out.println("====================");
        show04();
    }

    /*
    * public String getAbsolutePath()：返回此File的绝对路径名字符串
    * 获取的是构造方法中传递的路径
    * 无论路径是绝对的还是相对的，getAbsolutePath方法返回的都是绝对路径
    * */
    private static void show01(){
        File f1 = new File("D:\\JavaProject\\IDEAProject\\basic-code\\a.txt");  //a.txt不存在
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println(absolutePath1);  //D:\JavaProject\IDEAProject\basic-code\a.txt，a.txt该文件未被创建

        File f2 = new File("b.txt");    //b.txt不存在
        String absolutePath2 = f2.getAbsolutePath();
        System.out.println(absolutePath2);  //D:\JavaProject\IDEAProject\basic-code\b.txt，b.txt该文件未被创建
        //注意：输出的路径是相对于当前项目的根路径！！
    }

    /*
    * public String getPath()：将此File转换为路径名字符串
    * 获取的是构造方法中传递的路径
    * */
    private static void show02(){
        File f1 = new File("D:\\JavaProject\\IDEAProject\\basic-code\\a.txt");  ////a.txt不存在
        File f2 = new File("b.txt");    //b.txt不存在
        String path1 = f1.getPath();
        String path2 = f2.getPath();
        System.out.println(path1);  //D:\JavaProject\IDEAProject\basic-code\a.txt，a.txt该文件未被创建
        System.out.println(path2);  //b.txt，b.txt该文件未被创建

        System.out.println(f1); //D:\JavaProject\IDEAProject\basic-code\a.txt，a.txt该文件未被创建
        //toString方法，调用的就是getPath方法
        System.out.println(f1.toString());  //D:\JavaProject\IDEAProject\basic-code\a.txt，a.txt该文件未被创建
    }

    /*
    * public String getName()：返回由此File表示的文件或目录的名称
    * 获取的就是构造方法传递路径的结尾部分(文件/文件夹)
    * */
    private static void show03(){
        File f1 = new File("D:\\JavaProject\\IDEAProject\\basic-code\\a.txt");  //a.txt不存在，以文件结尾
        String name1 = f1.getName();
        System.out.println(name1);  //a.txt，a.txt该文件未被创建

        File f2 = new File("a.txt");    //a.txt不存在
        String name2 = f2.getName();
        System.out.println(name2);  //a.txt，a.txt该文件未被创建

        File f3 = new File("D:\\JavaProject\\IDEAProject\\basic-code"); //以文件夹结尾
        String name3 = f3.getName();
        System.out.println(name3);  //basic-code
    }

    /*
    * public long length()：返回由此File表示的文件的长度
    * 获取的是构造方法指定的文件的大小，以字节为单位
    * 注意：
    *       文件夹是没有大小概念的，不能获取文件夹的大小
    *       如果构造方法中给出的路径不存在，那么length方法返回0
    * */
    private static void show04(){
        File f1 = new File("F:\\云相册\\img.jpg");
        long length1 = f1.length();
        System.out.println(length1);    //2548377，以字节为单位

        File f2 = new File("F:\\云相册\\1.jpg");   //1.jpg不存在
        long length2 = f2.length();
        System.out.println(length2);    //0，且1.jpg没有被创建

        File f3 = new File("F:\\云相册");  //文件夹
        long length3 = f3.length();
        System.out.println(length3);    //0，文件夹是没有大小概念的
    }
}
