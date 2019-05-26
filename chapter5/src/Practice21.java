/**
 * - Created by EhangZhang on 2019/5/26.
 * - Description:
 *      创建一个enum，它包含纸币中最小面值的六种类型。通过values()循环并打印每一个值及其ordinal()。
 * - Solution:
 */
public class Practice21 {

    public static void main(String[] args) {
        for (Money m : Money.values()) {
            System.out.println(m + " " + m.ordinal());
        }
    }
}

enum Money {
    ONE, TWO, FIVE, TEN, TWENTY, FIFTY
}
