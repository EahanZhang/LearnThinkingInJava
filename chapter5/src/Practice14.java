/**
 * - Created by EhangZhang on 2019/5/26.
 * - Description:
 *      编写一个类，拥有两个静态字符串域，其中一个在定义处初始化，另一个在静态块中初始化。
 *      现在，加入一个静态方法用于打印两个字段的值。请证明他们都会在被使用之前完成初始化动作。
 * - Solution:
 */
public class Practice14 {
    private static String str1 = "abc";
    private static String str2;

    static {
        str2 = "efg";
    }

    public static void display() {
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }

    public static void main(String[] args) {
        Practice14.display();
    }
}
