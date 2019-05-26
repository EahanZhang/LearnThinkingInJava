/**
 * - Created by EhangZhang on 2019/5/26.
 * - Description:
 *      编写具有两个方法的类，在第一个方法调用第二个方法两次：第一次调用不使用this关键字，第二次调用使用this关键字
 * - Solution:
 */
public class Practice8 {

    private void func2() {
        System.out.println("This is function two.");
    }

    public void func1() {
        System.out.println("This is function one.");
        func2();
        this.func2();
    }

    public static void main(String[] args) {
        Practice8 practice8 = new Practice8();
        practice8.func1();
    }

}
