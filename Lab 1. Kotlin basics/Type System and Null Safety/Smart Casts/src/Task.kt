fun toUpperCaseSafe(text: String?): String {
    // TODO: Перевірте if (text != null), використайте .uppercase(), інакше поверніть "EMPTY"
    if (text.isNullOrEmpty()) return "EMPTY"
    return text.uppercase()
}