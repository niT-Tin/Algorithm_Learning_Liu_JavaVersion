package FirstStage.LinearSearchp;

import java.util.Arrays;

public class LinearSearch {

    // 私有构造函数，外界无法创建LinearSearch类的实例
    private LinearSearch(){}

    // Version1.0
    public static int SearchV1(int[] tars, int target) {
        for (int i = 0; i < tars.length; i++) {
            if (tars[i] == target)
                return i;
        }
        return -1;
    }

    // Version2.0 使用函数式没有正确的实现，当存在目标时返回目标的值不存在
    // 则返回 -1
    public static int SearchV2(int[] tars, int target) {
        if (Arrays.stream(tars).filter(tar -> tar == target).count() == 1)
            return target;
        return -1;
    }
}
