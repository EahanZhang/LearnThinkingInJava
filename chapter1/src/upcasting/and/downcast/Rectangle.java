package upcasting.and.downcast;

/**
 * - Created by sunshine on 2019/5/20.
 * - Description:
 * - Solution:
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw rectangle.");
    }

    @Override
    public void erase() {
        System.out.println("Erase rectangle.");
    }
}
