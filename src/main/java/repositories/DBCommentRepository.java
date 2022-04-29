package repositories;

import model.Comment;
import org.springframework.stereotype.Component;

@Component
// we implement our interface to tell HOW its needed through our programming logic
public class DBCommentRepository implements CommentRepository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
