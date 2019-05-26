/**
 * - Created by EhangZhang on 2019/5/26.
 * - Description:
 *      Switch与enum结合
 * - Solution:
 */
public class Practice22 {

    public static void describeMoney(Money money) {
        switch (money) {
            case ONE:
                System.out.println("One yuan.");
                break;
            case TWO:
                System.out.println("Two yuan.");
                break;
            case FIVE:
                System.out.println("Five yuan.");
                break;
            case TEN:
                System.out.println("Ten yuan.");
                break;
            case TWENTY:
                System.out.println("Twenty yuan.");
                break;
            case FIFTY:
                System.out.println("Fifty yuan.");
                break;
        }

    }

    public static void main(String[] args) {
        Money m1 = Money.ONE;
        Money m2 = Money.FIFTY;
        Money m3 = Money.TEN;

        Practice22.describeMoney(m1);
        Practice22.describeMoney(m2);
        Practice22.describeMoney(m3);
    }
}

