
class arr {

    public static void main(String[] args) {

        int arr[][] = new int[3][4];

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.err.print(arr[i][j] + " ");
            }
            System.err.println(" ");
        }

    }
}
