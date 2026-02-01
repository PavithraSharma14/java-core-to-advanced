/*
 * Problem: Shortest Path
 *
 * Given a string of directions (N, S, E, W),
 * find the shortest distance from the origin.
 *
 * Example:
 * Input: "WNEENESENNN"
 * Output: Shortest distance
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class ShortestPath {

    public static float getShortestPath(String path) {

        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            }
        }

        // Using distance formula
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public static void main(String[] args) {

        String path = "WNEENESENNN";
        System.out.println("Shortest Distance: " + getShortestPath(path));
    }
}

