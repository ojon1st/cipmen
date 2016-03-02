package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.blog;
import views.html.blogs;

/**
 * Created by brabo on 3/2/16.
 */
public class Blogs extends Controller {

    public Result reads() {
        return ok(blogs.render());
    }

    public Result read(String nom) {
        return ok(blog.render());
    }
}
