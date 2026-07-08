package demo03db;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public  static void main(String args[]) {
		try(StudentDao dao = new StudentDaoImpl()){
			Student s = dao.findById(1);
			System.out.println(s.toString());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main2(String args[]) {
		List<Student>list = new ArrayList<>();
		try(StudentDao dao = new StudentDaoImpl()){
			list = dao.findAll();
			for(Student s : list)
			{
				System.out.println(s.toString());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main3(String args[]) {
		try(StudentDao dao = new StudentDaoImpl()){
			Student s = new Student(6,"Kavita",90);
			int cnt = dao.save(s);
			System.out.println("Rows Affected: "+cnt);
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
