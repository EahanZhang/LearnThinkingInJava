/**
 * - Created by EhangZhang on 2019/5/23.
 * - Description:
 *      创建一个包含float域的类，并用这个类来展示别名机制
 * - Solution:
 */
public class Practice2 {

    public static void main(String[] args) {
        // 新建两个测试对象
        FloatTest1 test1 = new FloatTest1();
        FloatTest1 test2 = new FloatTest1();

        // 分别对两个对象的成员变量赋值
        test1.f = 1.0f;
        test2.f = 2.0f;
        System.out.println("test1.f = " + test1.f + ", test2.f = " + test2.f + ".");

        // 将test2赋给test1，实际上是将test2所指向对象的引用赋值给test1
        test1 = test2;
        System.out.println("test1.f = " + test1.f + ", test2.f = " + test2.f + ".");

        // 由于现在test1和test2所指向的内存地址相同，因此修改test1所指向对象的内容，test2中的内容也会变化
        test1.f = 3.0f;
        System.out.println("test1.f = " + test1.f + ", test2.f = " + test2.f + ".");
    }
}

class FloatTest1 {
    float f;
}
