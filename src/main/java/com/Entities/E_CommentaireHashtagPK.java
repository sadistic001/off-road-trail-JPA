package com.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class E_CommentaireHashtagPK implements Serializable {
    @Column(name = "commentaire", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commentaire;
    @Column(name = "hashtag", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hashtag;

    public int getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(int commentaire) {
        this.commentaire = commentaire;
    }

    public int getHashtag() {
        return hashtag;
    }

    public void setHashtag(int hashtag) {
        this.hashtag = hashtag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_CommentaireHashtagPK that = (E_CommentaireHashtagPK) o;

        if (commentaire != that.commentaire) return false;
        if (hashtag != that.hashtag) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = commentaire;
        result = 31 * result + hashtag;
        return result;
    }
}
