package com.mashibing.framework.dao.impl;

public class CourseDaoImpl {

    private CourseDao courseDao;

    public CourseDaoImpl() {
    }

    public CourseDaoImpl(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    public CourseDao getCourseDao() {
        return courseDao;
    }

    public void setCourseDao(CourseDao courseDao) {
        this.courseDao = courseDao;
    }
}
