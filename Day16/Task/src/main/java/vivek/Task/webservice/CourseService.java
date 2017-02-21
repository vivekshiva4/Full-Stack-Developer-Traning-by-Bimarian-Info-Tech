package vivek.Task.webservice;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;



import vivek.Task.dto.*;
import vivek.Task.model.AccessManager;
@Path("/courseService")

public class CourseService {
	@GET
	@Path("/courses")
	@Produces(MediaType.APPLICATION_JSON)
	public String courses()
	{
	String courses = null;
	ArrayList<Course> courseList = new ArrayList<Course>();
	try
	{
	courseList = new AccessManager().getCourses();
	Gson gson = new Gson();
	courses = gson.toJson(courseList);
	} catch (Exception e)
	{
	e.printStackTrace();
	}
	return courses;
	}
	

}
