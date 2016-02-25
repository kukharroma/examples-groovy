/**
 * Created by roma on 25.02.16.
 */
class Task {

    String summary
    String description
    Date duDate

    static void main(def args) {

        Task task = new Task()
        Task task2 = task;

        println(task.is(task2))
        println(task == task2)

        println(sum(1, 2));
    }

    static sum(a, b, c = 0) {
        a + b + c;
    }

}
