class Optional<S, A> {

    companion object {
        
        operator fun <S, A> invoke(
            getOrModify: (S) -> Either<S, A>,
            set: (A) -> (S) -> S
        ): Optional<S, A>
    }

    fun modify(a: S, f: (A) -> A): S

}