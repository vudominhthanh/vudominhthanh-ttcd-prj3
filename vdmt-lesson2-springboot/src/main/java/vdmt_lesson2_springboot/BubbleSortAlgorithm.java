package vdmt_lesson2_springboot;

import  java.util.Arrays;

public class BubbleSortAlgorithm {
    public void sort(int[] arr) {
        System.out.println("Sắp xếp theo giải thuật BubbleSort:");
        int n = arr.length;
        boolean swapped;

        // Lặp qua toàn bộ mảng
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // So sánh từng cặp phần tử liền kề
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Hoán đổi nếu phần tử trước lớn hơn phần tử sau
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // Nếu không có hoán đổi nào xảy ra, mảng đã được sắp xếp
            if (!swapped) break;
        }

        System.out.println("Kết quả: " + Arrays.toString(arr));
    }

    // Hàm main để test nhanh
    public static void main(String[] args) {
        int[] numbers = {5, 1, 4, 2, 8};
        BubbleSortAlgorithm bubbleSort = new BubbleSortAlgorithm();
        bubbleSort.sort(numbers);
    }
}
