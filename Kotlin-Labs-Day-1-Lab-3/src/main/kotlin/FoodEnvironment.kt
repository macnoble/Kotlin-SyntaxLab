class FoodEnvironment(vararg args : Actor) :Environment(*args) {
    val scores : MutableMap<Actor,Int>
        get() {
            TODO()
        }

    override fun processAction(agent: Actor, act: Action) {
        is TypeName ->
    }

    override fun sense(agent: Actor) {
        TODO("Not yet implemented")
    }
}