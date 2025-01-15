public class TwoDArrayExample {
    public static void main(String[] args) {
        // 2차원 배열 초기화
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // 2차원 배열 출력
        System.out.println("2차원 배열 출력:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // 줄바꿈
        }
    }
}
