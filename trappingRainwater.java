//onne of IMPORTANT questions asked in interveiws 
// draw a graph using given array 
// now calculate the total amont trapped in it 
// question might be jumbled with ACID TRAPPED or HOW MANY JUMPS REQUIRED TO RECH FROM A TO B
// there might be case when graph is in ascending or decending order ... make new condition so ALGO is more FAST and efficient

public class trappingRainwater {
    public static void main(String arg[]) {
        int array[] = { 4, 2, 0, 6, 3, 2, 5 };

        trappedRainWater(array);
    }

    public static void trappedRainWater(int array[]) {
        int n = array.length;
        int rightMax[] = new int[n];
        int leftMax[] = new int[n];

        leftMax[0] = array[0]; // O th index
        rightMax[rightMax.length - 1] = array[n - 1];// final index

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], array[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], array[i]);
        }

        // trapped water level
        int totalwater = 0;
        for (int i = 0; i < n - 1; i++) {
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            totalwater += waterlevel - array[i]; // MULTIPLY BY WIDTH IF GIVEN IN QUESTION or ARRAY GRAPH IS IRREGULAR IN SIZE
        }

        System.out.println(totalwater);

    }
}
