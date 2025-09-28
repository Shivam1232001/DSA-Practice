public class Container_With_Most_Water {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int res=0;
        while(l<r){
            int area=Math.min(height[l],height[r]) * (r-l);
            res=Math.max(res,area);
            if(height[l]<=height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Container_With_Most_Water obj=new Container_With_Most_Water();
        int height[]={1,8,6,2,5,4,8,3,7};
        int ans=obj.maxArea(height);
        System.out.println(ans);
    }
}
