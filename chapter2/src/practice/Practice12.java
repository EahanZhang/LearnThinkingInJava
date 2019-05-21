package practice;

import java.util.Date;

/**
 * - Created by EhangZhang on 2019/5/22.
 * - Description:
 *      运行HelloDate带注释的版本，生成JavaDoc并在Web浏览器上查看
 * - Solution:
 */
public class Practice12 {
}

/** The first Thinking in Java example program.
 * Displays a string and today's date.
 * @author ehang zhang
 * @author www.****.com
 * @version 1.0
 */
class HelloDate {
    /** Entry point to class and application.
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, it's: ");
        System.out.println(new Date());
    }
}
