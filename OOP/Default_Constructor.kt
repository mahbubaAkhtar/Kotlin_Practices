class Library {
    var name: String = "Unknown Library"
    var books: Int = 0

    fun showInfo() {
        println("Library Name: $name, Total Books: $books")
    }
}
fun main() {
    // Default constructor auto call hobe
    val lib1 = Library()
    lib1.showInfo()
}