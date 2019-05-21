package practice;

/**
 * - Created by EhangZhang on 2019/5/21.
 * - Description:
 * - Solution:
 */
public class Practice3 {

    public static void main(String[] args) {
        ATypeName aTypeName = new ATypeName();
        System.out.println(aTypeName.aInteger);
        System.out.println(aTypeName.aCharacter);
        System.out.println(aTypeName.aBoolean);

    }
}

class ATypeName {
    int aInteger;
    char aCharacter;
    boolean aBoolean;
}
