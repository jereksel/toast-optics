class Lens<S, A> {

    companion object {
    
        operator fun <S, A> invoke(
            get: (S) -> A, 
            set: (A) -> (S) -> S
        ) : Lens<S, A>
    
    }

    fun modify(a: S, f: (A) -> A): S

}