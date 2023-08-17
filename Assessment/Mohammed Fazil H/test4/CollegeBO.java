package test4;

import java.util.ArrayList;
import java.util.List;

public class CollegeBO {
	public List<College> findCollege(List<String> nameList) {
		  
		  if (nameList.isEmpty()) {
		    return new ArrayList<>();
		  }
		  
		  for (String sname : nameList) {
		    
		    College college = college.findByName(nameList);
		    
		    if (college != null) {
		      college.add(college);
		    }
		  }
		  
		  return college;
		}

	public List<College> findCollege(String location) {
		 
		  if (!isValidLocation(location)) {
		    return null;
		  }
		  
		  List<College> colleges = getColleges();
		 
		  List<College> foundColleges = new ArrayList<>();
		  for (College col: colleges) {
		    if (col.getLocation().equals(location)) {
		      foundColleges.add(col);
		    }
		  }
		  
		  return foundColleges;
		}

	private List<College> getColleges() {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean isValidLocation(String location) {
		// TODO Auto-generated method stub
		return false;
	}

	public void add(List<College> list) {
		// TODO Auto-generated method stub
		
	}

}
