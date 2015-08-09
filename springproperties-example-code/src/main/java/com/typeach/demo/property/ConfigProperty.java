package com.typeach.demo.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Author: Weijie Zhao
 * Description: 读取properties工具类
 * Copyright: Copyright (c) 2015
 */
@Component
@Scope("singleton")
public class ConfigProperty {

    @Value("#{setting[author_name]}")
    private String author_name;
    @Value("#{setting[project_info]}")
    private String project_info;

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getProject_info() {
        return project_info;
    }

    public void setProject_info(String project_info) {
        this.project_info = project_info;
    }
}
