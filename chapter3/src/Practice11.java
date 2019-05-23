/**
 * - Created by EhangZhang on 2019/5/23.
 * - Description:
 *      以一个最高位为1的二进制数字开始，对其进行有符号右移直到多有的二进制位都被移出为止,输出每次移位之后的数
 * - Solution:
 */
public class Practice11 {

    public static void main(String[] args) {
        int i = 0xDAA11FFA;
//        int i = 0x7AA11FFA;
        int count = 31;
        while (count-- > 0) {
            i >>= 1;
//            System.out.println("count:\t" + count + "\ti:\t" + i + ":\t\t" + Integer.toBinaryString(i));
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
