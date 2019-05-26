/**
 * - Created by EhangZhang on 2019/5/26.
 * - Description:
 *      编写具有finalize() 方法的类，并在方法中打印消息。
 * - Solution:
 */
public class Practice10 {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Practice10.finalize()");
        super.finalize();
    }

    public static void main(String[] args) {
        // 新建一个用于对象
        Practice10 practice10 = new Practice10();
        // 新建另外一个对象，之前的对象变为无效对象
        practice10 = new Practice10();
        // 调用gc，finalize() 方法被调用
        System.gc();
    }
}
