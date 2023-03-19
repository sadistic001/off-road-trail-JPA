package com.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "Commentaire_hashtag", schema = "offroad_BSM", catalog = "")
@IdClass(E_CommentaireHashtagPK.class)
@Getter
@Setter
public class E_CommentaireHashtag {

    @Id@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id", name = "commentaire", nullable = true)
    private E_Commentaire commentaire;
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id", name = "hashtag", nullable = true)
    private E_Hashtag hashtag;


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
        return Objects.hash(commentaire, hashtag);
    }
}
