package cn.itcast.day16.demo01;

import java.io.File;

/*
* File类遍历(文件夹)目录功能
*       - public String[] list()：返回一个String数组，表示File目录中的所有子文件或目录
*       - public File[] listFiles()：返回一个File数组，表示该File目录中所有的子文件或目录
* 注意：
*       list方法和listFile方法遍历的是构造方法中给出的目录
*       如果构造方法中给出的目录的路径不存在，会抛出空指针异常
*       如果构造方法中给出的路径不是一个目录，也会抛出空指针异常
* */
public class Demo06File {
    public static void main(String[] args) {
        show01();
        System.out.println("===================");
        show02();
    }

    /*
    * public String[] list()：返回一个String数组，表示File目录中的所有子文件或目录
    * 遍历构造方法中给出的目录，会获取目录中所有文件/文件夹的名称，把获取到的多个名称存储到一个String类型的数组中
    * 也能够获取隐藏的文件/文件夹
    * */
    private static void show01(){
        File file = new File("D:\\JavaProject\\IDEAProject\\basic-code\\day16-FileAndRecursion");

        //File file = new File("D:\\JavaProject\\IDEAProject\\basic-code\\day1");
        //打印输出：NullPointerException，构造方法中给出的目录的路径不存在，抛出空指针异常

        //File file = new File("D:\\JavaProject\\IDEAProject\\basic-code\\day16-FileAndRecursion\\1.txt");
        // 打印输出：NullPointerException，构造方法中给出的路径不是一个目录，抛出空指针异常

        String[] arr = file.list();
        for (String fileName : arr) {
            System.out.println(fileName);
        }
    }

    /*
    * public File[] listFiles()：返回一个File数组，表示该File目录中所有的子文件或目录
    * 遍历构造方法中给出的目录，会获取目录中所有文件/文件夹名称，把文件/文件夹封装为File对象，多个File对象存储到File数组中
    * */
    private static void show02(){
        File file = new File("D:\\JavaProject\\IDEAProject\\basic-code\\day16-FileAndRecursion");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);  //直接打印f，输出详细路径
        }
    }
}
