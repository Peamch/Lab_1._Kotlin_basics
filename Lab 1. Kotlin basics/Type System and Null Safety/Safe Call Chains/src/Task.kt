class User(val name: String?)

fun getUserNameLength(user: User?): Int? {
    // TODO: Поверніть довжину імені, використовуючи user?.name?.length
    return if (user == null) null else user.name?.length
}