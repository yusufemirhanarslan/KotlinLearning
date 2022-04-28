package com.yusufemirhanarslan.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      /*  println("Hello Kotlin")
        println(4 *5 )
        */
        //Variables && Constants

        var x = 5
        var y = 4

        println(x * y)

        var age = 35

        val result = age / 7 * 5

        println(result)

        //Defining
        println("------------Integer---------")

        var myInteger : Int = 10

        // Initialize
        myInteger = 10
        myInteger = 20


        val a : Int = 23

        println(a/2)

        //Long

        var myLong : Long = 100


        //Double / Float

        println("------------Double&Float---------")

        val pi = 3.14

        println(pi * 2)

        val myFloat = 3.14f

        println(myFloat * 2)

        var myAge : Double = 3.0
        println(myAge/2)


        //String

        println("------------String---------")

        val myString = "Yusuf Emirhan"
        val name = "James"
        val surname = "Hetfield"

        val fullname = name + " " + surname

        println(fullname)

        val larsName : String = "Lars"

        //Boolean

        println("------------Boolean---------")


        var myBoolean: Boolean = true
        myBoolean = false

        var isAlive= true

        //Conversion
        println("------------Conversion---------")

        var myNumber = 5
        var myLongNumber = myNumber.toLong()

        println(myLongNumber)

        var input = "10"
        var intInput = input.toInt()

        println(2 * intInput)


        //Collections

        //Arrays

        println("------------Array---------")

        val myArray = arrayOf("James","Kirk","Rob","Lars")


        //index
        println(myArray[0])

        myArray[0] = "James Hetfield"
        println(myArray[0])

        myArray.set(1,"Kirk Hammett")
        println(myArray[1])

        val numberArray = arrayOf(1,2,3,4,5)
        println(numberArray[3])

        val myNewArray = doubleArrayOf(1.0,2.0,3.0)

        val mixedArray = arrayOf("Yusuf",8)
        println(mixedArray[0])
        println(mixedArray[1])

        //List - ArrayList
        println("------------List---------")

        val myMusician = ArrayList<String>()
        myMusician.add("Lars")
        println(myMusician[0])
        myMusician.add(0,"Rob")
        println(myMusician[0])
        println(myMusician[1])

        val myMixedArrayList = ArrayList<Any>()
        myMixedArrayList.add("Atil")
        myMixedArrayList.add(12.25)
        myMixedArrayList.add(true)

        println(myMixedArrayList[0])
        println(myMixedArrayList[1])
        println(myMixedArrayList[2 ])


        val myArralist = arrayListOf<String>("James","Kirk")


        //Set


        println("------------Set---------")

        val myExampleArray = arrayOf(1,1,2,3,4)

        println("element 1 : ${myExampleArray[0]}")
        println("element 2 : ${myExampleArray[1]}")



        val mySet = setOf<Int>(1,1,2,3,)

        println(mySet.size)

        //For Each

        mySet.forEach { println(it) }

        val myStringSet = HashSet<String>()
        myStringSet.add("Yusuf")
        myStringSet.add("Yusuf")
        println(myStringSet.size)

        //Map - HashMap

        println("------------Map---------")

        //Key - Value

        val fruitArray = arrayOf("Apple","Banana")
        val caloriesArray= arrayOf(100,150)

        println("${fruitArray[0]} : ${caloriesArray[0]}")


        val fruitCalorieMap = hashMapOf<String,Int>()
        fruitCalorieMap.put("Apple",100)
        fruitCalorieMap.put("Banana",150)
        println(fruitCalorieMap["Apple"])


        val myHashMap = HashMap<String,String>()


        val myNewMap = hashMapOf<String,Int>("A" to 1,"B" to 2,"C" to 3)
        println(myNewMap["C"])


        //Operator

        println("------------Operator---------")

        var m = 5
        println(m)
        m = m + 1
        println(m)
        m++
        println(m)
        m--
        println(m)

        var n = 7

        println(n > m)

        // &&
        // ||

        println(n > m && 1 > 2)
        println(n > m || 1 > 2)

        println(10+2)
        println(10-2)
        println(10*2)
        println(10/2)
        //Remainder
        println(10%4)

        //If Control

        println("------------If Control---------")

        val myNubmerAge = 52

        if(myNubmerAge < 30){

            println("<30")
        } else if(myNubmerAge >= 30 && myNubmerAge <40){
            println("30 - 40")

        }else if(myNubmerAge >= 40 && myNubmerAge < 50){
            println("40 - 50")
        }else {
            println(">=50")
        }

        //Switch-When

        println("------------Switch-When---------")

        val day = 3
        var dayString = ""

        when(day){

            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
            else -> dayString = ""
        }

        println(dayString)

        //Loops

        println("------------Loops---------")

        val myArrayOfNumbers = arrayOf(12,15,18,21,24,27,30,33)
        val q = myArrayOfNumbers[0] / 3 * 5
        println(q)

        for (number in myArrayOfNumbers){

            val z = number / 3 * 5
            println(z)
        }

        for (i in myArrayOfNumbers.indices){
            val qz = myArrayOfNumbers[i] / 3 * 5
            println(qz)
        }


        for (b in 0..9){

            println(b)

        }

        val myStringArrayList = ArrayList<String>()
        myStringArrayList.add("Yusuf")
        myStringArrayList.add("Emirhan")
        myStringArrayList.add("Joseph")

        for(str in myStringArrayList){
            println(str)
        }

        //While Loop

        println("------------While Loop---------")


        var j = 0

        while (j < 10){
            println(j)
            j++
        }





















    }
}