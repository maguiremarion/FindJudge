
public class FindJudge {
	
	public static int findJudge(int N, int [][] trust) {
		
		int[] trusts = new int[N];
        int[] trusted = new int[N];
        for(int i = 0; i < trust.length; i++){
        	try {
	            int a = trust[i][0]; 
	            int b = trust[i][1];
	            trusts[a - 1]++;
	            trusted[b - 1]++;
        	}catch(Exception e){
        		return(-1);
        	}
        }
        for(int i = 0; i < N; i++){
            if(trusts[i] == 0 && trusted[i] == N - 1)
                return i + 1;
        }
        return -1;
    }
	
	
	public static void main(String [] args) {
		
		System.out.println("Example 1: N = 2, trust = [[1, 2]] ");
		int N = 2;
		int[][] trust = {{1,2}};
		System.out.println(findJudge(N, trust) + "\n");
		
		System.out.println("Example 2: N = 3, trust = [[1, 3], [2, 3]] ");
		int N2 = 3;
		int[][] trust2 = {{1, 3}, {2, 3}};
		System.out.println(findJudge(N2, trust2) + "\n");
		
		System.out.println("Example 3: N = 3, trust = [[1, 3], [2, 3], [3, 1]] ");
		int N3 = 3;
		int[][] trust3 = {{1, 3}, {2, 3}, {3, 1}};
		System.out.println(findJudge(N3, trust3) + "\n");
		
		System.out.println("Example 4: N = 3, trust = [[1, 2], [2, 3]] ");
		int N4 = 3;
		int[][] trust4 = {{1, 2}, {2, 3}};
		System.out.println(findJudge(N4, trust4) + "\n");
		
		System.out.println("Example 5: N = 4, trust = [[1, 3], [1, 4], [2, 3], [2, 4], [4, 3]] ");
		int N5 = 4;
		int[][] trust5 = {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
		System.out.println(findJudge(N5, trust5) + "\n");
	}
}
