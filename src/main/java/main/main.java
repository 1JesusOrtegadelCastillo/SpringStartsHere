package main;

import model.Comment;
import proxies.EmailCommentNotificationProxy;
import repositories.DBCommentRepository;
import services.Commentservice;

public class main {

    public static void main (String [] args){

        // Creates the instance for the dependencies
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();

        //Creates the instance of the service class and providing the dependencies
        var commentservice = new Commentservice(commentRepository, commentNotificationProxy);

        // Creates an instance of comment to send as a parameter to the publish comment use case
        var comment = new Comment();
        comment.setAuthor("Dorothea");
        comment.setText("Demo comment");

        // Calls the publish comment use case
        commentservice.publishComment(comment);

    }

}
