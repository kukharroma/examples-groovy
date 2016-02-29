/**
 * Created by roma on 29.02.16.
 */
class MapTesting {

    static void main(def args) {

        def map = [1: "Roma", 2: "Petro", 3: "Andrey"]

//        map.each { entry -> println(entry.key > 1) }
//
//        map.each { entry -> println(entry.value.contains("R")) }


        println map.any { entry -> entry.key >= 5 }

        println map.every { entry -> entry.key >= 1 }


        map.each { key, value ->
            print key + " " + value + " "
        }

        println()

        map.each { entry ->
            print entry.key + " " + entry.value + " "
        }

    }
}
