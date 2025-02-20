// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNWCAAAAAAABcsdS1LfSEx34L_JmcV3Kdw?e=9TxXH1
// https://leetcode.com/problems/permutations/

class Permutations {
    List<List<Integer>> ans = new ArrayList<>();
    public void List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        backTracking(nums, visited, new ArrayList<>());

        return ans;
    }

    public  void backTracking(int[] nums, boolean[] visited, ArrayList<Integer> list) {
        if(list.size() == nums.length) {
            ArrayList<Integer> temp = new ArrayList<>(list);
            ans.add(temp);
            return;
        }
        
        for(int i=0; i<visited.length; i++)  {
            if(visited[i] == false) {
                visited[i] = true;
                list.add(nums[i]);
                backTracking(nums, visited, list);
                visited[i] = false;
                list.remove(list.size()-1);
            }
        }
    }
}