public class TaskManagement {

    Task head = null;

    // Add Task
    void addTask(int id, String name, String status) {

        Task newTask = new Task(id, name, status);

        if(head == null) {
            head = newTask;
            return;
        }

        Task temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = newTask;
    }

    // Search Task
    Task searchTask(int id) {

        Task temp = head;

        while(temp != null) {

            if(temp.taskId == id)
                return temp;

            temp = temp.next;
        }

        return null;
    }

    // Traverse Tasks
    void displayTasks() {

        Task temp = head;

        while(temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    // Delete Task
    void deleteTask(int id) {

        if(head == null)
            return;

        if(head.taskId == id) {
            head = head.next;
            return;
        }

        Task temp = head;

        while(temp.next != null &&
              temp.next.taskId != id) {

            temp = temp.next;
        }

        if(temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public static void main(String[] args) {

        TaskManagement tm = new TaskManagement();

        tm.addTask(1, "Design UI", "Pending");
        tm.addTask(2, "Write Code", "In Progress");
        tm.addTask(3, "Testing", "Pending");

        System.out.println("Tasks:");
        tm.displayTasks();

        System.out.println("\nSearch Result:");
        System.out.println(tm.searchTask(2));

        tm.deleteTask(2);

        System.out.println("\nAfter Deletion:");
        tm.displayTasks();
    }
}