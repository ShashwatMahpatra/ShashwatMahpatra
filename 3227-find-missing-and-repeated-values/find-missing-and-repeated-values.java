class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        HashSet<Integer> set=new HashSet<>();
        int repeat=-1;
        int miss=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int num=grid[i][j];
                if(set.contains(num)){
                    repeat=num;
                }
                else{
                    set.add(num);
                }
            }
        }
        for(int a=1;a<=n*n;a++){
            if(!set.contains(a)){
                miss=a;
                break;
            }
        }
        return new int[]{repeat,miss};

        
    }
}