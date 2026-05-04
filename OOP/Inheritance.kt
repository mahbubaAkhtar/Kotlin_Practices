// 👴 Base Class: GrandParentHouse
// 'open' use kora holo jate ei class ke inherit kora jaye
open class GrandParentHouse() {
    var rooms = 1                  // default value: 1 room
    var materal = "mud"            // default value: mud material

    // 'open' function jate child class ei function ke override korte pare
    open fun describe() {
        println("This is a $materal house and they have $rooms rooms.")
    }
}

// 👨 Parent Class: ParentHouse
// ParentHouse inherits from GrandParentHouse
open class ParentHouse : GrandParentHouse() {
    init {
        rooms = 3                  // init block use kore property update kora holo
        materal = "Concreate"      // init block diye material change kora holo
    }

    // 'override' use kora holo jate parent er describe function ke nijer moto change kora jaye
    override fun describe() {
        super.describe()   // 👉 ekhane GrandParent er describe() call hobe
        println("This is a $materal house and they have $rooms rooms.")
    }
}

// 👶 Child Class: ChildHouse
// ChildHouse inherits from ParentHouse
class ChildHouse(val types: String) : ParentHouse() {

    var type = types               // extra property add kora holo (Mud, Wood etc.)

    init {
        rooms = 3               // init block diye child house er rooms set kora holo = 5
    }
    // 'override' use kora holo jate parent er describe ke modify kora jaye
    override fun describe() {
        super.describe()           // 'super' use kora holo jate parent er  describe() call hobe  (tar moddhe GrandParent already ache)
        println("This is a $type house and they have $rooms.")
    }
}
// 🟣 Main Function
fun main() {
    // GrandParentHouse object create korle dadu’r bari describe hobe
    // val grandParentHouse = GrandParentHouse()
    // grandParentHouse.describe()

    // ParentHouse object create korle baba’r bari describe hobe
    // val parentHouse = ParentHouse()
    // parentHouse.describe()

    // ChildHouse object create kora holo
    val childHouse = ChildHouse("Mud")
    childHouse.describe()          // child er describe call hobe (super + child line)
}