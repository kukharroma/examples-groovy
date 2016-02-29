/**
 * Created by roma on 29.02.16.
 */
class NumberTest {

    static void main(def args) {
        int j = 1
        int i = j + 3
        int k = j.plus(3)

        assert (k == 4)

        def value = 1.0F
        println value.class

        def value2 = 1
        println value2.class

        value2 = value2 / 2
        println value2

        println value2.class

        10.times {
            println this.getSimpleName()
        }

        for (p in 0..9) {
            println "----Hello $p----"
            println "p.previous()" + p.previous()
            println "p.next()" + p.next()
            println "----Hello $p----"
            println()
        }


        assert 'B'..'E' == ['B', 'C', 'D', 'E']
    }


}
