package main;

import config.ProjectConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import proxies.EmailCommentNotificationProxy;
import repositories.DBCommentRepository;
import services.Commentservice;

public class main {

    public static void main (String [] args){

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        // Creates an instance of comment to send as a parameter to the publish comment use case
        var comment = new Comment();
        comment.setAuthor("Dorothea");
        comment.setText("Demo comment");

        // Calls the publish comment use case
        var commentService = context.getBean(Commentservice.class);
        commentService.publishComment(comment);

    }

}
