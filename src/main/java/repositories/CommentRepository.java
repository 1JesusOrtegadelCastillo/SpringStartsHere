package repositories;

import model.Comment;

// creating a contract/interface to decouple responsibilities and describe WHAT is needed
public interface CommentRepository {

    void storeComment(Comment comment);

}
