/**
 * - Created by EhangZhang on 2019/5/24.
 * - Description:
 *      穿件一个名为Dog的类，它具有重载的bark()方法。
 * - Solution:
 */
public class Practice5 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.bark(1);
        dog.bark("");
    }
}

class Dog {

    public void bark() {
        System.out.println("barking");
    }

    public void bark(int howling) {
        System.out.println("howling");
    }

    public void bark(String wang) {
        System.out.println("Wang wang");
    }
}

