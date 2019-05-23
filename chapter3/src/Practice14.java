/**
 * - Created by EhangZhang on 2019/5/23.
 * - Description:
 *      编写一个接受两个字符串参数的方法，用各种布尔值关系来比较这两个字符串并打印出结果，并且使用equals()做测试
 * - Solution:
 */
public class Practice14 {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";

        String s3 = new String("aaa");
        String s4 = new String("aaa");

        System.out.println(s1 == s2); // true
        System.out.println(s1.equals(s2)); // true

        // 说明String类已经覆盖了equals()方法
        System.out.println(s3 == s4); // false
        System.out.println(s3.equals(s4)); // true
    }
}
