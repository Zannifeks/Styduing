package lesson18;

public class Lesson18 {
    public static void main(String[] args) {
        final int a;
        a = 10;
//        a = 5 + 1;
        Robot.count = 6;

        System.out.println(Robot.COMPANY_NAME);

        Robot robot = new Robot(8);
        System.out.println(robot);
        System.out.println(Robot.getCount());
        System.out.println(Robot.add(2,2));
        robot.addAndSave(5);
        robot.addAndSave(12);
        System.out.println(robot.getSum());

        Robot r2d2 = new Robot(2);
        System.out.println(r2d2);
        System.out.println(Robot.getCount());
        System.out.println(r2d2.getSum());
    }
}
