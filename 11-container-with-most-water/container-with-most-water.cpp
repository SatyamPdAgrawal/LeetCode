class Solution {
public:
        int maxArea(vector<int>& height) {
        
        int left =0, right = height.size()-1;

        int temp = 0;
        while(left<right){
            int hei = min(height[left],height[right]);
            int current = hei*(right-left);
            temp = max(current,temp);

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return temp;
     }
};