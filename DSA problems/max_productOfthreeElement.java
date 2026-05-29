class max_productOfthreeElement {
    public static int maxProduct(int[] arr) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : arr) {

            // Find 3 largest numbers
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            }
            else if (num > max2) {
                max3 = max2;
                max2 = num;
            }
            else if (num > max3) {
                max3 = num;
            }

            // Find 2 smallest numbers
            if (num < min1) {
                min2 = min1;
                min1 = num;
            }
            else if (num < min2) {
                min2 = num;
            }
        }

        int product1 = max1 * max2 * max3;
        int product2 = min1 * min2 * max1;

        return Math.max(product1, product2);
    }

    public static void main(String[] args) {

        int[] arr1 = {10, 3, 5, 6, 20};
        System.out.println(maxProduct(arr1));

        int[] arr2 = {-10, -3, -5, -6, -20};
        System.out.println(maxProduct(arr2));

        int[] arr3 = {1, -4, 3, -6, 7, 0};
        System.out.println(maxProduct(arr3));
    }
}
