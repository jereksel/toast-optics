data class Street(val number: Int, val name: String)
|\pause|
val streetNameLens: Lens<Street, String>|\pause| = Lens(
    get = { it.name },|\pause|
    set = { name -> { street -> street.copy(name = name) } }
)
|\pause|
val street = Street(1600, "Amphitheatre Parkway")
// street = Street(number=1600, name=Amphitheatre Parkway)
|\pause|
val street2 = streetNameLens.modify(street, String::toUpperCase)
// street2 = Street(number=1600, name=AMPHITHEATRE PARKWAY)