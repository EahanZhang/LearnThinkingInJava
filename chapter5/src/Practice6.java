/**
 * - Created by EhangZhang on 2019/5/26.
 * - Description:
 *      验证交换参数位置方法重载依然有效
 * - Solution:
 */
public class Practice6 {

    public void print(int i, String str) {
        System.out.println(i + str);
    }

    public void print(String str, int i) {
        System.out.println(str + i);
    }

    public static void main(String[] args) {
        Practice6 practice6 = new Practice6();
        practice6.print(1, "hello");
        practice6.print("hello", 1);
    }
}
