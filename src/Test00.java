import java.util.Arrays;

public class Test00 {
    public static void main(String[] args) throws Exception {

        // int[] array = {1, 2, 3};
        // int[] array = {-1, -3};
        int[] array = {1, 3, 6, 4, 1, 2};
        // int[] array = {1};

        Test00 testApp = new Test00();
        int result = testApp.solution(array);
        System.out.println("result :");
        System.out.println(result);
    }

    //
    public int solution(int[] A) {

        int result = 0;

        Arrays.sort(A); //오름차순 정렬
        int searchValue = 1; //찾을 값 최소 1부터 시작

        for (int num : A) {
            if (num == searchValue) {
                searchValue++; // 현재 숫자가 존재하면 다음 숫자로 이동
            }
        }
        result = searchValue;

        return result;



        // int result = 0;
        // int maxValue = 0;
        // int twoMaxValue = 0;

        // //제일 큰값 구하기
        // for (int i = 0; i < A.length; i++) {
        //     if( maxValue < A[i] )
        //     {
        //         maxValue = A[i];
        //     }
        // }

        // //두번째 큰값 구하기
        // for (int i = 0; i < A.length; i++) {
        //     if( twoMaxValue < A[i] )
        //     {
        //         if( A[i] == maxValue )
        //         {
        //             continue;
        //         }
        //         twoMaxValue = A[i];
        //     }
        // }

        // // System.out.println("maxValue = " + maxValue);
        // // System.out.println("twoMaxValue = " + twoMaxValue);

        // int tempValue = maxValue - twoMaxValue;
        // if( tempValue == 1 )
        // {
        //     result = maxValue + 1;
        // }else if( tempValue == 0 )
        // {
        //     result = 1;
        // }else
        // {
        //     result = twoMaxValue + 1;
        // }

        // return result;
    }

    
}
