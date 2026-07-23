class Solution {
    public String addBinary(String a, String b) {
        var sb = new StringBuilder();
        int x= a.length()-1, y= b.length()-1;
        for(int i=0; x>=0 || y>=0 || i>0;x--,y--){
            i+=(x>=0? a.charAt(x)-'0': 0)+ (y>=0? b.charAt(y) - '0' : 0);
            sb.append(i % 2);
            i /= 2;
        }
        return sb.reverse().toString();
    }
}