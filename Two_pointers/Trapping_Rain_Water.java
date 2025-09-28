public class Trapping_Rain_Water {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int l = 0, r = height.length - 1;
        int leftMax = height[l], rightMax = height[r];
        int res = 0;
        while (l < r) {
            if (leftMax < rightMax) {
                l++;
                leftMax = Math.max(leftMax, height[l]);
                res += leftMax - height[l];
            } else {
                r--;
                rightMax = Math.max(rightMax, height[r]);
                res += rightMax - height[r];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Trapping_Rain_Water obj=new Trapping_Rain_Water();
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
       int res= obj.trap(height);
       System.out.println(res);
    }
}
