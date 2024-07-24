package com.cecd.dp.domain.hashtag.entity;

import com.cecd.dp.domain.mediahashtag.MediaHashTag;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class HashTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hash_tag_id")
    private Long id;

    private String name; //태그명

    @OneToMany(mappedBy = "hashTag")
    private List<MediaHashTag> mediaHashTagList = new ArrayList<>();
}
