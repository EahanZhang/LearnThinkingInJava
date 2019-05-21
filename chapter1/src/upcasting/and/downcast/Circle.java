package upcasting.and.downcast;

/**
 * - Created by sunshine on 2019/5/20.
 * - Description:
 * - Solution:
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw circle.");
    }

    @Override
    public void erase() {
        System.out.println("Erase circle.");
    }
}
