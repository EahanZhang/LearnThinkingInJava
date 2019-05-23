/**
 * - Created by EhangZhang on 2019/5/23.
 * - Description:
 *      用十六进制和八进制操作long值，用Long.toBinaryString()来显示
 * - Solution:
 */
public class Practice8 {

    public static void main(String[] args) {
        long l1 = 0xFFFF;
        long l2 = 0177;

        System.out.println(Long.toBinaryString(l1));
        System.out.println(Long.toBinaryString(l1<<1));
        System.out.println(Long.toBinaryString(l1>>1));
        System.out.println(Long.toBinaryString(l2));
        System.out.println(Long.toBinaryString(l2<<1));
        System.out.println(Long.toBinaryString(l2>>1));
    }
}
