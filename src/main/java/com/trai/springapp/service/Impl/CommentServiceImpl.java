/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trai.springapp.service.Impl;

import com.trai.springapp.model.Comment;
import com.trai.springapp.service.CommentService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tulasi
 */
public class CommentServiceImpl implements CommentService{

    @Override
    public List<Comment> getComments() {
        List<Comment> comments = new ArrayList<>();
        comments.add(new Comment("Tulsi Rai", "A good research on React and Java!"));
        comments.add(new Comment("Noah Rai", "Good Work Papa."));
        comments.add(new Comment("Nishan Kanchhu", "Keep up the good work Papa!"));
        return (comments);
    }
    
}
