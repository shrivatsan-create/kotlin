fun main() {
    var isNameVisible = false
    println("--- App Started ---")
    println("Button available: [Show]")

    // Simulate clicking the button
    println("\n[User clicks the 'Show' button]")
    isNameVisible = true

    // App updates the UI
    if (isNameVisible) {
        println("App displays: Shrivatsan")
    }
}