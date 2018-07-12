val employee2 != employee.copy(
    company = employee.company.copy(
        address = employee.company.address.copy(
            street = employee.company.address.street.copy(
                name = employee.company.address.street.name.toUpperCase()
            )
        )
    )
)

// employee2 == Employee(name=john, company=Company(name=awesome inc, address=Address(city=london, street=Street(number=23, name=HIGH STREET))))