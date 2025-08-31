public class geeksTraining {
    public static int findMaxTotalMeritApproachFirst(int arr[][], int n) {
        int prev[] = { arr[0][0], arr[0][1], arr[0][2] };
        for (int i = 1; i < n; i++) {
            int curr[] = new int[3];
            curr[0] = arr[i][0] + Math.max(prev[1], prev[2]);
            curr[1] = arr[i][1] + Math.max(prev[0], prev[2]);
            curr[2] = arr[i][2] + Math.max(prev[0], prev[1]);

            prev = curr;
        }
        return Math.max(prev[0], Math.max(prev[1], prev[2]));
    }

    // Second Approach Remove Space Complexcity
    public static int findMaxTotalMeritApproachSecond(int arr[][], int n) {
        int prevRunning = arr[0][0];
        int prevFighting = arr[0][1];
        int prevLearning = arr[0][2];

        for (int i = 1; i < arr.length; i++) {
            int currRunning = arr[i][0] + Math.max(prevFighting, prevLearning);
            int currFighting = arr[i][1] + Math.max(prevRunning, prevLearning);
            int currLearning = arr[i][2] + Math.max(prevRunning, prevFighting);

            prevRunning = currRunning;
            prevFighting = currFighting;
            prevLearning = currLearning;
        }
        return Math.max(prevRunning, Math.max(prevFighting,prevLearning));
    }

    public static void main(String[] args) {
        // Questions
        // Geek is going for a training program for n days. He can perform any of these
        // activities: Running, Fighting, and Learning Practice. Each activity has some
        // point on each day. As Geek wants to improve all his skills, he can't do the
        // same activity on two consecutive days. Given a 2D array arr[][] of size n
        // where arr[i][0], arr[i][1], and arr[i][2] represent the merit points for
        // Running, Fighting, and Learning on the i-th day, determine the maximum total
        // merit points Geek can achieve .

        int arr[][] = { { 1, 2, 5 }, { 3, 1, 1 }, { 3, 3, 3 } }; // Output->11
        // int arr[][]= {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}}; //Output->6
        System.out.println(findMaxTotalMeritApproachFirst(arr, arr.length));
        System.out.println(findMaxTotalMeritApproachSecond(arr, arr.length));

    }
}
