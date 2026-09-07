class Solution {
    public static void main(String args[]) {
    	int[] nums=new int[]{22,4,5,5,1,6};
    int a=nums[0];
    for(int i=1;i<nums.length;i++){
        if(a<nums[i]){
            a=nums[i];
        }
    }
    System.out.println(a);   }
}
