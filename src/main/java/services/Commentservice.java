package services;

import model.Comment;
import org.springframework.stereotype.Component;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

@Component
public class Commentservice {

    // we define the two dependencies as attributes of the class
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;


    // we provide the dependencies when the object is built through the parameters of the constructor
    public Commentservice(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy){
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    // we implement the use case that delegates the "store comment" and "send notification" responsibilities to the
    // dependencies
    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}
