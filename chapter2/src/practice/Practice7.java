package practice;

/**
 * - Created by EhangZhang on 2019/5/22.
 * - Description:
 *      将Incrementable的代码修改为完整可运行的
 * - Solution:
 */
public class Practice7 {
    public static void main(String[] args) {
        System.out.println(StaticTest.i);
        Incrementable.increment();
        System.out.println(StaticTest.i);
    }
}

class StaticTest {
    static int i = 40;
}

class Incrementable {
    static void increment() {
        StaticTest.i++;
    }
}
