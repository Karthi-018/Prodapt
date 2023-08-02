package stud;
public class Student
{
	private int stud_id;
	private String stud_Name;
	private int stud_mark;

	Student(int stud_id, String stud_Name,int stud_mark)
	{
		this.stud_id=stud_id;
		this.stud_Name=stud_Name;
		this.stud_mark=stud_mark;
	}

	public void setId(int stud_id)
	{
		this.stud_id=stud_id;
	}
	public void setName(String stud_Name)
	{
		this.stud_Name=stud_Name;
	}
	public void setMark(int stud_mark)
	{
		this.stud_mark=stud_mark;
	}

	public int getId()
	{
		return stud_id;
	}
	public String getName()
	{
		return stud_Name;
	}
	public int getMark()
	{
		return stud_mark;
	}
	
	public String toString()
	{
		return stud_id+" "+stud_Name+" "+stud_mark;
	}
}