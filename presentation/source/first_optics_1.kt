address.copy(
    street = address.street.copy(
        name = address.street.name.toUpperCase()
    )
)
|\pause|

Address.street.name.modify(address, String::toUpperCase)