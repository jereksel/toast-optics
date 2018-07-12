employee.copy(
    company = employee.company?.copy(
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
|\pause|

Employee.company.addresses[n].street.name.modify(employee, String::toUpperCase)