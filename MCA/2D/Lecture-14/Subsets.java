public class Subsets {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        recursion(0, nums, list);

        return ans;
    }

    public void recursion(int idx, int[] nums, ArrayList<Integer> list) {
        //System.out.println(list);
        ArrayList<Integer> temp = new ArrayList<>(list);
        ans.add(temp);

        for(int i=idx; i < nums.length ; i++) {
            list.add(nums[i]);
            recursion(i+1, nums, list);
            list.remove(list.size() - 1);
        }
    }
} {
    
}
