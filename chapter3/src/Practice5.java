/**
 * - Created by EhangZhang on 2019/5/23.
 * - Description:
 *      编写一个Dog类，包含name和says两个属性。 创建两个Dog对象并输出它们的name和says.
 * - Solution:
 */
public class Practice5 {

    public static void main(String[] args) {
        Dog d1 = new Dog("spot", "Ruff!");
        Dog d2 = new Dog("scruffy", "Wurf!");

        System.out.println("Dog " + d1.name + " says " + d1.says);
        System.out.println("Dog " + d2.name + " says " + d2.says);
    }
}

class Dog {
    String name;
    String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }
}
