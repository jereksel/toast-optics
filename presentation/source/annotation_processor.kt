@optics 
data class Employee(val name: String, val company: Company) { companion object }
|\pause|
val Employee.Companion.name: Lens<Employee, String>
val <S> Lens<S, Employee>.name: Lens<S, String>
val <S> Optional<S, Employee>.name: Optional<S, String>

val Employee.Companion.company: Lens<Employee, Company>
val <S> Lens<S, Employee>.company: Lens<S, Company>
val <S> Optional<S, Employee>.company: Optional<S, Company>