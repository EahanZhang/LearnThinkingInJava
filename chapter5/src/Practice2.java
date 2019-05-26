/**
 * - Created by EhangZhang on 2019/5/24.
 * - Description:
 *      创建一个类，它包含一个在定义时就被初始化了String域，以及另一个通过构造器初始化的String域，观察两者的差异。
 * - Solution:
 */
public class Practice2 {
    String str = "abc";

    public Practice2() {
    }

    public Practice2(String str) {
        this.str = str;
    }

    public static void main(String[] args) {
        Practice2 test1 = new Practice2();
        Practice2 test2 = new Practice2("efg");
        System.out.println(test1.str);
        System.out.println(test2.str);
    }
}
