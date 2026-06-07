class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num, freq.getOrDefault(num,0)+1);  //for calculating freq of each element  
        }
        int maxFreq=0;
        for(int count:freq.values()){
            maxFreq=Math.max(maxFreq,count);// for calculating the maximum freqs among all the freqs
        }
        int sum=0;
        for(int count: freq.values()){// for calculaing the sum of the maxfreqs
            if(count==maxFreq){
                sum+=count;
            }
        }
        return sum;
    }
}