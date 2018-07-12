data class Street(val number: Int, val name: String)
data class Address(val city: String, val street: Street)
|\pause|
val address = Address("Google", Street(1600, "Amphitheatre Parkway"))

// address = Address(city=Google, street=Street(number=1600, name=Amphitheatre Parkway))
|\pause|
val address2 = address.copy(
        street = address.street.copy(
                name = address.street.name.toUpperCase()
        )
)

// address2 = Address(city=Google, street=Street(number=1600, name=AMPHITHEATRE PARKWAY))