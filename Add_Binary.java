class Solution {
    public int[] constructRectangle(int area) {
        int width=(int)Math.sqrt(area);
        while(width>0){
            if(area%width==0){
            int length=area/width;
            return new int[]{length,width};
            }
            width--;
        }
        return new int[]{area,1};
    }
}
