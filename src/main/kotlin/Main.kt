fun main() {
    val str = readln()
    val words = if (str.isNotEmpty()) str.split(" ") else listOf()
    val correctWords: MutableList<String> = mutableListOf()
    for (word in words)
        if (word[0] == 'а' && word.length > 3)
            correctWords.add(word)
    if (correctWords.isEmpty())
        println("Слов на 'а' больше 3 символов не найдено")
    else {
        print("Слова на 'а' больше 3 символов: ")
        correctWords.forEach{print("$it ")}
        println()
    }
}