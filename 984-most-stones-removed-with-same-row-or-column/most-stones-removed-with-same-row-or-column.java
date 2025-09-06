class Solution{
    private int  count=0;
    public int removeStones(int[][] stones) {
        int [] representatives=new int[20003];
        for(int [] stone:stones){
            mergeComponents(stone[0]+1,stone[1]+10002,representatives);
        }
        return stones.length - count;
        
    }
    private int repre(int element,int[] representatives){
        if(representatives[element]==0){
            representatives[element]=element;
            count++;
        }
        return representatives[element]==element ? element:(representatives[element]=repre(representatives[element],representatives));
    }
    private void mergeComponents(int elementA, int elementB, int[] representatives) {
        int repA = repre(elementA, representatives);
        int repB = repre(elementB, representatives);
        if (repA != repB) {
            representatives[repB] = repA;
            count--;
        }
    }
}