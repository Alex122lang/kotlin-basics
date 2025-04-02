fun main() {
    println("Welcome to the club entry system")
    print("Enter your age: ")
    val age = readln().toIntOrNull() ?: 0

    when {
        age <= 18 -> println("Access denied. You must be older.")
        else -> {
            println("Access granted.")
            print("Do you have a VIP pass (yes/no): ")
            val hasVIPPass = readln().equals("yes", ignoreCase = true)

            when {
                hasVIPPass -> println("Welcome VIP! Enjoy complimentary free drinks!")
                else -> {
                    print("Are you a member? (yes/no): ")
                    val isMember = readln().equals("yes", ignoreCase = true)

                    when {
                        isMember -> {
                            print("Please enter your membership number: ")
                            val memberNumber = readln()
                            println("Membership confirmed with Member Number: $memberNumber")
                        }
                        else -> println("You are not a member.")
                    }
                }
            }
        }
    }

    println("Age: $age")
}
