// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNWAAAAAAAAB0M3lPSNdqbbSKwLYZYKKAg?e=S9ZWhy
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
                queen[row][col] = 'Q'
                backTracking(nums, visited, list);
                 queen[row][col] = '.'
                visited[i] = false;
                list.remove(list.size()-1);
            }
        }
    }
}