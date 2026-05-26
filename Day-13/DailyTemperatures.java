class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] arr = new int[temp.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0 ; i < temp.length ; i++){
            while (!stack.isEmpty() && temp[i] > temp[stack.peek()]){
                int small = stack.pop();
                arr[small] = i - small ;
            }
            stack.push(i);
        }
        return arr ; 
    }
}
