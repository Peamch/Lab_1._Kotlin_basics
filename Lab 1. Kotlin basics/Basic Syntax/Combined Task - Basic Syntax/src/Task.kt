fun calculateDiscount(): String {
    // TODO: Оголосіть item, price. Зменште price та поверніть відформатований рядок.
    val item = "Laptop"
    val price = 1000
    val discount = 150
    val discountedPrice = price - discount
    return "Price of $item is $discountedPrice"
}