package pkg;

import java.util.ArrayList;

public class RatInAMaze {

    public static void main(String[] args) {
        int maze[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
        ArrayList<String> ans = ratInMaze(maze);
        System.out.println(ans);
    }

    static ArrayList<String> ratInMaze(int[][] maze) {
        // code here        
        ArrayList<String> ans = path(maze, 0, 0, "");
        return ans;
    }

    static ArrayList<String> path(int [][]maze,int r , int c,String p){
        if (r==maze.length && c==maze.length){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> inner = new ArrayList<>();
        if (r<maze.length && maze[r+1][c]!=0){
            ArrayList<String> ans = path(maze, r+1, c, p+"D");
            inner.addAll(ans);
        }
        if (c<maze.length && maze[r][c+1]!=0){
            ArrayList<String> ans2 = path(maze, r, c+1, p+'R');
            inner.addAll(ans2);
        }
        return inner;
    }
}