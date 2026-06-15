// TODO: Оголосіть fun List<Int>.sumOdd(): Int
fun List<Int>.sumOdd(): Int {
    var sum = 0
    for (number in this) {
        if (number % 2 != 0) {
            sum += number
        }
    }
    return sum
}