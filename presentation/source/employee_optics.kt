val optic = Employee.company.address.street.name

// optic = Lens<Employee, String>

val employee2 = optic.modify(employee, String::toUpperCase)

// employee2 = Employee(name=john, company=Company(name=awesome inc, address=Address(city=london, street=Street(number=23, name=HIGH STREET))))