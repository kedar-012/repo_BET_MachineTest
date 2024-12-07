package manageCourse;
import java.util.*;
public class Course {
	int id;
	String courseName;
	double fee;
	String instructor;
	public Course addCourse(int id,String CourseName,double fee,String instructor)
	{
		Course ob = new Course();
		ob.id = id;
		ob.courseName = CourseName;
		ob.fee = fee;
		ob.instructor = instructor;
		return ob;
	}
	public  Course[] deletCourse(Course ar[],int cid)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i].id == cid)
			{
				ar.remove(ar[i]);  // for Deleting the Course
			}
		}
		return ar;
	}
	public Course[] updateCourse(Course ar[],int id,String courseName,String instructor,double fee)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i].id == id)
			{
				ar[i].id = id;
				ar[i].courseName = courseName;
				ar[i].instructor = instructor;
				ar[i].fee = fee;
			}
		}
		return ar;
	}
	public String toString(Course a)
	{
		String str = "Course ID: "+ a.id + " Course Name : "+a.courseName + 
				" Course Fees : "+ a.fee + " Course Instructor : "+ a.instructor;
		return str;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Course a[];
		int id = 0;
		Course ob = new Course();
		String courseName = null,instructor = null;
		double fee = 0;
		System.out.println("1. Add new Course : "
		+ "\n2) View All Courses : "
		+"\n3) Update Course Details : "
		+"\n4) Delete a Course : ");
		System.out.println("Enter Your Choice : ");
		int n = sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Enter The Course id : "+ id);
			id = sc.nextInt();
			System.out.println("Enter The Course Name : "+ courseName);
			courseName = sc.nextLine();
			System.out.println("Enter The Course Fee : "+ fee);
			fee = sc.nextDouble();
			System.out.println("Enter The Course Instructor Name : "+ instructor);
			instructor = sc.nextLine();
			Course ob2 = ob.addCourse(id,courseName,fee,instructor);
			a.add(ob2);   // For adding the Element in the Array
			System.out.println("Course is Added Successfully");
			break;
		case 2:
			for(int i=0;i<a.length;i++)
			{
				System.out.println(ob.toString(a[i]));
			}
			break;
		case 3: 
			System.out.println("Enter the id Of Course You Want To Update : ");
			id = sc.nextInt();
			System.out.println("Enter the Course Name You Want To Update : ");
			courseName = sc.nextLine();
			System.out.println("Enter the Fees of Course You Want To Update  : ");
			fee = sc.nextDouble();
			System.out.println("Enter the instructor Name You Want to Update : ");
			instructor = sc.nextLine();
			int flag = 0;
			for(int i=0;i<a.length;i++)
			{
				if(i==id)
				{
					flag =1;
				}
			}
			if(flag == 1)
			{
				a = ob.updateCourse(a,id,courseName,instructor,fee);
			}
			break;
		case 4: 
			System.out.println("Please Enter the ID of the Course You Want to delet : ");
			int cid = sc.nextInt();
			if(id>a.length)
			{
				System.out.println("ID is not Found...First Display the All Courses then Entered The ID.");
			}else {
				for(int i=0;i<a.length;i++)
				{
					if(cid == i)
					{
						a = ob.deletCourse(a,cid);
					}
				}
				
			}
			break;
		default:
			System.out.println("Invalid Option Please Enter the Right Option....");
		}
	}
}
