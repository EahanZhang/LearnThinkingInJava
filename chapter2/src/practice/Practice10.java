package practice;

import java.util.Arrays;

/**
 * - Created by EhangZhang on 2019/5/22.
 * - Description:
 *      编写程序，打印从命令行获取的参数
 * - Solution:
 */
public class Practice10 {

    public static void main(String[] args) {
        if (args.length <= 1) return;

        // 使用foreach遍历
        for (String str : args) {
            System.out.println(str);
        }

        // 使用Lambda表达式
        Arrays.asList(args).stream().forEach(str -> System.out.println(str));
    }
}
