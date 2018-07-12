package com.jereksel.opticstoast

import arrow.core.left
import arrow.core.right
import arrow.optics.Lens
import arrow.optics.Optional

operator fun <A, B> Lens<A, List<B>>.get(i: Int): Optional<A, B> = this + (listElementPositionOptional(i))
operator fun <A, B> Optional<A, List<B>>.get(i: Int): Optional<A, B> = this.compose(listElementPositionOptional(i))

fun <A> listElementPositionOptional(position: Int): Optional<List<A>, A> = Optional(
        getOrModify = { l -> l.getOrNull(position)?.right() ?: l.left() },
        set = { e -> { l -> l.mapIndexed { index: Int, value: A -> if (index == position) e else value } } }
)