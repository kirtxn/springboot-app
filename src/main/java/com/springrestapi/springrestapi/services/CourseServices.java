package com.springrestapi.springrestapi.services;

import java.util.List;

import com.springrestapi.springrestapi.entities.Course;

public interface CourseServices {
	
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public void deleteCourse(long parseLong);
	
}
