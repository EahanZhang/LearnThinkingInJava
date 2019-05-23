/**
 * - Created by EhangZhang on 2019/5/23.
 * - Description:
 *      创建一个包含float域的类，并用这个类来战士方法调用时的别名机制
 * - Solution:
 */
public class Practice3 {
    public static void change(FloatTest2 f, float x) {
        f.f = x;
    }

    public static void main(String[] args) {
        FloatTest2 test2 = new FloatTest2();
        test2.f = 1.0f;
        System.out.println("test.f = " + test2.f + ".");

        // 传入的test2实际上是test2对象的引用，所以方法内部实际上操作的是对象的实际数据
        change(test2, 2.0f);
        System.out.println("test.f = " + test2.f + ".");
    }
}

class FloatTest2 {
    float f;
}
