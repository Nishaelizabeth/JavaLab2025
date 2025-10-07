class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {15, 25, 35, 45, 55};
        int key = 35;  // element to search
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) System.out.println("Element not found");
    }
}
