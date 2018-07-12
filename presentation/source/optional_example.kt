data class OptionString(val string: String?)
|\pause|
val optional: Optional<OptionString, String>|\pause| = Optional(
  getOrModify = { it.string?.right() ?: it.left() },|\pause|
  set = { string -> { option -> option.copy(string = string) } }
)
|\pause|
val fullOption = OptionString("abc")
// fullOption = OptionString(string=abc)
|\pause|
val fullOption2 = optional.modify(fullOption, String::toUpperCase)
// fullOption2 = OptionString(string=ABC)
|\pause|
val emptyOption = OptionString(null)
// emptyOption = OptionString(string=null)
|\pause|
val emptyOption2 = optional.modify(emptyOption, String::toUpperCase)
// emptyOption2 = OptionString(string=null)