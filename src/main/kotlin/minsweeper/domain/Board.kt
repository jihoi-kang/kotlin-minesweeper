package minsweeper.domain

class Board(
    height: Int,
    width: Int,
    mineCount: Int,
) {

    val boardLines: BoardLines = BoardLinesGenerator.generate(height, width, mineCount)

}
