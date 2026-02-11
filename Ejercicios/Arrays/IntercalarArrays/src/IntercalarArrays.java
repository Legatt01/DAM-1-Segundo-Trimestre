import java.util.Arrays;

public class IntercalarArrays {
    public static void main(String[] args) throws Exception {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 6, 7, 8, 9, 10 };
        int[] array3 = new int[array1.length + array2.length];
        int posicionArray3 = 0;
        for (int i = 0; i < array1.length; i++) {
            array3[posicionArray3] = array1[i];
            posicionArray3++;
            array3[posicionArray3] = array2[i];
            posicionArray3++;
        }
        System.out.println(Arrays.toString(array3));
    }
}
