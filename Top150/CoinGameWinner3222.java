class CoinGameWinner3222 {
    public String winningPlayer(int x, int y) {
        boolean isAliceWinning = false;
        while (x >= 1 && y >= 4) {
            isAliceWinning = !isAliceWinning;
            x--; y = y - 4;
        }
        return isAliceWinning ? "Alice" : "Bob";
    }
}