/**
 * - Created by EhangZhang on 2019/5/26.
 * - Description:
 *      编写包含一个字符串域的类，使用实例初始化方式进行初始化
 * - Solution:
 */
public class Practice15 {
    private String str;

    {
        str = "abc";
    }

    public String getStr() {
        return str;
    }

    public static void main(String[] args) {
        Practice15 practice15 = new Practice15();
        System.out.println(practice15.getStr());
    }
}
