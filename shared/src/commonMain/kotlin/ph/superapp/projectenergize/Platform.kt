package ph.superapp.projectenergize

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform