package com.CourseFile.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;


import com.CourseFile.Entity.Courses;
import com.CourseFile.Interface.CourseFileInterface;


@Service
public class CourseFileServices implements CourseFileInterface {

	List<Courses> list;

	public CourseFileServices() {
		
		list=new ArrayList<>();
		list.add(new Courses(501,"Manoj","kumaer","java",5000));
		list.add(new Courses(502,"Raj","kumaer","java",5000));
		
	}

	@Override
	public List<Courses> getcourses() {
		
		return list;
	}

	@Override
	public Courses getcourse(long courseId) {

		Courses c=null;
		for(Courses course :list)
		{
			if (course.getId()==courseId) 
			{
				c=course;
				break;
			}
		}
		
		return c;
	}

	@Override
	public Courses addcourse(Courses course) {
		list.add(course);
		return course;
	}

	@Override
	public Courses updateCourse(Courses course) {
		list.forEach(e ->{
			if(e.getId()==course.getId() ) {
				e.setName(course.getName());
				e.setLast_name(course.getLast_name());
				e.setCourse(course.getCourse());
				e.setFee(course.getFee());
				
			}
		});
		return course;
	}

	@Override
	public void deleteCourses(long parselong) {
		list=this.list.stream().filter(e->e.getId()!=parselong).collect(Collectors.toList());
		
	}













}
