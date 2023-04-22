package com.mashibing.framework.service.impl;

import com.mashibing.framework.dao.impl.CourseDao;
import com.mashibing.framework.dao.impl.CourseDaoImpl;

public class CourseServiceImpl {

    private CourseDaoImpl courseDaoImpl;

    public CourseServiceImpl() {
    }

    public CourseServiceImpl(CourseDaoImpl courseDaoImpl) {
        this.courseDaoImpl = courseDaoImpl;
    }

    public CourseDaoImpl getCourseDaoImpl() {
        return courseDaoImpl;
    }

    public void setCourseDaoImpl(CourseDaoImpl courseDaoImpl) {
        this.courseDaoImpl = courseDaoImpl;
    }
}
