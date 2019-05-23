import java.util.Random;

/**
 * - Created by EhangZhang on 2019/5/23.
 * - Description:
 *      编写程序模拟投硬币的结果
 * - Solution:
 */
public class Practice7 {

    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < 10; i++) {
            int res = random.nextInt(100);
            System.out.print(res + "\t");
            if (res > 49) {
                System.out.println(i + ": You win.");
            } else {
                System.out.println(i + ": You lost.");
            }
        }
    }
}
