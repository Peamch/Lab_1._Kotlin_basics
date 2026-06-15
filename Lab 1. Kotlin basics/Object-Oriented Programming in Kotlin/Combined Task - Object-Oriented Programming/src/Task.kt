// TODO: Оголосіть клас Worker(val name: String, val hourlyRate: Int)
// Додайте init { ... }
// Додайте var hoursWorked та val salary

class Worker(val name: String, val hourlyRate: Int) {
    init {
        if (hourlyRate <= 0) {
            throw IllegalArgumentException("hourlyRate must be > 0")
        }
    }

    var hoursWorked: Int = 0
        set(value) {
            if (value > 0) {
                field = value
            }
        }

    val salary: Int
        get() = hourlyRate * hoursWorked
}
