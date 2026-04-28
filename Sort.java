public class Sort {

    public void sort(int[] array) {
        int[] temp = new int[array.length];
        sort(array, temp, 0, array.length -1);
    }

    public void sort(int[] array, int[] temp, int low, int high) {
        int mid = (low + high) / 2;
        if (low >= high) return;

        sort(array, temp, low, mid);
        sort(array, temp, mid +1, high);

        merge(array, temp, low, mid, high);
    }

    public void merge(int[] array, int[] temp, int low, int mid, int high) {
        int i = low;
        int j = mid +1;
        int k = low;

        while (i <= mid && j <= high) {
            if (array[i] <= array[j]) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = array[i++];
        }

        while (j <= high) {
            temp[k++] = array[j++];
        }

        for (int m = low; m <= high; m++) {
            array[m] = temp[m];
        }
    }

}
