import java.util.*;

class Robot {

    private String name;

    public Robot(String name) {
        this.name = name;
    }

    void performAction() {
        System.out.println(name + " is performing an action.");

    }

    class Arm {

        void pickItem() {
            System.out.println(name + " arm picking an item.");

        }

    }

    static class Processor {

        void process() {
            System.out.println("Processor analyzing the data.");

        }
    }

    public void manageSensors() {
        class Sensor {
            public void sense() {
                System.out.println(name + " sensor detecting obstacles.");
            }
        }

        Sensor sensor = new Sensor();
        sensor.sense();
    }

    interface Task {
        void execute();
    }

    public void executeTask() {
        Task task = new Task() {
            @Override
            public void execute() {
                System.out.println(name + " executing a custom task.");
            }
        };
        task.execute();
    }

}

class _08_Practice_Inner_Classes {

    // Below code demonstates the Driver code and its working for the class 'Robot'.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        Robot robot = new Robot(name);

        robot.performAction();

        // Using non static inner class
        // creating the object of the inner class and calling the its method pickItem
        Robot.Arm arm = robot.new Arm();
        arm.pickItem();

        // Using static nested class
        // creating the object of the nested class and calling the its method process
        Robot.Processor processor = new Robot.Processor();
        processor.process();

        // Calling the method manageSensors that implements the local inner class
        // It then calls the sense method inside the manageSensors method to print the
        // coorresponding text
        robot.manageSensors();

        // Calling method executeTask that Override the method execute which is
        // implemented in by the interface Task
        robot.executeTask();
    }

}

// System.out.println(name + " is performing an action."); -> It is for
// performAction method
// System.out.println(name + " arm picking an item."); -> It is for pickItem
// method
// System.out.println("Processor analyzing the data."); -> It is for process
// method
// System.out.println(name + " sensor detecting obstacles."); -> It is for sense
// method
// System.out.println(name + " executing a custom task."); -> It is for execute
// method
