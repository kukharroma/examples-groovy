/**
 * Created by roma on 26.02.16.
 */
class People {

    String firstName
    String lastName

    static void main(def args){
        People p = new People(firstName: "Roma", lastName: "Kukhar")
        println(p.toString())
        int k =3
    }
}
