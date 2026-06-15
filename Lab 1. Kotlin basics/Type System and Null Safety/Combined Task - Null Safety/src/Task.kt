fun generateGreeting(name: String?): String {
    // TODO: Обробіть null та порожній рядок. Значення за замовчуванням - "Guest".
    // Поверніть рядок формату "Welcome, Name!"
    val safeName = name?.takeIf { it.isNotBlank() } ?: "Guest"
    return "Welcome, $safeName!"
}