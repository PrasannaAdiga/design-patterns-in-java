package com.java.factory.blog;

import com.java.factory.Website;
import com.java.factory.blog.pages.AboutPage;
import com.java.factory.blog.pages.CommentPage;
import com.java.factory.blog.pages.ContactPage;
import com.java.factory.blog.pages.PostPage;

//one of the concrete subclass of a Website
public class BlogWebsite extends Website {

    @Override
    protected void createWebsite() {
        //add bunch of pages which will creates a blog website
        this.pages.add(new AboutPage());
        this.pages.add(new ContactPage());
        this.pages.add(new PostPage());
        this.pages.add(new CommentPage());
    }

}
