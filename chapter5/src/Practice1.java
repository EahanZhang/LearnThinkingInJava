/**
 * - Created by EhangZhang on 2019/5/24.
 * - Description:
 *      创建一个类，它包含一个未初始化的String引用，证明Java已默认将其初始化为null
 * - Solution:
 */
public class Practice1 {

    private String str;

    public String getStr() {
        return str;
    }

    public static void main(String[] args) {
        Practice1 practice1 = new Practice1();
        System.out.println(practice1.getStr());

        // 此处编译器报错, 这说明，Java不会默认初始化方法内部的局部变量
//        String testStr;
//        System.out.println(testStr);
    }
}
