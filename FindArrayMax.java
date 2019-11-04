import java.util.Scanner;

public class FindArrayMax {

    public static void main(String[] args) {

        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhap 2:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Khong nhap qua 20 phan tu");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhap phan tu " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;

        }
        System.out.println("Danh sach tai san:");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");

        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;

            }
        }
        System.out.println("Giá trị tài sản lớn nhất trong danh sách là: " + max + "tai vi tri" + index);


    }
}
