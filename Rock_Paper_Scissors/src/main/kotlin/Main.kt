fun main() {
    //val choice = listOf("Камень","Ножницы","Бумага")

    while (true){
        println("Выберите предмет: К-камень, Н-ножницы, Б-бумага")
        val choisen = readln()
        if(choisen == "К" || choisen == "Н" || choisen == "Б" )
        {
            val computer = listOf("Камень", "Ножницы", "Бумага").random()

            if(choisen == "К")
            {
                println("Вы выбрали Камень")
                println("Компьютер выбрал " + computer)
            }
            if(choisen == "Н")
            {
                println("Вы выбрали Ножницы")
                println("Компьютер выбрал " + computer)
            }
            if(choisen == "Б")
            {
                println("Вы выбрали Бумага")
                println("Компьютер выбрал " + computer)
            }

            if (choisen == "К" && computer == "Камень" || choisen == "Н" && computer == "Ножницы" || choisen == "Б" && computer == "Бумага")
            {
                println("Ничья")
            }
            if (choisen == "К" && computer == "Ножницы" || choisen == "Н" && computer == "Камень")
            {
                println("Камень затупляет или ломает ножницы")
                if (choisen == "Н" && computer == "Камень")
                {
                    println("Победил компьютер(")
                }
                else{
                    println("Вы победили!")
                }
            }
            if (choisen == "К" && computer == "Бумага" || choisen == "Б" && computer == "Камень")
            {
                println("Бумага обёртывает камень")
                if (choisen == "Б" && computer == "Камень")
                {
                    println("Победил компьютер(")
                }
                else{
                    println("Вы победили!")
                }
            }
            if (choisen == "Н" && computer == "Бумага" || choisen == "Б" && computer == "Ножницы")
            {
                println("Ножницы разрезают бумагу")
                if (choisen == "Б" && computer == "Ножницы")
                {
                    println("Победил компьютер(")
                }
                else{
                    println("Вы победили!")
                }
            }

            println("Хотите сыграть еще? (да/нет)")
            val playAgain = readln()
            if (playAgain != "да") {
                break
            }
        }
        else{
            println("Ответ не засчитан, выберите предмет: К-камень, Н-ножницы, Б-бумага")
        }
    }
}