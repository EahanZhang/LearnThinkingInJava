package practice;

/**
 * - Created by EhangZhang on 2019/5/21.
 * - Description:
 *      修改DataOnly类并将其输出
 * - Solution:
 */
public class Practice5 {
    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly(1, 1.0, true);
        System.out.println("i = " + dataOnly.i + ", d = " + dataOnly.d + ", b = " + dataOnly.b);
    }
}

class DataOnly {
    int i;
    double d;
    boolean b;

    public DataOnly(int i, double d, boolean b) {
        this.i = i;
        this.d = d;
        this.b = b;
    }
}
