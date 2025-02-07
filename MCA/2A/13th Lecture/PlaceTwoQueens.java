class PlaceTwoQueens {
    public static void main(String[] args) {
        int queen = 2;
        boolean[] visited = new boolean[4];
        backTracking(queen, visited);
    }
    
    public static void backTracking(int queen, boolean[] visited) {
        if(queen == 0) {
            System.out.println("We will get unique answer");
            for(int i=0;i<visited.length;i++) {
                System.out.print(visited[i] +"  ");
            }
            return;
        }
        
        for(int i=0;i<visited.length;i++) {
            if(visited[i] == false) {
                visited[i] = true;
                backTracking(queen - 1, visited);
                visited[i] = false;
            }
        }
    }
}