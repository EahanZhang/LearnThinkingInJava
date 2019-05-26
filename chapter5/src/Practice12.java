/**
 * - Created by EhangZhang on 2019/5/26.
 * - Description:
 *      编写名为Tank的类，有full或者empty两种状态，终结条件是：对象被清理时必须处于empty状态。
 *      编写finalize()方法检验终结调节是否成立。
 * - Solution:
 */
public class Practice12 {

    public static void main(String[] args) {
        Tank tank1 = new Tank(true);
        System.out.println(tank1);
        tank1.setStatus(false);
        tank1 = new Tank(false);
        // 两次输出tank1的地址不一样， 说明引用指向已经改变
        System.out.println(tank1);
        System.gc();
    }

}

class Tank {
    boolean isEmpty;

    public Tank(boolean status) {
        this.isEmpty = status;
    }

    public void setStatus(boolean status) {
        this.isEmpty = status;
    }

    @Override
    protected void finalize() throws Throwable {
        if (!isEmpty) {
            // 无效的对象在被回收时会调用finalize()方法
            System.out.println("Error: Object Tank " + this + " is full, can not be finalized.");
        }
        super.finalize();
    }

}
