class Board {
    private var boardMoves: MutableList<Char> = mutableListOf(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ')
    var currentPlayer: Char = 'X'
    var currentMove: String = 'a'.toString()

    fun printBlankBoard() {
        println("Welcome to Tic Tac Toe!")
        println("Enter in a number from 1 to 9.")
        println(" 1 | 2 | 3 ")
        println("---+---+---")
        println(" 4 | 5 | 6 ")
        println("---+---+---")
        println(" 7 | 8 | 9 \n")
        println("The current board is:")
    }

    fun displayCurrentBoard() {
        println(" ${boardMoves.elementAt(0)} | ${boardMoves.elementAt(1)} | ${boardMoves.elementAt(2)}")
        println("---+---+---")
        println(" ${boardMoves.elementAt(3)} | ${boardMoves.elementAt(4)} | ${boardMoves.elementAt(5)}")
        println("---+---+---")
        println(" ${boardMoves.elementAt(6)} | ${boardMoves.elementAt(7)} | ${boardMoves.elementAt(8)}")
    }

    fun getUserMove() {
        print("$currentPlayer> ")
        currentMove = readln()
        val isValidMove = isValidMove()
        if (currentMove.toDoubleOrNull() == null || !isValidMove) {
            println("Please enter a valid integer.")
            getUserMove()
        }
    }

    private fun isValidMove(): Boolean {
        if (boardMoves.elementAt(currentMove.toInt() - 1) != ' ') return false
        return true
    }

    fun changeCurrentPlayer() {
        currentPlayer = (if (currentPlayer == 'X') 'O' else 'X')
    }

    fun saveToBoard() {
        boardMoves[currentMove.toInt() - 1] = currentPlayer
    }

    fun isGameDone(): Char {
//        Check the bottom row
        if (boardMoves.elementAt(6) == boardMoves.elementAt(7) && boardMoves.elementAt(7) == boardMoves.elementAt(8) && boardMoves.elementAt(
                6
            ) != ' '
        ) {
            return if (boardMoves.elementAt(6) == 'X') {
                'X'
            } else {
                'O'
            }
        }
//        Check middle row
        else if (boardMoves.elementAt(3) == boardMoves.elementAt(4) && boardMoves.elementAt(4) == boardMoves.elementAt(5) && boardMoves.elementAt(
                3
            ) != ' '
        ) {
            return if (boardMoves.elementAt(3) == 'X') {
                'X'
            } else {
                'O'
            }
        }

//         Check top row
        else if (boardMoves.elementAt(0) == boardMoves.elementAt(1) && boardMoves.elementAt(1) == boardMoves.elementAt(2) && boardMoves.elementAt(
                0
            ) != ' '
        ) {
            return if (boardMoves.elementAt(0) == 'X') {
                'X'
            } else {
                'O'
            }
        }
//        Check down left side
        else if (boardMoves.elementAt(0) == boardMoves.elementAt(3) && boardMoves.elementAt(3) == boardMoves.elementAt(6) && boardMoves.elementAt(
                0
            ) != ' '
        ) {
            return if (boardMoves.elementAt(0) == 'X') {
                'X'
            } else {
                'O'
            }
        }

//        Check down middle
        else if (boardMoves.elementAt(1) == boardMoves.elementAt(4) && boardMoves.elementAt(4) == boardMoves.elementAt(7) && boardMoves.elementAt(
                1
            ) != ' '
        ) {
            return if (boardMoves.elementAt(1) == 'X') {
                'X'
            } else {
                'O'
            }
        }

//        Check down left
        else if (boardMoves.elementAt(2) == boardMoves.elementAt(5) && boardMoves.elementAt(5) == boardMoves.elementAt(8) && boardMoves.elementAt(
                2
            ) != ' '
        ) {
            return if (boardMoves.elementAt(2) == 'X') {
                'X'
            } else {
                'O'
            }
        }

//        Check diagonal up
        else if (boardMoves.elementAt(6) == boardMoves.elementAt(4) && boardMoves.elementAt(4) == boardMoves.elementAt(2) && boardMoves.elementAt(
                2
            ) != ' '
        ) {
            return if (boardMoves.elementAt(2) == 'X') {
                'X'
            } else {
                'O'
            }
        }
//        Check diagonal down
        else if (boardMoves.elementAt(0) == boardMoves.elementAt(4) && boardMoves.elementAt(4) == boardMoves.elementAt(8) && boardMoves.elementAt(
                0
            ) != ' '
        ) {
            return if (boardMoves.elementAt(0) == 'X') {
                'X'
            } else {
                'O'
            }
        }

        return 'N'
    }

//    End of class
}