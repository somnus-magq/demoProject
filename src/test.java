/**
 * @author magq
 * @version V1.0
 * @Title: test
 * @Package: PACKAGE_NAME
 * @Description: TODO
 * @date 2019/3/12 2:40 PM
 */
public class test {
    public static void main(String[] args) {
        System.out.println("hello world!");

        int[] a = {1, 2, 3, 4};
        int[] b = {2, 4};
        int[] c = {1, 3};
        int[] d = {2};

        int[][] input = {a, b, c, d};
        //控制行数
        for (int m = 0; m < input.length; m++) {
            //一行中有多少个元素（即多少列）
            for (int n = 0; n < input[m].length; n++) {
                System.out.print(input[m][n] + " ");
            }
            System.out.println();
        }
    }
}
