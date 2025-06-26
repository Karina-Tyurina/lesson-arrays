import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 ");
        int[] first = new int[]{1, 2, 3};
        float[] two = {1.57f, 7.654f, 9.986f};
        int[] free = new int[12];
        System.out.println();

        System.out.println("Задача 2");
        for (int i = 0; i < first.length; i = i + 1) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(first[i]);
        }
        System.out.println();
        System.out.println("Задача 3");
        int[] box = {3, 2, 1};
        double[] klop = {9.986, 7.654, 1.57};
        int[] boll = {20, 12, 3};

        for (int i = 0; i < box.length; i = i + 1) {
            System.out.print(box[i]);
            if (i < box.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < klop.length; i = i + 1) {
            System.out.print(klop[i]);
            if (i < klop.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < boll.length; i = i + 1) {
            System.out.print(boll[i]);
            if (i < boll.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 4");
        int[] boxe = {1, 2, 3};
        for (int iq = 0; iq < boxe.length; iq = iq + 1) {
            if (boxe[iq] % 2 == 0) {
                boxe[iq] += 1;
            }
        }
        System.out.println(Arrays.toString(boxe));
    }
}
