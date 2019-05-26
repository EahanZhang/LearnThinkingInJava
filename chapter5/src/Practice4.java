/**
 * - Created by EhangZhang on 2019/5/24.
 * - Description:
 *      构造一个默认构造器和带有一个String类型参数的构造器，观察区别
 * - Solution:
 */
public class Practice4 {

    public Practice4() {
        System.out.println("Test for practice4.");
    }

    public Practice4(String str) {
        System.out.println("Test for practice4 with param " + str + ".");
    }

    public static void main(String[] args) {
        Practice4 test1 = new Practice4();
        Practice4 test2 = new Practice4("123");
    }
}
