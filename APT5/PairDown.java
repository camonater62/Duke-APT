package APT5;

import java.util.Arrays;

public class PairDown {

    public int[] fold(int[] list) {
        if(list.length % 2 == 1) {
            list = Arrays.copyOf(list, list.length + 1);
        }

        int[] res = new int[list.length / 2];
        for(int i = 0; i < list.length / 2; i++) {
            res[i] = list[i * 2] + list[i * 2 + 1];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] list = { 1, 2, 3 };
        System.out.println(Arrays.toString(new PairDown().fold(list)));
    }

}
