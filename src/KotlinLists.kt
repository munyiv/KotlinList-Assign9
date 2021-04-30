fun main(){
    println(names(listOf("jane","Mary","John","Albert","Peter","Audrey","Ian","Olga","Sophie","Belyse")))
    human()
    plusHuman()
    var Milleage= listOf(
        Cars("et2t",200),
        Cars("yhdi33",800)
    )
    println(gari(listOf(200,800)))

    var HEight= listOf(23.5,48.5,30.0,5.0)
    var urefu= height(HEight)
    println(urefu.average)
    println(urefu.sum)

}
fun names(names:List<String>):List<String>{
    var b= mutableListOf<String>()
    for (char in names){
        if (names.indexOf(char)%2==0){
            b.add(char)
        }
    }
return b
}



data class Height(var average: Double, var sum:Double)
fun height(HEight:List<Double>):Height{
    var avg=HEight.average()
    var sum= HEight.sum()
    var avgsum=Height(avg, sum)
    return avgsum

}


data class Human(var name:String,var age:Int,var height:Double,var weight:Double)
fun human(){
var Human= mutableListOf(
    Human("Audrey", 9, 55.5, 45.6),
    Human("Mary", 27, 43.2, 30.4),
    Human("John", 38, 56.2, 70.8)

    )
   var sortAge=Human.sortedByDescending{human->human.age}
    println(sortAge)

}
data class HumanBeing(var name:String,var age:Int,var height:Double,var weight:Double)
fun plusHuman(){
   var Human= mutableListOf(
       Human("Audrey", 9, 55.5, 45.6),
       Human("Mary", 27, 43.2, 30.4),
       Human("John", 38, 56.2, 70.8)

   )
    Human.addAll(listOf(
        Human("Belyse",21,2.80,68.5),
        Human("Shazzy",24,1.80,55.5)
    ))
    println(Human)

}

data class Cars(var registration:String,var mileage:Int)

fun gari(mileage: List<Int>):Int{
    var Milleage=mileage.average().toInt()
    return Milleage

}

