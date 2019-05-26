/**
 * - Created by EhangZhang on 2019/5/26.
 * - Description:
 *      创建一个类，它可以接受一个可变参数的String数组
 * - Solution:
 */
public class Practice19 {
    public static void printArray(String... array) {
        for (String i : array) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Practice19.printArray("Hello", "World");
    }
}
