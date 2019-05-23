/**
 * - Created by EhangZhang on 2019/5/23.
 * - Description:
 *      编写一个方法，它以二进制方式显示char类型的值
 * - Solution:
 */
public class Practice13 {

    public static String charToBinary(char ch) {
        return Integer.toBinaryString((int) ch);
    }

    public static void main(String[] args) {
        char ch1 = ' ';
        char ch2 = '*';

        System.out.println(charToBinary(ch1));
        System.out.println(charToBinary(ch2));
    }
}
