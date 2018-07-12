data class Street(val number: Int, val name: String)
data class Address(val city: String, val street: Street)
data class Company(val name: String, 
                   val addresses: List<Address>)
data class Employee(val name: String, val company: Company)
|\pause|
val employee = Employee("John Smith", Company("Google", listOf(Address("Mountain View", Street(1600, "Amphitheatre Parkway")), Address("San Francisco", Street(1455, "Market Street")))))

// employee = Employee(name=John Smith, company=Company(name=Google, addresses=[Address(city=Mountain View, street=Street(number=1600, name=Amphitheatre Parkway)), Address(city=San Francisco, street=Street(number=1455, name=Market Street))]))