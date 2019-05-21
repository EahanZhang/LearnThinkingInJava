package upcasting.and.downcast;

/**
 * - Created by sunshine on 2019/5/20.
 * - Description:
 * - Solution:
 */
public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Line line = new Line();
        Rectangle rectangle = new Rectangle();

        ShapeController controller = new ShapeController();
        controller.doSomething(circle);
        controller.doSomething(line);
        controller.doSomething(rectangle);
    }
}
