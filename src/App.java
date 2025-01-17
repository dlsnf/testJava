public class App {
    public static void main(String[] args) throws Exception {


        // System.out.println("Hello, World!");

        int[] array = {1, 2, 3};

        App app = new App();
        int result = app.solution(array);
        // System.out.println(result);
    }

    //
    public int solution(int[] A) {

        for (int i = 0; i < A.length; i++) {
            System.out.println("A[" + i + "] = " + A[i]);
        }
        return 1;
    }

    
}
