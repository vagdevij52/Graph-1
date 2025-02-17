public class FindJudge {
    public int findJudge(int n, int[][] trusts) {
        int[] indegree = new int[n];
        for(int[] trust:trusts){
            indegree[trust[0]-1]--;
            indegree[trust[1]-1]++;
        }
        for(int i=0;i<n;i++){
            if(indegree[i]==n-1) return i+1;
        }
        return -1;
    }
}

// Time Complexity - O(V+E)
// Space Complexity - O(V)
