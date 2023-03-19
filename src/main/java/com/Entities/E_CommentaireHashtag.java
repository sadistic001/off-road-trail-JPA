package com.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Commentaire_hashtag", schema = "offroad_BSM", catalog = "")
@IdClass(E_CommentaireHashtagPK.class)
public class E_CommentaireHashtag {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "commentaire", nullable = false)
    private int commentaire;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "hashtag", nullable = false)
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

        E_CommentaireHashtag that = (E_CommentaireHashtag) o;

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
