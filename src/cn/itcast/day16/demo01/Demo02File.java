package cn.itcast.day16.demo01;

import java.io.File;

/*
* File类的构造方法
*
* 路径：
*       绝对路径：是一个完整的路径
*           以盘符(c:,D:,...)开始的路径
*               例：c:\\a.txt
*                   C:\\Users\\itcast\\IdeaProject\\123.txt
*                   D:\\demo\\b.txt
*       相对路径：是一个简化的路径
*           相对指的是相对于当前项目的根目录(C:\\Users\\itcast\\IdeaProject\\123.txt)，不是该运行程序所在的路径
*           如果使用当前项目的根目录，路径可以简化为书写
*               C:\\Users\\itcast\\IdeaProject\\123.txt --> 简化为：123.txt(可以省略项目的根目录)
*       注意：
*           1、路径是不区分大小写
*           2、路径中的文件名称分隔符windows使用反斜杠，反斜杠是转义字符，两个反斜杠代表一个普通的反斜杠
*
* 注意：相对路径
* 例：本程序所在路径为D:\JavaProject\IDEAProject\basic-code\day16-FileAndRecursion\src\cn\itcast\day16\demo01\Demo02File
* 则当前项目的根目录为：D:\JavaProject\IDEAProject\basic-code
* 相对路径理解为：在写构造方法的字符串前面就默认添加了当前项目的根目录。如默认添加了D:\JavaProject\IDEAProject\basic-code
* */
public class Demo02File {
    public static void main(String[] args) {
        /*
        * File类的构造方法
        * */
        show01();
        System.out.println("=======================");
        show02("F:\\", "a.txt");  //F:\a.txt    未创建文件
        show02("d:\\", "a.txt");  //d:\a.txt    未创建文件
        System.out.println("=======================");
        show03();

    }

    /*
    * File(String pathName)：通过将给定路径名字符串转换为抽象路径名来创建一个新File实例
    * 参数：
    *       String pathName：字符串的路径名称
    *       路径可以是以文件结尾，也可以是以文件夹结尾
    *       路径可以是相对路径，也可以是绝对路径
    *       路径可以是存在的，也可以是不存在的
    *       创建File对象，只是把字符串路径封装为File对象，不考虑路径的真假情况
    * */
    private static void show01(){
        //以文件结尾，且a.java文件不存在。运行后没有创建a.java文件
        File f1 = new File("D:\\JavaProject\\IDEAProject\\java-1\\src\\com\\bjpowernode\\a.java");
        System.out.println(f1.toString()); //D:\JavaProject\IDEAProject\java-1\src\com\bjpowernode\MyTest.java - 重写了Object类的toString方法

        File f2 = new File("D:\\JavaProject\\IDEAProject\\java-1\\src\\com\\bjpowernode");   //以文件夹结尾
        System.out.println(f2); //D:\JavaProject\IDEAProject\java-1\src\com\bjpowernode

        File f3 = new File("b.txt");    //相对路径，b.txt文件不存在，且运行之后b.txt文件没有被创建
        System.out.println(f3); //b.txt
    }

    /*
    * File(String parent, String child)：根据parent路径名字符串和child路径名字符串创建一个新File实例
    * 参数：把路径分成了两部分
    *       String parent：父路径
    *       String child：子路径
    * 好处：
    *       父路径和子路径，可以单独书写，使用起来非常灵活；父路径和子路径都可以变化
    * */
    private static void show02(String parent, String child){
        File file = new File(parent, child);
        System.out.println(file);
    }

    /*
    * File(File parent, String child)：根据parent抽象路径名和child路径名字符串创建一个新File实例
    * 参数：把路径分成了两部分
    *       File parent：父路径
    *       String child：子路径
    * 好处：
    *       父路径和子路径，可以单独书写，使用起来非常灵活；父路径和子路径都可以变化
    *       父路径是File类型，可以使用File的方法对路径进行一些操作，再使用路径创建对象
    * */
    private static void show03(){
        File parent = new File("D:\\");
        File file = new File(parent, "b.java"); //D:\b.java
        System.out.println(file);
    }
}
