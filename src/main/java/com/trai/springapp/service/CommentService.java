/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trai.springapp.service;

import com.trai.springapp.model.Comment;
import java.util.List;

/**
 *
 * @author Tulasi
 */
public interface CommentService {
     List<Comment> getComments();
}
