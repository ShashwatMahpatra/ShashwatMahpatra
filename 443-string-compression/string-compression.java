class Solution {
    public int compress(char[] chars) {
        List<Character> temp=new ArrayList<>();
        for(char c: chars) temp.add(c);
        temp.add('~');
        int n=temp.size();
        int i=0;
        int count=1;
        for(int j=1;j<n;j++){
            if(temp.get(j)==temp.get(j-1)){
                count++;
            }
            else{
                chars[i++]=temp.get(j-1);
                if(count>=2){
                    String len=Integer.toString(count);
                    for(char c:len.toCharArray()){
                        chars[i++] = c;
                    }
                }
                count=1;
            }
        }
        return i;

    }
}