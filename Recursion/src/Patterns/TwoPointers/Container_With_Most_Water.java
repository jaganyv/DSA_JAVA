package Patterns.TwoPointers;

public class Container_With_Most_Water {
    public static void main(String[] args) {
        Container_With_Most_Water cw = new Container_With_Most_Water();
        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.println(cw.maxArea(height));
    }
        public int maxArea ( int[] height){
            int left = 0;
            int right = height.length - 1;
            int maxArea = 0;
            while (left < right) {
                int h = Math.min(height[left], height[right]);
                int w = right - left;
                maxArea = Math.max(maxArea, h * w);
                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }
            return maxArea;
        }
    }