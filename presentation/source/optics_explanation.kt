Employee.company.addresses[n].street.name.modify(employee, String::toUpperCase)

val Employee.Companion.company: Lens<Employee, Company>
val <S> Lens<S, Employee>.company: Lens<S, Company>
val <S, E> Lens<S, List<E>>.get(i: Int): Optional<S, E>