public class BubbleSort {

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public String toString(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i];
            if (i < array.length - 1) {
                result += ",";
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] array = {12, 2, 8, 5, 1, 6, 4, 15};
        BubbleSort arraySort = new BubbleSort();
        System.out.println("Mảng chưa được sắp xếp: ");
        System.out.println(arraySort.toString(array));
        arraySort.bubbleSort(array);
        System.out.println("Mảng đã được áp dụng sắp xếp nổi bọt: ");
        System.out.println(arraySort.toString(array));
    }
}
