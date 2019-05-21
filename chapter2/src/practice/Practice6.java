package practice;

/**
 * - Created by EhangZhang on 2019/5/21.
 * - Description:
 *      编写一个包含storage()方法的类并调用该方法
 * - Solution:
 */
public class Practice6 {

    public static void main(String[] args) {
        String str = "asbdafs";
        System.out.println("Store string \"" + str + "\" need " + Practice6.storage(str) + " bytes.");
    }

    public static int storage(String s) {
        if (s == null) return 0;
        return s.length() * 2;
    }
}
