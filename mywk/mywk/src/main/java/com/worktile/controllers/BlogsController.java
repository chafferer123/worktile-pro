package com.worktile.controllers;


import com.worktile.mappers.BlogMapper;
import com.worktile.models.Blog;
import org.hsqldb.Session;
import org.noo.pagination.page.PageContext;
import org.noo.pagination.page.Pagination;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import javax.validation.Valid;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BlogsController {

    private static final Logger LOG = LoggerFactory.getLogger(BlogsController.class);


    @RequestMapping(value = "/blogs", method = RequestMethod.GET)
    public String index(Model model) {

        model.addAttribute("message", "hello");
        return "blogs/show";
    }



}
