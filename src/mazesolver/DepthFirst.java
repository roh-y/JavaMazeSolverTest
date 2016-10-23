package mazesolver;

import java.util.List;

/**
 *
 * @author leo
 */
public class DepthFirst {
    
    // If path was found, this method will return true
    // and the path list will be filled
    // like this: { xn, yn, ..., x2, y2, x1, y1 }
    // so the order is inverted ...
    // x and y are the start searching position
    public static boolean searchPath(int[][] maze, int x, int y
            , List<Integer> path) {
        
        // finally, let's check if the target node was reached
        if (maze[y][x] == 9) {
            path.add(x);
            path.add(y);
            return true;
            // ok i think that's it :)
        }
        
        // when the current position (x and y) is
        // a not-visited node (0), then let's
        // mark it as visited (2)
        if (maze[y][x] == 0) {
            maze[y][x] = 2;
            
            // now, let's visit all neighbor nodes recursively.
            // If path was found, let's fill the path list
            // with current position
            int dx = -1;
            int dy = 0;
            if (searchPath(maze, x + dx, y + dy, path)) {
                path.add(x);
                path.add(y);
                return true;
            }

            dx = 1;
            dy = 0;
            if (searchPath(maze, x + dx, y + dy, path)) {
                path.add(x);
                path.add(y);
                return true;
            }

            dx = 0;
            dy = -1;
            if (searchPath(maze, x + dx, y + dy, path)) {
                path.add(x);
                path.add(y);
                return true;
            }

            dx = 0;
            dy = 1;
            if (searchPath(maze, x + dx, y + dy, path)) {
                path.add(x);
                path.add(y);
                return true;
            }
        }
        return false;
    }
    
}
