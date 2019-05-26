/**
 * - Created by EhangZhang on 2019/5/26.
 * - Description:
 *      编写具有两个构造器的类，并在第一个构造器中使用this调用第二个构造器
 * - Solution:
 */
public class Practice9 {

    private int a;
    private int b;

    public Practice9(int num1, int num2) {
        // this() 必须置于起始处, 并且只能在构造器中调用其他构造器
        this(num1);
        b = num2;
    }

    public Practice9(int num) {
        a = num;
    }

    public void print() {
        System.out.println("a = " + this.a + ", b = " + this.b + ".");
    }

    public static void main(String[] args) {
        Practice9 practice9 = new Practice9(1, 2);
        // 输出结果中a和b均不为0，说明均已被初始化
        practice9.print();
    }
}
