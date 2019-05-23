/**
 * - Created by EhangZhang on 2019/5/23.
 * - Description:
 *      编写一个计算速度的程序，它所使用的距离和时间都是常量
 * - Solution:
 */
public class Practice4 {

    public static void main(String[] args) {
        Speed speed1 = new Speed(2.1, 0.3);
        Speed speed2 = new Speed(3.0, 0.0);

        System.out.println("speed1.speed = " + speed1.getSpeed());
        System.out.println("speed2.speed = " + speed2.getSpeed());
    }
}

class Speed {
    double distance;
    double time;
    double speed;

    public Speed(double distance, double time) {
        this.distance = distance;
        this.time = time;

        this.speed = Double.compare(0, time) == 0 ? Double.NaN : this.distance / this.time;
    }

    public double getSpeed() {
        return speed;
    }
}
