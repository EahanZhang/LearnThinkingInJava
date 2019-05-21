package practice;

/**
 * - Created by sunshine on 2019/5/21.
 * - Description:
 *  Define a int variate and a char variate but do not initialize them, print them and check the out put
 * - Solution:
 */
public class Practice1 {
    private int a;
    private char b;

    public void print() {
        System.out.println(this.a);
        System.out.println(this.b);
    }

    public static void main(String[] args) {
        new Practice1().print();
    }
}
