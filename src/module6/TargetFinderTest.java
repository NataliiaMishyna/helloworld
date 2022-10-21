package module6;

import java.util.Arrays;

class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}

class TargetFinder{
    public int[] findTarget(int[] aiCoords, int[][] targets){
        int x1 = aiCoords[0];
        int y1 = aiCoords[1];
        int x2;
        int y2;
        int[] res = new int[2];
        int[] minLigth = new int[targets.length];


        for (int i = 0; i < targets.length; i++){
            x2 = targets[i][0];
            y2 = targets[i][1];
            minLigth[i] = (int) Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2));
        }
        int min = minLigth[0];
        int pos = 0;
        for(int j = 0; j < minLigth.length; j++){
            if (min > minLigth[j]){
                min = minLigth[j];
                pos = j;
            }
        }
        res[0] = targets[pos][0];
        res[1] = targets[pos][1];

        return res;
    }
}


