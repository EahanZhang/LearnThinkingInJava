package practice;

/**
 * - Created by EhangZhang on 2019/5/21.
 * - Description:
 *      main()方法中的代码说明，类静态成员变量只被加载一次，每次修改该变量的值，其影响都是全局的
 * - Solution:
 */
public class Practice8 {

    public static void main(String[] args) {
        Increment increment1 = new Increment();
        Increment increment2 = new Increment();

        System.out.println(increment1.getI());

        increment2.increment();
        System.out.println(increment1.getI());
    }
}

class Increment {
    private static int i = 0;

    public int getI() {
        return i;
    }

    public void increment() {
        i++;
    }

}

