fun processNames(names: List<String>): String {
    var result = ""
    // TODO: Використайте names.forEach { result += "$it, " }
    return names.forEach { result += "$it, " }.let { result }
}