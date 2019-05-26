/**
 * - Created by EhangZhang on 2019/5/26.
 * - Description:
 *      创建一个没有构造器的类，验证编译器会自动加入默认构造器
 * - Solution:
 */
public class Practice7 {

    public static void main(String[] args) {
        // 编译通过， 说明已经自动加入了默认构造器
        Practice7 practice7 = new Practice7();
    }
}
