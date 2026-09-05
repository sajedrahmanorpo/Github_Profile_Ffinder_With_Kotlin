import java.net.HttpURLConnection
import java.net.URL

fun main() {
    print("Enter GitHub Username: ")
    val username = readlnOrNull()?.trim()

    if (username.isNullOrEmpty()) {
        println("Username cannot be empty!")
        return
    }

    try {
        val url = URL("https://api.github.com/users/$username")
        val connection = url.openConnection() as HttpURLConnection
        connection.requestMethod = "GET"
        connection.setRequestProperty("Accept", "application/json")
        connection.setRequestProperty("User-Agent", "Kotlin-App")

        if (connection.responseCode == 200) {
            val responseText = connection.inputStream.bufferedReader().readText()

            // JSON data extract using basic string functions
            val name = getValue(responseText, "name")
            val bio = getValue(responseText, "bio")
            val repos = getValue(responseText, "public_repos")
            val followers = getValue(responseText, "followers")
            val following = getValue(responseText, "following")
            val profileUrl = getValue(responseText, "html_url")

            println("\n====== GITHUB PROFILE ======")
            println("Name: $name")
            println("Bio: $bio")
            println("Public Repos: $repos")
            println("Followers: $followers")
            println("Following: $following")
            println("Profile Link: $profileUrl")
            println("=============================")
        } else if (connection.responseCode == 404) {
            println("User '$username' not found!")
        } else {
            println("Error Code: ${connection.responseCode}")
        }
    } catch (e: Exception) {
        println("An error occurred: ${e.localizedMessage}")
    }
}

// Simple Helper function to parse values without external libraries
fun getValue(json: String, key: String): String {
    val searchKey = "\"$key\":"
    val startIndex = json.indexOf(searchKey)
    if (startIndex == -1) return "N/A"

    val valueStart = startIndex + searchKey.length
    val sub = json.substring(valueStart).trim()

    return if (sub.startsWith("\"")) {
        val end = sub.indexOf("\"", 1)
        if (end != -1) sub.substring(1, end) else "N/A"
    } else {
        val end = sub.indexOfAny(charArrayOf(',', '}'))
        if (end != -1) sub.substring(0, end).trim() else "N/A"
    }
}