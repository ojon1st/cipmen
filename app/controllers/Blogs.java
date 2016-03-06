package controllers;

import models.Blog;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.blog;
import views.html.blogs;

/**
 * Created by brabo on 3/2/16.
 */
public class Blogs extends Controller {

    @Transactional
    public Result reads() {
        return ok(blogs.render(new Blog().findList()));
    }

    @Transactional
    public Result read(String lien) {
        return ok(blog.render(new Blog().findByLien(lien)));
    }
}
