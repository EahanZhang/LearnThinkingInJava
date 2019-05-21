package practice;

/**
 * - Created by EhangZhang on 2019/5/22.
 * - Description:
 *      将AllTheColorsOfTheRainbow改写成可运行的程序
 * - Solution:
 */
public class Practice11 {

    public static void main(String[] args) {
        AllTheColorsOfTheRainbow allTheColorsOfTheRainbow = new AllTheColorsOfTheRainbow(1);
        System.out.println(allTheColorsOfTheRainbow.getAnIntegerRepresentingColors());
        allTheColorsOfTheRainbow.changeTheHueOfTheColor(2);
        System.out.println(allTheColorsOfTheRainbow.getAnIntegerRepresentingColors());
    }

}

class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;

    public AllTheColorsOfTheRainbow(int initColor) {
        this.anIntegerRepresentingColors = initColor;
    }

    void changeTheHueOfTheColor(int newHue) {
        this.anIntegerRepresentingColors = newHue;
    }

    public int getAnIntegerRepresentingColors() {
        return anIntegerRepresentingColors;
    }
}
