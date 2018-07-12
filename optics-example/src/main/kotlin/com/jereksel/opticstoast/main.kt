package com.jereksel.opticstoast

fun main(args: Array<String>) {

    val employee = Employee("John Smith", Company("Google", listOf(Address("Mountain View", Street(1600,"Amphitheatre Parkway")), Address("San Francisco", Street(1455,"Market Street")))))

    val optional = Employee.company.addresses[1].street.name

    val employee2 = optional.modify(employee, String::toUpperCase)

    println(employee)
    println(employee2)

}