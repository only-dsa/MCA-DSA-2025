// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNWAAAAAAAAB0M3lPSNdqbbSKwLYZYKKAg?e=S9ZWhy

class Subsets {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        backTracking(0, nums, list);

        return ans;
    }

    public void backTracking(int idx, int[] nums, ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<>(list);
        ans.add(temp);
        for(int i = idx; i < nums.length; i++) {
            list.add(nums[i]);
            backTracking(i+1, nums, list);
            list.remove(list.size()-1);
        }
    }
}