package proxies;

import model.Comment;

// we implement our interface to tell HOW its needed through our programming logic
public class EmailCommentNotificationProxy implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
