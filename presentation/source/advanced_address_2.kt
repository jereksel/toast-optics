val n = 1
val employee2 = employee.copy(
        company = employee.company.copy(
            addresses = employee.company.addresses.mapIndexed { index, address ->
                if (index != n) address
                else address.copy(
                    street = address.street.copy(
                        name = address.street.name.toUpperCase()
                    )
                )
            }
        )
    )

// employee2 = Employee(name=John Smith, company=Company(name=Google, addresses=[Address(city=Mountain View, street=Street(number=1600, name=Amphitheatre Parkway)), Address(city=San Francisco, street=Street(number=1455, name=MARKET STREET))]))