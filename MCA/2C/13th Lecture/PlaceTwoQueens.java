// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNWAAAAAAAAB0M3lPSNdqbbSKwLYZYKKAg?e=S9ZWhy

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