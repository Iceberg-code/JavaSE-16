package cn.itcast.day16.demo02;
/*
* 练习：
*       使用递归计算1-n之间的和
* */
public class Demo02Recursion {
    public static void main(String[] args) {
        int s = sum(3); //n太大就不行了，例：n = 30000就会抛出异常
        System.out.println(s);
    }

    /*
    * 定义一个方法，使用递归计算1-n之间的和
    *   1+2+...+n   等价于   n+(n-1)+...+1
    * 已知：
    *       最大值：n
    *       最小值：1
    * 使用递归必须明确
    *       1、递归的结束条件
    *           获取到1的时候结束
    *       2、递归的目的
    *           获取下一个被加的数字(n-1)
    * */
    private static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n -1);
    }
}
