package com.springrestapi.springrestapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrestapi.springrestapi.dao.CourseDao;
import com.springrestapi.springrestapi.entities.Course;

@Service
public class CourseServiceImpl implements CourseServices {

//	List<Course> list;
	@Autowired
	private CourseDao courseDao;
	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(145,"Java","Course contains java"));
//		list.add(new Course(146,"NodeJs","Course contains node"));
//		list.add(new Course(147,"ReactJs", "Course contains React"));
		
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
//		return list;
		return courseDao.findAll();
	}
	
	@Override
	public Course getCourse(long courseId){
//		Course c = null;
//		
//		for(Course course : list) {
//			if(course.getId()==courseId) {
//				c=course;
//			}
//		}
		return courseDao.findById(courseId).orElse(null);
		
	}
	
	@Override
	public Course addCourse(Course course) {
		
//		list.add(course);
//		return course;
		courseDao.save(course);
		return course;
	}
	
	@Override
	public Course updateCourse(Course course) {
//	    for (int i = 0; i < list.size(); i++) {
//	        if (list.get(i).getId() == course.getId()) {
//	            list.set(i, course);
//	            break;
//	        }
//	    }
//	    return course;
		courseDao.save(course);
		return course;

	}
	
	@Override
	public void deleteCourse(long courseId) {
//		list=this.list.stream().filter(e->e.getId()!=courseId).collect(Collectors.toList());
		Course entity = courseDao.findById(courseId).orElse(null);
		courseDao.delete(entity);
	}


}
