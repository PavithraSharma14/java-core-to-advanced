/*
PROBLEM:
Move N disks from source to destination using helper.

APPROACH:
- Move n-1 disks to helper
- Move nth disk to destination
- Move n-1 from helper to destination
*/

public class TowerOfHanoi {

    public static void solve(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + src + " to " + dest);
            return;
        }

        solve(n - 1, src, dest, helper);

        System.out.println("Move disk " + n + " from " + src + " to " + dest);

        solve(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        solve(3, "A", "B", "C");
    }
}