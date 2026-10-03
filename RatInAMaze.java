package pkg;

import java.util.ArrayList;

public class RatInAMaze {

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };
        ArrayList<String> ans = ratInMaze(maze);
        System.out.println(ans);
    }

    static ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        boolean[][] path = new boolean[maze.length][maze[0].length];
        ArrayList<String> ans = pathRet(maze, path, 0, 0, "");
        return ans;
    }

    // accepted
    // 1200 test cases passed

    static ArrayList<String> pathRet(int[][] maze, boolean[][] path, int r, int c, String p) {
        if (maze[r][c] == 0 || path[r][c]) {
            return new ArrayList<>();
        }
        if (r == maze.length - 1 && c == maze.length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> inner = new ArrayList<>();
        if (path[r][c] == true) {
            return new ArrayList<>();
        }
        path[r][c] = true;
        if (r < maze.length - 1 && maze[r + 1][c] != 0) {
            ArrayList<String> ans1 = pathRet(maze, path, r + 1, c, p + 'D');
            inner.addAll(ans1);
        }
        if (c > 0 && maze[r][c - 1] != 0) {
            ArrayList<String> ans4 = pathRet(maze, path, r, c - 1, p + 'L');
            inner.addAll(ans4);
        }
        if (c < maze.length - 1 && maze[r][c + 1] != 0) {
            ArrayList<String> ans2 = pathRet(maze, path, r, c + 1, p + 'R');
            inner.addAll(ans2);
        }
        if (r > 0 && maze[r - 1][c] != 0) {
            ArrayList<String> ans3 = pathRet(maze, path, r - 1, c, p + 'U');
            inner.addAll(ans3);
        }
        path[r][c] = false;
        return inner;
    }
}