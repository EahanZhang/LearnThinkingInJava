/**
 * - Created by EhangZhang on 2019/5/23.
 * - Description:
 *      以一个所有位为1的数字开始，先左移它，然后用无符号右移操作进行右移，直至所有的二进制位被移出为止
 * - Solution:
 */
public class Practice12 {

    public static void main(String[] args) {
        int i1 = 0xFFFF;
        System.out.println(Integer.toBinaryString(i1));
        i1 <<= 1;
        System.out.println(Integer.toBinaryString(i1));

        int count = 31;
        while (count-- > 0) {
            i1 >>>= 1;
            System.out.println(Integer.toBinaryString(i1));
        }
    }
}
