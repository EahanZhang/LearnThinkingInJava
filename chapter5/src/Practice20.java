/**
 * - Created by EhangZhang on 2019/5/26.
 * - Description:
 *      创建一个使用可变参数列表的main方法，并使用命令行参数测试、
 * - Solution:
 */
public class Practice20 {

    public static void main(String... args) {
        for (String i : args) {
            System.out.println(i);
        }
    }
}
