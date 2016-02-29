/**
 * Created by roma on 29.02.16.
 */
class ListTest {

    static void main(def args) {
        List<Integer> list = [1, 2, 3, 5]

        List<People> peopleList = list[1, 3, 4]

        People people = new People(firstName: "Roma", lastName: "Kukhar")

        peopleList[0] = people
        println peopleList.size()
        println peopleList[0].firstName
        println peopleList.get(0).firstName


        def String[] strings = "This is a long sentence".split();

        def List listStrings = strings

        def String[] arrayStrings = listStrings

        println strings.class.name
        println listStrings.class.name
        println arrayStrings.class.name



        //

        assert ['b', 'd'] == ['a', 'b', 'c', 'd'].grep(['b', 'd'])

    }
}
