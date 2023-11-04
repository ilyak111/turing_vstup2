fun main() {
    val str = readln() //Считываем строку
    val words = if (str.isNotEmpty()) str.split(" ") else listOf() //Разбиваем строку на слова разделённые пробелами и заносим их в список
    val correctWords: MutableList<String> = mutableListOf() //Создаём пустой список удовлетворяющих условиям слов
    for (word in words) //Проходимся по всем словам из списка слов
        if (word.length > 3 && word[0] == 'а') //Если удовлетворяет условиям
            correctWords.add(word) //Добавить слово в список удовлетворяющих условиям слов
    if (correctWords.isEmpty()) //Если список удовлетворяющих условиям слов пуст
        println("Слов на 'а' больше 3 символов не найдено") //То выводим сообщение об этом
    else {
        print("Слова на 'а' больше 3 символов: ") //Если нет
        correctWords.forEach{print("$it ")} //То выводим все эти слова, удовлетворяющие условиям
        println()
    }
}