/**
 * - Created by EhangZhang on 2019/5/23.
 * - Description:
 *      初始化两个01交替的数字，输出所有按位操作符的计算结果
 * - Solution:
 */
public class Practice10 {

    public static void main(String[] args) {
        int i1 = 0xAAAAAAAA;
        int i2 = 0x55555555;

        System.out.println("i1: " + Integer.toBinaryString(i1));
        System.out.println("i2: " + Integer.toBinaryString(i2));

        System.out.println("i1 & i2: " + Integer.toBinaryString(i1 & i2));
        System.out.println("i1 | i2: " + Integer.toBinaryString(i1 | i2));
        System.out.println("i1 ^ i2: " + Integer.toBinaryString(i1 ^ i2));
        System.out.println("~i1: " + Integer.toBinaryString(~i1));
    }
}
