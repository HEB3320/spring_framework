package com.cydeo.proxy;

import com.cydeo.model.Comment;

public interface CommentNotificationProxy {
    //interface
    void sendComment(Comment comment);
}
