package com.jereksel.opticstoast

import arrow.optics.optics

@optics data class Street(val number: Int, val name: String) { companion object }
@optics data class Address(val city: String, val street: Street) { companion object }
@optics data class Company(val name: String, val addresses: List<Address>) { companion object }
@optics data class Employee(val name: String, val company: Company) { companion object }

