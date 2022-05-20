fun main(args: Array<String>) {

    var continuePlaying = true
    val board = Board()
    board.printBlankBoard()

    while (continuePlaying) {
        with(board) {
            displayCurrentBoard()
            getUserMove()
            saveToBoard()
            changeCurrentPlayer()
        }

        var winner: Char = board.isGameDone()
        if (winner == 'X' || winner == 'O') {
            println("$winner wins!!!")
            continuePlaying = false
            board.displayCurrentBoard()
        }
    }
}

