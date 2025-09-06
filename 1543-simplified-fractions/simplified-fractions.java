class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> result=new ArrayList<>();
        HashSet<Float> seen=new HashSet<>();

        for(int i=2;i<=n;i++){
            for(int j=1;j<i;j++){
                float val=(float) j/i;
                if(!seen.contains(val)){
                    seen.add(val);
                    result.add(j+"/"+i);
                }
            }
        }
        return result;
    }
}