fun main() {
    println("Welcome to the club entry system")
    print("Enter your age: ")
    var age = readLine()?.toIntOrNull() ?: 0

    // Check age using while loop
    while (age <= 18) {
        println("Access denied. You must be older")
        print("Enter your age: ")
        age = readLine()?.toIntOrNull() ?: 0
    }

    println("Access granted.")
    print("Do you have a VIP pass (yes/no): ")
    var hasVIPPass = readLine()?.equals("yes", ignoreCase = true) ?: false

    while (!hasVIPPass) {
        print("Are you a member? (yes/no): ")
        var isMember = readLine()?.equals("yes", ignoreCase = true) ?: false

        if (isMember) {
            print("Please enter your membership number: ")
            val memberNumber = readLine()
            println("Membership confirmed with Member Number: $memberNumber")
            break
        } else {
            println("You are not a member")
            print("Do you have a VIP pass (yes/no): ")
            hasVIPPass = readLine()?.equals("yes", ignoreCase = true) ?: false
        }
    }

    if (hasVIPPass) {
        println("Welcome VIP! Enjoy complimentary free drinks!")
    }

    println("Age: $age")
}
