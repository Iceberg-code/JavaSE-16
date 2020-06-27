package cn.itcast.day16.demo02;

import java.io.File;

/*
* 练习：
*       递归打印多级目录
* 需求：
*       遍历f:\\abc文件夹，及abc文件夹的子文件
*       只要.java结尾的文件
*       f:\\abc
*       f:\\abc\\abc.java
*       f:\\abc\\abc.txt
*       f:\\abc\\a
*       f:\\abc\\a\\a.jpg
*       f:\\abc\\a\\a.txt
*       f:\\abc\\b
*       f:\\abc\\b\\b.java
*       f:\\abc\\b\\b.txt
* */
public class Demo05Recursion {
    public static void main(String[] args) {
        File file = new File("f:\\abc");
        getAllFile(file);
    }

    /*
    * 定义一个方法，参数传递File类型的目录
    * 方法中对目录进行遍历
    * */
    private static void getAllFile(File dir){
        //System.out.println(dir);    //打印被遍历的目录名称
        File[] files = dir.listFiles();
        for (File f : files) {
            //对遍历得到的File对象f进行判断，判断是否是文件夹
            if(f.isDirectory()){
                //如果f是一个文件夹，则继续遍历这个文件夹
                //我们发现getAllFile方法就是传递文件夹，遍历文件夹的方法
                //所以直接调用getAllFile方法即可：自己调用自己
                getAllFile(f);
            }else{
                //f是一个文件，直接打印即可
                /*
                * f:\\abc\\abc.java
                * 只要.java结尾的文件
                * 1、把File对象f，转换为字符串对象
                * */

/*
                //String name = f.getName();  //abc.java
                //String path = f.getPath();  //f:\\abc\\abc.java
                String s = f.toString();    //f:\\abc\\abc.java

                //把字符串转换为小写
                s = s.toLowerCase();

                //2、调用String类中的方法endWith()判断字符串是否以.java结尾
                boolean b = s.endsWith(".java");

                //3、如果是以.java结尾,则输出
                if(b){
                    System.out.println(f);
                }
*/

                //链式编程
                if(f.getName().toLowerCase().endsWith(".java")){
                    System.out.println(f);
                }
            }
        }
    }
}
