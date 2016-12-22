
import java.util.Scanner;
import org.hibernate.Session;
import pk.edu.nust.seecs.gradebook.entity.Course;
import pk.edu.nust.seecs.gradebook.util.HibernateUtil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Anas
 */
public class Main {

    public void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        System.out.println("Enter the record you want to explore: ");
        System.out.println("1-Course");
        System.out.println("2-Teachers");
        System.out.println("3-Students");
        System.out.println("4-Contents");
        System.out.println("5-CLOs");
        System.out.println("6-Grades");

        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        switch (input) {
            case 1:
                System.out.println("1-ADD Course");
                System.out.println("2-UPDATE Course");
                input = in.nextInt();
                if (input == 1) {
                    System.out.print("Enter Course ID: ");
                    int id = in.nextInt();
                    System.out.print("Enter Course Title: ");
                    String title = in.nextLine();
                    System.out.print("Enter Start Date: ");
                    String start = in.nextLine();
                    System.out.print("Enter End Date: ");
                    String end = in.nextLine();
                    System.out.print("Enter Credit Hours: ");
                    int credit = in.nextInt();

                    Course course = new Course();
                    course.setClasstitle(title);
                    course.setCreditHours(credit);
                    course.setEndsOn(end);
                    course.setStartsOn(start);
                    session.save(course);

                } else if (input == 2) {

                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;
        }

        session.getTransaction().commit();

    }
}
