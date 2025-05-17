class SameColorSquare3127 {
    public boolean canMakeSquare(char[][] grid) {
        return evaluate2x2Square(new char[] { grid[0][0], grid[0][1], grid[1][0], grid[1][1] }) ||
            evaluate2x2Square(new char[] { grid[0][1], grid[0][2], grid[1][1], grid[1][2] }) ||
            evaluate2x2Square(new char[] { grid[1][0], grid[1][1], grid[2][0], grid[2][1] }) ||
            evaluate2x2Square(new char[] { grid[1][1], grid[1][2], grid[2][1], grid[2][2] });
        
    }
    public boolean evaluate2x2Square(char[] arr) {
        int whiteCount = 0;
        for (char ch: arr) {
            if (ch == 'W') whiteCount++;
        }
        return (whiteCount >= 3 || whiteCount <= 1);
    }
}