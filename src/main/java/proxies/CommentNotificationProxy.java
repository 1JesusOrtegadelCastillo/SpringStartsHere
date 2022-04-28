package proxies;

import model.Comment;

// creating a contract/interface to decouple responsibilities and describe WHAT is needed
public interface CommentNotificationProxy {

    void sendComment(Comment comment);

}
