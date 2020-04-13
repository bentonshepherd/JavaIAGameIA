public class Computer extends Player {

    public Computer(String token) {
        super("Robot", token);
    }

    public int determineMove(Board b, String token) {

        int move = -1;

        int hWin = horizontal3(b,this.token);
        int vWin = vertical3(b,this.token);
        int space3Win = space3(b, this.token);
        int space2Win = space2(b, this.token);
        int startWin = startingSpace(b, this.token);
        int dWinRightTop = diagonal3RightTop(b, this.token);
        int dWinRight3 = diagonal3Right3(b, this.token);
        int dWinRight2 = diagonal3Right2(b, this.token);
        int dWinRightBottom = diagonal3RightBottom(b, this.token);
        int dWinLeftTop = diagonal3leftTop(b, this.token);
        int dWinLeft3 = diagonal3Left3(b, this.token);
        int dWinLeft2 = diagonal3Left2(b, this.token);
        int dWinLeftBottom = diagonal3LeftBottom(b, this.token);

        int hLose = horizontal3(b,token);
        int vLose = vertical3(b,token);
        int space3Lose = space3(b,token);
        int space2Lose = space2(b, token);
        int startLose = startingSpace(b, token);
        int dLoseRightTop = diagonal3RightTop(b, token);
        int dLoseRight3 = diagonal3Right3(b, token);
        int dLoseRight2 = diagonal3Right2(b, token);
        int dLoseRightBottom = diagonal3RightBottom(b, token);
        int dLoseLeftTop = diagonal3leftTop(b, token);
        int dLoseLeft3 = diagonal3Left3(b, token);
        int dLoseLeft2 = diagonal3Left2(b, token);
        int dLoseLeftBottom = diagonal3LeftBottom(b, token);

        int blockTrap = trap(b,token);
        int blockTrapMiddle = trapMiddle(b, token);
        int dBlockTrapMiddleRight = dTrapMiddleRight(b, token);
        int dBlockTrapBehindRight = dTrapRight(b, token);
        int dBlockTrapFrontRight = dTrapFrontRight(b, token);
        int dBlockTrapMiddleLeft = dTrapMiddleLeft(b, token);
        int dBlockTrapBehindLeft = dTrapLeft(b, token);
        int dBlockTrapFrontLeft = dTrapFrontLeft(b, token);

        int setTrapMiddle = trapMiddle(b, this.token);
        int setTrapBehind = trap(b, this.token);
        int setTrapFront = trapFront(b, this.token);
        int dSetTrapMiddleRight = dTrapMiddleRight(b, this.token);
        int dSetTrapBehindRight = dTrapRight(b, this.token);
        int dSetTrapFrontRight = dTrapFrontRight(b, this.token);
        int dSetTrapMiddleLeft = dTrapMiddleLeft(b, this.token);
        int dSetTrapBehindLeft = dTrapLeft(b, this.token);
        int dSetTrapFrontLeft = dTrapFrontLeft(b, this.token);

        int vConnect3 = vConnect3(b, this.token);
        int dConnect3RightTop = dConnect3RightTop(b, this.token);
        int dConnect3RightMiddle = dConnect3RightMiddle(b, this.token);
        int dConnect3RightBottom = dConnect3RightBottom(b, this.token);
        int dConnect3LeftTop = dConnect3LeftTop(b, this.token);
        int dConnect3LeftMiddle = dConnect3LeftMiddle(b, this.token);
        int dConnect3LeftBottom = dConnect3LeftBottom(b, this.token);
        int hConnect3Front = hConnect3Front(b, this.token);
        int hConnect3Behind = hConnect3Behind(b, this.token);
        int hConnect3Middle = hConnect3Middle(b, this.token);

        int hConnect2 = hConnect2(b, this.token);
        int vConnect2 = vConnect2(b, this.token);
        int dConnect2TopRight = dConnect2TopRight(b, this.token);
        int dConnect2BottomRight = dConnect2BottomRight(b, this.token);
        int dConnect2TopLeft = dConnect2TopLeft(b, this.token);
        int dConnect2BottomLeft = dConnect2BottomLeft(b, this.token);

        if(vConnect2 > -1) { move = vConnect2; }
        if(dConnect2TopRight > -1) { move = dConnect2TopRight;}
        if(dConnect2BottomRight > -1) { move = dConnect2BottomRight; }
        if(dConnect2TopLeft > -1) { move = dConnect2TopLeft; }
        if(dConnect2BottomLeft > -1) { move = dConnect2BottomLeft; }
        if(hConnect2 > -1) { move = hConnect2; }

        if(vConnect3 > -1) { move = vConnect3; }
        if(dConnect3RightTop > -1) { move = dConnect3RightTop; }
        if(dConnect3RightMiddle > -1) { move = dConnect3RightMiddle; }
        if(dConnect3RightBottom > -1) { move = dConnect3RightBottom; }
        if(dConnect3LeftTop > -1) { move = dConnect3LeftTop; }
        if(dConnect3LeftMiddle > -1) { move = dConnect3LeftMiddle; }
        if(dConnect3LeftBottom > -1) { move = dConnect3LeftBottom; }
        if(hConnect3Front > -1) { move = hConnect3Front; }
        if(hConnect3Behind > -1) { move = hConnect3Behind; }
        if(hConnect3Middle > -1) { move = hConnect3Middle; }

        if(dBlockTrapMiddleRight > -1) { move = dBlockTrapMiddleRight; }
        if(dBlockTrapBehindRight > -1) { move = dBlockTrapBehindRight; }
        if(dBlockTrapFrontRight > -1) { move = dBlockTrapFrontRight; }
        if(dBlockTrapMiddleLeft > -1) { move = dBlockTrapMiddleLeft; }
        if(dBlockTrapBehindLeft > -1) { move = dBlockTrapBehindLeft; }
        if(dBlockTrapFrontLeft > -1) { move = dBlockTrapFrontLeft; }
        if(blockTrap > -1) { move = blockTrap; }
        if(blockTrapMiddle > -1) { move = blockTrapMiddle; }

        if(dSetTrapMiddleRight > -1) { move = dSetTrapMiddleRight; }
        if(dSetTrapBehindRight > -1) { move = dSetTrapBehindRight; }
        if(dSetTrapFrontRight > -1) { move = dSetTrapFrontRight; }
        if(dSetTrapMiddleLeft > -1) { move = dSetTrapMiddleLeft; }
        if(dSetTrapBehindLeft > -1) { move = dSetTrapBehindLeft; }
        if(dSetTrapFrontLeft > -1) { move = dSetTrapFrontLeft; }
        if(setTrapMiddle > -1) { move = setTrapMiddle; }
        if(setTrapBehind > -1) { move =setTrapBehind; }
        if(setTrapFront > -1) { move = setTrapFront; }

        if(hLose > -1){ move = hLose; }
        if(vLose > -1){ move = vLose; }
        if(space3Lose > -1) { move = space3Lose; }
        if(space2Lose > -1) { move = space2Lose; }
        if(startLose > -1) { move = startLose; }
        if(dLoseRightTop > -1) { move = dLoseRightTop; }
        if(dLoseRight3 > -1) { move = dLoseRight3; }
        if(dLoseRight2 > -1) { move = dLoseRight2; }
        if(dLoseRightBottom > -1) { move = dLoseRightBottom; }
        if(dLoseLeftTop > -1) { move = dLoseLeftTop; }
        if(dLoseLeft3 > -1) { move = dLoseLeft3; }
        if(dLoseLeft2 > -1) { move = dLoseLeft2; }
        if(dLoseLeftBottom > -1) { move = dLoseLeftBottom; }

        if(hWin > -1){ move = hWin; }
        if(vWin > -1){ move = vWin; }
        if(space3Win > -1) { move = space3Win; }
        if(space2Win > -1) { move = space2Win; }
        if(startWin > -1) { move = startWin; }
        if(dWinRightTop > -1) { move = dWinRightTop; }
        if(dWinRight3 > -1) { move = dWinRight3; }
        if(dWinRight2 > -1) { move = dWinRight2; }
        if(dWinRightBottom > -1) { move = dWinRightBottom; }
        if(dWinLeftTop > -1) { move = dWinLeftTop; }
        if(dWinLeft3 > -1) { move = dWinLeft3; }
        if(dWinLeft2 > -1) { move = dWinLeft2; }
        if(dWinLeftBottom > -1) { move = dWinLeftBottom; }

        if(move == -1) {
            move = (int)(Math.random() * 8);
        }

        return move;
    }

    public int horizontal3(Board b, String token) {
        for(int row = 0; row < 8; row++) {
            for(int col = 0; col < 5; col++){
                if(b.grid[row][col].equals(token) &&
                        b.grid[row][col+1].equals(token) &&
                        b.grid[row][col+2].equals(token) &&
                        b.grid[row][col+3].equals("-") &&
                        platform(b, row, col+3)) {
                    return col+3;
                }
            }
        }
        return -1;
    }

    public int vertical3(Board b, String token) {
        for(int col = 0; col < 8; col++){
            for(int row = 7; row > 2; row--) {
                if(b.grid[row][col].equals(token) &&
                        b.grid[row-1][col].equals(token) &&
                        b.grid[row-2][col].equals(token) &&
                        b.grid[row-3][col].equals("-")) {
                    return col;
                }
            }
        }
        return -1;
    }

    public int space3(Board b, String token) {
        for(int row = 0; row < 8; row++) {
            for(int col = 0; col < 5; col++){
                if(b.grid[row][col].equals(token) &&
                        b.grid[row][col+1].equals(token) &&
                        b.grid[row][col+2].equals("-") &&
                        b.grid[row][col+3].equals(token) &&
                        platform(b, row, col+2)) {
                    return col+2;
                }
            }
        }
        return -1;
    }

    public int space2(Board b, String token) {
        for(int row = 0; row < 8; row++) {
            for(int col = 0; col < 5; col++){
                if(b.grid[row][col].equals(token) &&
                        b.grid[row][col+1].equals("-") &&
                        b.grid[row][col+2].equals(token) &&
                        b.grid[row][col+3].equals(token) &&
                        platform(b, row, col+1)) {
                    return col+1;
                }
            }
        }
        return -1;
    }

    public int startingSpace(Board b, String token) {
        for(int row = 0; row < 8; row++) {
            for(int col = 0; col < 5; col++){
                if(b.grid[row][col].equals("-") &&
                        b.grid[row][col+1].equals(token) &&
                        b.grid[row][col+2].equals(token) &&
                        b.grid[row][col+3].equals(token) &&
                        platform(b, row, col)) {
                    return col;
                }
            }
        }
        return -1;
    }

    public int diagonal3RightTop (Board b, String token) {
        for(int row = 7;row > 2;row--){
            for(int col = 0;col < 5;col++){
                if(b.grid[row][col].equals(token) &&
                        b.grid[row-1][col+1].equals(token) &&
                        b.grid[row-2][col+2].equals(token) &&
                        b.grid[row-3][col+3].equals("-") &&
                        platform(b, row-3, col+3)){
                    return col+3;
                }
            }
        }
        return -1;
    }

    public int diagonal3Right3 (Board b, String token) {
        for(int row = 7;row > 2;row--){
            for(int col = 0;col < 5;col++){
                if(b.grid[row][col].equals(token) &&
                        b.grid[row-1][col+1].equals(token) &&
                        b.grid[row-2][col+2].equals("-") &&
                        b.grid[row-3][col+3].equals(token) &&
                        platform(b, row-2, col+2)){
                    return col+2;
                }
            }
        }
        return -1;
    }

    public int diagonal3Right2 (Board b, String token) {
        for(int row = 7;row > 2;row--){
            for(int col = 0;col < 5;col++){
                if(b.grid[row][col].equals(token) &&
                        b.grid[row-1][col+1].equals("-") &&
                        b.grid[row-2][col+2].equals(token) &&
                        b.grid[row-3][col+3].equals(token) &&
                        platform(b, row-1, col+1)){
                    return col+1;
                }
            }
        }
        return -1;
    }

    public int diagonal3RightBottom (Board b, String token) {
        for(int row = 7;row > 2;row--){
            for(int col = 0;col < 5;col++){
                if(b.grid[row][col].equals("-") &&
                        b.grid[row-1][col+1].equals(token) &&
                        b.grid[row-2][col+2].equals(token) &&
                        b.grid[row-3][col+3].equals(token) &&
                        platform(b, row, col)){
                    return col;
                }
            }
        }
        return -1;
    }

    public int diagonal3leftTop (Board b, String token) {
        for(int row = 7;row > 2;row--){
            for(int col = 3;col < 8;col++){
                if(b.grid[row][col].equals(token) &&
                        b.grid[row-1][col-1].equals(token) &&
                        b.grid[row-2][col-2].equals(token) &&
                        b.grid[row-3][col-3].equals("-") &&
                        platform(b, row-3, col-3)){
                    return col-3;
                }
            }
        }
        return -1;
    }

    public int diagonal3Left3 (Board b, String token) {
        for(int row = 7;row > 2;row--){
            for(int col = 3;col < 8;col++){
                if(b.grid[row][col].equals(token) &&
                        b.grid[row-1][col-1].equals(token) &&
                        b.grid[row-2][col-2].equals("-") &&
                        b.grid[row-3][col-3].equals(token) &&
                        platform(b, row-2, col-2)){
                    return col-2;
                }
            }
        }
        return -1;
    }

    public int diagonal3Left2 (Board b, String token) {
        for(int row = 7;row > 2;row--){
            for(int col = 3;col < 8;col++){
                if(b.grid[row][col].equals(token) &&
                        b.grid[row-1][col-1].equals("-") &&
                        b.grid[row-2][col-2].equals(token) &&
                        b.grid[row-3][col-3].equals(token) &&
                        platform(b, row-1, col-1)){
                    return col-1;
                }
            }
        }
        return -1;
    }

    public int diagonal3LeftBottom (Board b, String token) {
        for(int row = 7;row > 2;row--){
            for(int col = 3;col < 8;col++){
                if(b.grid[row][col].equals("-") &&
                        b.grid[row-1][col-1].equals(token) &&
                        b.grid[row-2][col-2].equals(token) &&
                        b.grid[row-3][col-3].equals(token) &&
                        platform(b, row, col)){
                    return col;
                }
            }
        }
        return -1;
    }

    //Returns false if the space under the prospective space is not filled with a token
    public boolean platform (Board b, int row, int col) {
        if(row == 7) {
            return true;
        }
        return !b.grid[row + 1][col].equals("-");
    }

    public int vConnect3(Board b, String token) {
        for(int col = 0; col < 8; col++){
            for(int row = 7; row > 3; row--) {
                if(b.grid[row][col].equals(token) &&
                        b.grid[row-1][col].equals(token) &&
                        b.grid[row-2][col].equals("-") &&
                        hNoSetUp(b, row-2, col) &&
                        dNoSetUp(b, row-2, col)) {
                    return col;
                }
            }
        }
        return -1;
    }

    public int hConnect3Front(Board b, String token) {
        for(int row = 0; row < 8; row++) {
            for(int col = 0; col < 5; col++){
                if(b.grid[row][col].equals(token) &&
                        b.grid[row][col+1].equals(token) &&
                        b.grid[row][col+2].equals("-") &&
                        platform(b, row, col+2) &&
                        hPossible(b, row, col) &&
                        hNoSetUp(b, row, col+2) &&
                        dNoSetUp(b, row, col+2)) {
                    return col+2;
                }
            }
        }
        return -1;
    }

    public int hConnect3Behind(Board b, String token) {
        for(int row = 0; row < 8; row++) {
            for(int col = 0; col < 5; col++){
                if(b.grid[row][col].equals("-") &&
                        b.grid[row][col+1].equals(token) &&
                        b.grid[row][col+2].equals(token) &&
                        platform(b, row, col) &&
                        hPossible(b, row, col) &&
                        hNoSetUp(b, row, col) &&
                        dNoSetUp(b, row, col)) {
                    return col;
                }
            }
        }
        return -1;
    }

    public int hConnect3Middle(Board b, String token) {
        for(int row = 0; row < 8; row++) {
            for(int col = 0; col < 5; col++){
                if(b.grid[row][col].equals(token) &&
                        b.grid[row][col+1].equals("-") &&
                        b.grid[row][col+2].equals(token) &&
                        platform(b, row, col+1) &&
                        hPossible(b, row, col) &&
                        hNoSetUp(b, row, col+1) &&
                        dNoSetUp(b, row, col+1)) {
                    return col+1;
                }
            }
        }
        return -1;
    }

    //checks if a horizontal win is possible based on the prospective space
    //reduces the likelihood of a pointless connect three
    public boolean hPossible(Board b, int row, int col) {
        if (col == 0 && b.grid[row][col+3].equals("-")) {
            return true;
        }
        if (col == 0 && !b.grid[row][col+3].equals("-")) {
            return false;
        }
        return b.grid[row][col + 3].equals("-") || b.grid[row][col - 1].equals("-");
    }

    public int dConnect3RightTop(Board b, String token) {
        for(int row = 7;row > 2;row--){
            for(int col = 0;col < 5;col++){
                if(b.grid[row][col].equals(token) &&
                        b.grid[row-1][col+1].equals(token) &&
                        b.grid[row-2][col+2].equals("-") &&
                        platform(b, row-2, col+2) &&
                        dPossibleRight(b, row, col) &&
                        dNoSetUp(b, row-2, col+2) &&
                        hNoSetUp(b, row-2, col+2)){
                    return col+3;
                }
            }
        }
        return -1;
    }

    public int dConnect3RightMiddle(Board b, String token) {
        for(int row = 7;row > 2;row--){
            for(int col = 0;col < 5;col++){
                if(b.grid[row][col].equals(token) &&
                        b.grid[row-1][col+1].equals("-") &&
                        b.grid[row-2][col+2].equals(token) &&
                        platform(b, row-1, col+1) &&
                        dPossibleRight(b, row, col) &&
                        dNoSetUp(b, row-1, col+1) &&
                        hNoSetUp(b, row-1, col+1)){
                    return col+2;
                }
            }
        }
        return -1;
    }

    public int dConnect3RightBottom (Board b, String token) {
        for(int row = 7;row > 2;row--){
            for(int col = 0;col < 5;col++){
                if(b.grid[row][col].equals("-") &&
                        b.grid[row-1][col+1].equals(token) &&
                        b.grid[row-2][col+2].equals(token) &&
                        platform(b, row, col) &&
                        dPossibleRight(b, row, col) &&
                        dNoSetUp(b, row, col) &&
                        hNoSetUp(b, row, col)){
                    return col;
                }
            }
        }
        return -1;
    }

    public int dConnect3LeftTop (Board b, String token) {
        for(int row = 7;row > 2;row--){
            for(int col = 3;col < 8;col++){
                if(b.grid[row][col].equals(token) &&
                        b.grid[row-1][col-1].equals(token) &&
                        b.grid[row-2][col-2].equals("-") &&
                        platform(b, row-2, col-2) &&
                        dPossibleLeft(b, row, col) &&
                        dNoSetUp(b, row-2, col-2) &&
                        hNoSetUp(b, row-2, col-2)){
                    return col-3;
                }
            }
        }
        return -1;
    }

    public int dConnect3LeftMiddle (Board b, String token) {
        for(int row = 7;row > 2;row--){
            for(int col = 3;col < 8;col++){
                if(b.grid[row][col].equals(token) &&
                        b.grid[row-1][col-1].equals("-") &&
                        b.grid[row-2][col-2].equals(token) &&
                        platform(b, row-1, col-1) &&
                        dPossibleLeft(b, row, col) &&
                        dNoSetUp(b, row-1, col-1) &&
                        hNoSetUp(b, row-1, col-1)){
                    return col-2;
                }
            }
        }
        return -1;
    }

    public int dConnect3LeftBottom (Board b, String token) {
        for(int row = 7;row > 2;row--){
            for(int col = 3;col < 8;col++){
                if(b.grid[row][col].equals("-") &&
                        b.grid[row-1][col-1].equals(token) &&
                        b.grid[row-2][col-2].equals(token) &&
                        platform(b, row, col) &&
                        dPossibleLeft(b, row, col) &&
                        dNoSetUp(b, row, col) &&
                        hNoSetUp(b, row, col)){
                    return col;
                }
            }
        }
        return -1;
    }

    //checks if a right diagonal win is likely to be possible based on the prospective space
    //reduces the likelihood of a pointless connect three
    public boolean dPossibleRight(Board b, int row, int col) {
        if(col == 0) {
            return b.grid[row-3][col+3].equals("-") || b.grid[row-3][col+3].equals(this.token);
        }
        if(col > 4) {
            return false;
        }
        if(row < 3) {
            return false;
        }
        return b.grid[row - 3][col + 3].equals("-") || b.grid[row-3][col+3].equals(this.token);
    }

    //checks if a left diagonal win is likely to be possible based on the prospective space
    //reduces the likelihood of a pointless connect three
    public boolean dPossibleLeft(Board b, int row, int col) {
        if(row < 3) {
            return false;
        }
        if(col < 3) {
            return false;
        }
        if(row == 7 && col == 7 && !b.grid[row-3][col-3].equals("-") && !b.grid[row-3][col-3].equals(this.token)) {
            return false;
        }
        if(row == 7 && !b.grid[row-3][col-3].equals("-") && !b.grid[row-3][col-3].equals(this.token)) {
            return false;
        }
        if(col == 7 && !b.grid[row-3][col-3].equals("-") && !b.grid[row-3][col-3].equals(this.token)) {
            return false;
        }
        return b.grid[row-3][col-3].equals("-") || b.grid[row-3][col+3].equals(this.token);
    }

    public int hConnect2(Board b, String token) {
        for(int row = 0; row < 8; row++) {
            for(int col = 0; col < 5; col++){
                if(b.grid[row][col].equals(token) &&
                        b.grid[row][col+1].equals("-") &&
                        platform(b, row, col+1) &&
                        hNoSetUp(b, row, col+1) &&
                        dNoSetUp(b, row, col+1)) {
                    return col+1;
                }
            }
        }
        return -1;
    }

    public int vConnect2(Board b, String token) {
        for(int col = 0; col < 8; col++){
            for(int row = 7; row > 2; row--) {
                if(b.grid[row][col].equals(token) &&
                        b.grid[row-1][col].equals("-") &&
                        hNoSetUp(b, row-1, col) &&
                        dNoSetUp(b, row-1, col)) {
                    return col;
                }
            }
        }
        return -1;
    }

    public int dConnect2TopRight(Board b, String token) {
        for(int row = 7;row > 2;row--){
            for(int col = 0;col < 5;col++){
                if(b.grid[row][col].equals(token) &&
                        b.grid[row-1][col+1].equals("-") &&
                        platform(b, row-1, col+1) &&
                        dNoSetUp(b, row-1, col+1)){
                    return col+3;
                }
            }
        }
        return -1;
    }

    public int dConnect2BottomRight(Board b, String token) {
        for(int row = 7;row > 2;row--){
            for(int col = 0;col < 5;col++){
                if(b.grid[row][col].equals("-") &&
                        b.grid[row-1][col+1].equals(token) &&
                        platform(b, row, col) &&
                        dNoSetUp(b, row, col) &&
                        hNoSetUp(b, row, col)){
                    return col;
                }
            }
        }
        return -1;
    }

    public int dConnect2TopLeft(Board b, String token) {
        for(int row = 7;row > 2;row--){
            for(int col = 3;col < 8;col++){
                if(b.grid[row][col].equals(token) &&
                        b.grid[row-1][col-1].equals("-") &&
                        platform(b, row-1, col-1) &&
                        dNoSetUp(b, row-1, col-1) &&
                        hNoSetUp(b, row-1, col-1)){
                    return col-3;
                }
            }
        }
        return -1;
    }

    public int dConnect2BottomLeft(Board b, String token) {
        for(int row = 7;row > 2;row--){
            for(int col = 3;col < 8;col++){
                if(b.grid[row][col].equals("-") &&
                        b.grid[row-1][col-1].equals(token) &&
                        platform(b, row, col) &&
                        dNoSetUp(b, row, col) &&
                        hNoSetUp(b, row, col)){
                    return col;
                }
            }
        }
        return -1;
    }

    //returns true if the space on top of the prospective space, which would be enabled by the move,
    // will not set the opponent up for a horizontal win
    public boolean hNoSetUp (Board b, int row, int col) {
        if(row == 0) {
            return true;
        }
        if(col == 0 && (b.grid[row-1][col+1].equals("-") || b.grid[row-1][col+1].equals(this.token))) {
            return true;
        }
        if(col == 0 && (!b.grid[row-1][col+1].equals("-") || !b.grid[row-1][col+1].equals(this.token))) {
            return false;
        }
        if(col == 7 && (b.grid[row-1][col-1].equals("-") || b.grid[row-1][col-1].equals(this.token))) {
            return true;
        }
        if(col == 7 && !(b.grid[row-1][col-1].equals("-") || b.grid[row-1][col-1].equals(this.token))) {
            return false;
        }
        if(b.grid[row-1][col-1].equals("-") && b.grid[row-1][col+1].equals("-")) {
            return true;
        }
        return b.grid[row - 1][col - 1].equals(this.token) && b.grid[row - 1][col + 1].equals(this.token);
    }

    //returns true if the space on top of the prospective space, which would be enabled by the move,
    // will not set the opponent up for a diagonal win
    public boolean dNoSetUp (Board b, int row, int col) {
        if(row == 0) {
            return true;
        }
        if(row == 1 && col == 0 && (b.grid[row][col+1].equals("-") || b.grid[row][col+1].equals(this.token))) {
            return true;
        }
        if(row == 1 && col == 7 && (b.grid[row][col+1].equals("-") || b.grid[row][col+1].equals(this.token))) {
            return true;
        }
        if(col == 0 && row == 7) {
            return b.grid[row - 2][col + 1].equals("-") || b.grid[row - 2][col + 1].equals(this.token);
        }
        if(col == 7 && row == 7) {
            return b.grid[row - 2][col - 1].equals("-") || b.grid[row - 2][col - 1].equals(this.token);
        }
        if(col == 0 && row > 1) {
            return b.grid[row][col + 1].equals("-") || b.grid[row][col + 1].equals(this.token) &&
                    (b.grid[row - 2][col + 1].equals("-") || b.grid[row - 2][col + 1].equals(this.token));
        }
        if(row == 7 && (b.grid[row-2][col+1].equals("-") || b.grid[row-2][col+1].equals(this.token))) {
            return true;
        }
        if(row == 7 && (b.grid[row-2][col-1].equals("-") || b.grid[row-2][col-1].equals(this.token))) {
            return true;
        }
        if(col == 7 && (b.grid[row][col-1].equals("-") || b.grid[row][col-1].equals(this.token))) {
            return true;
        }
        if(col == 7 && (b.grid[row-2][col-1].equals("-") || b.grid[row-2][col-1].equals("-"))) {
            return true;
        }
        if(col == 7 && !(b.grid[row][col-1].equals("-") || b.grid[row][col-1].equals(this.token))) {
            return false;
        }
        if(col == 7 && !(b.grid[row-2][col-1].equals("-") || b.grid[row-2][col-1].equals("-"))) {
            return false;
        }
        if((b.grid[row][col-1].equals("-") && b.grid[row][col+1].equals("-")) ||
                (b.grid[row][col-1].equals(this.token) && b.grid[row][col+1].equals(this.token))) {
            return true;
        }
        if(b.grid[row][col-1].equals(this.token) && b.grid[row][col+1].equals("-")) {
            return true;
        }
        if(b.grid[row][col-1].equals("-") && b.grid[row][col+1].equals(this.token)) {
            return true;
        }
        if((b.grid[row-2][col-1].equals("-") && b.grid[row-2][col+1].equals("-")) ||
                (b.grid[row-2][col-1].equals(this.token) && b.grid[row-2][col+1].equals(this.token))) {
            return true;
        }
        if(b.grid[row-2][col-1].equals(this.token) || b.grid[row-2][col+1].equals("-")) {
            return true;
        }
        return b.grid[row - 2][col - 1].equals("-") || b.grid[row - 2][col + 1].equals(this.token);
    }

    public int trap(Board b, String token) {
        for(int row = 0; row < 8; row++) {
            for(int col = 1; col < 5; col++){
                if(b.grid[row][col].equals("-") &&
                        b.grid[row][col+1].equals(token) &&
                        b.grid[row][col+2].equals(token) &&
                        b.grid[row][col+3].equals("-") &&
                        platform(b, row, col) &&
                        hNoSetUp(b, row, col) &&
                        dNoSetUp(b, row, col)) {
                    return col;
                }
            }
        }
        return -1;
    }

    public int trapMiddle(Board b, String token) {
        for(int row = 0; row < 8; row++) {
            for(int col = 1; col < 5; col++){
                if(b.grid[row][col-1].equals("-") &&
                        b.grid[row][col].equals(token) &&
                        b.grid[row][col+1].equals("-") &&
                        b.grid[row][col+2].equals(token) &&
                        b.grid[row][col+3].equals("-") &&
                        platform(b, row, col+1) &&
                        hNoSetUp(b, row, col+1) &&
                        dNoSetUp(b, row, col+1)) {
                    return col+1;
                }
            }
        }
        return -1;
    }

    public int trapFront(Board b, String token) {
        for(int row = 0; row < 8; row++) {
            for(int col = 1; col < 5; col++){
                if(b.grid[row][col].equals("-") &&
                        b.grid[row][col+1].equals(token) &&
                        b.grid[row][col+2].equals(token) &&
                        b.grid[row][col+3].equals("-") &&
                        platform(b, row, col+3) &&
                        hNoSetUp(b, row, col+3) &&
                        dNoSetUp(b, row, col+3)) {
                    return col+3;
                }
            }
        }
        return -1;
    }

    //All the methods that include the word "trap" check if there is a spot that could make a
    //double-sided connect three.
    public int dTrapMiddleRight(Board b, String token) {
        for(int row = 6;row > 2;row--){
            for(int col = 1;col < 5;col++){
                if(b.grid[row+1][col-1].equals("-") &&
                        b.grid[row][col].equals(token) &&
                        b.grid[row-1][col+1].equals("-") &&
                        b.grid[row-2][col+2].equals(token) &&
                        b.grid[row-3][col+3].equals("-") &&
                        dNoSetUp(b, row-1, col+1) &&
                        hNoSetUp(b, row-1, col+1)){
                    return col+1;
                }
            }
        }
        return -1;
    }

    public int dTrapRight(Board b, String token) {
        for(int row = 6;row > 2;row--){
            for(int col = 1;col < 5;col++){
                if(b.grid[row+1][col-1].equals("-") &&
                        b.grid[row][col].equals("-") &&
                        b.grid[row-1][col+1].equals(token) &&
                        b.grid[row-2][col+2].equals(token) &&
                        b.grid[row-3][col+3].equals("-") &&
                        dNoSetUp(b, row, col) &&
                        hNoSetUp(b, row, col)){
                    return col;
                }
            }
        }
        return -1;
    }

    public int dTrapFrontRight(Board b, String token) {
        for(int row = 6;row > 2;row--){
            for(int col = 1;col < 5;col++){
                if(b.grid[row+1][col-1].equals("-") &&
                        b.grid[row][col].equals(token) &&
                        b.grid[row-1][col+1].equals(token) &&
                        b.grid[row-2][col+2].equals("-") &&
                        b.grid[row-3][col+3].equals("-") &&
                        dNoSetUp(b, row-2, col+2) &&
                        hNoSetUp(b, row-2, col+2)){
                    return col+2;
                }
            }
        }
        return -1;
    }

    public int dTrapMiddleLeft(Board b, String token) {
        for(int row = 6;row > 2;row--){
            for(int col = 3;col < 7;col++){
                if(b.grid[row+1][col+1].equals("-") &&
                        b.grid[row][col].equals(token) &&
                        b.grid[row-1][col-1].equals("-") &&
                        b.grid[row-2][col-2].equals(token) &&
                        b.grid[row-3][col-3].equals("-") &&
                        dNoSetUp(b, row-1, col-1) &&
                        hNoSetUp(b, row-1, col-1)){
                    return col-1;
                }
            }
        }
        return -1;
    }

    public int dTrapLeft(Board b, String token) {
        for(int row = 6;row > 2;row--){
            for(int col = 3;col < 7;col++){
                if(b.grid[row+1][col+1].equals("-") &&
                        b.grid[row][col].equals("-") &&
                        b.grid[row-1][col-1].equals(token) &&
                        b.grid[row-2][col-2].equals(token) &&
                        b.grid[row-3][col-3].equals("-") &&
                        dNoSetUp(b, row, col) &&
                        hNoSetUp(b, row, col)){
                    return col;
                }
            }
        }
        return -1;
    }

    public int dTrapFrontLeft(Board b, String token) {
        for(int row = 6;row > 2;row--){
            for(int col = 3;col < 7;col++){
                if(b.grid[row+1][col+1].equals("-") &&
                        b.grid[row][col].equals(token) &&
                        b.grid[row-1][col-1].equals(token) &&
                        b.grid[row-2][col-2].equals("-") &&
                        b.grid[row-3][col-3].equals("-") &&
                        dNoSetUp(b, row-2, col-2) &&
                        hNoSetUp(b, row-2, col-2)){
                    return col-2;
                }
            }
        }
        return -1;
    }
}