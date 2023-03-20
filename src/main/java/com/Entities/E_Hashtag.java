package com.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Hashtag", schema = "offroad_BSM", catalog = "")
public class E_Hashtag {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "hashtag", nullable = true, length = 45)
    private String hashtag;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Hashtag eHashtag = (E_Hashtag) o;

        if (id != eHashtag.id) return false;
        if (hashtag != null ? !hashtag.equals(eHashtag.hashtag) : eHashtag.hashtag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (hashtag != null ? hashtag.hashCode() : 0);
        return result;
    }
}
