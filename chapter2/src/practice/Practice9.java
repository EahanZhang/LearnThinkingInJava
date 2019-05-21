package practice;

/**
 * - Created by EhangZhang on 2019/5/22.
 * - Description:
 *      编写程序展示所有自动包装功能对所有的基本类型和包装器类型都起作用
 * - Solution:
 */
public class Practice9 {
    public static void main(String[] args) {
        Integer i1 = 1;
        Integer i2 = new Integer(2);

        int i3 = new Integer(1);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }
}
