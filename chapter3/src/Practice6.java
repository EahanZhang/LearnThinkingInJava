/**
 * - Created by EhangZhang on 2019/5/23.
 * - Description:
 *      使用练习5中使用的Dog类创建两个成员属性相同的对象，分别使用==和equals对两者进行判断，查看判等结果。
 * - Solution:
 */
public class Practice6 {

    public static void main(String[] args) {
        Dog d1 = new Dog("spot", "Ruff!");
        Dog d2 = new Dog("spot", "Ruff!");

        // ==比较的是两个对象的引用，由于d1和d2指向不同的内存地址，因此返回false
        System.out.println(d1 == d2);
        // equals比较的是两个对象的引用，由于d1和d2指向不同的内存地址，因此返回false. 如果想要equals()返回true，需要覆盖equals()
        System.out.println(d1.equals(d2));

        Integer i1 = new Integer(47);
        Integer i2 = new Integer(47);

        // Integer默认覆盖了equals()方法，因此equals返回true
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
    }

}
