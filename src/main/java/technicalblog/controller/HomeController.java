package technicalblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.model.IModel;
import technicalblog.model.Post;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getAllPost(Model model){
        List<Post> posts=new ArrayList<Post>();
        Post post1=new Post();
        post1.setTitle("rudra");
        post1.setBody("idiot");
        post1.setDate(new Date());

        Post post2=new Post();
        post2.setTitle("dhanu");
        post2.setBody("cute");
        post2.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        model.addAttribute("posts",posts);
        return  "index";






    }



}
