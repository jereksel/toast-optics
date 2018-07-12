data class Street(val number: Int, val name: String)
data class Address(val city: String, val street: Street)
data class Company(val name: String, val address: Address)
data class Employee(val name: String, val company: Company)

val employee = Employee("john", Company("awesome inc", Address("london", Street(23, "high street"))))

// employee = Employee(name=john, company=Company(name=awesome inc, address=Address(city=london, street=Street(number=23, name=high street))))