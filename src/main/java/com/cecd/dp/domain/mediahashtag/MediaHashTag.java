package com.cecd.dp.domain.mediahashtag;

import com.cecd.dp.domain.hashtag.entity.HashTag;
import com.cecd.dp.domain.media.entity.Media;
import jakarta.persistence.*;

@Entity
public class MediaHashTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meid_hash_tag_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hash_tag_id")
    private HashTag hashTag;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "media_id")
    private Media media;

    //===연관관계 편의 메서드===//
    public void setHashTag(HashTag hashTag) {
        if (hashTag.getMediaHashTagList().contains(hashTag)) {
            hashTag.getMediaHashTagList().remove(hashTag);
        }

        this.hashTag = hashTag;
        this.hashTag.getMediaHashTagList().add(this);
    }

    public void setMedia(Media media) {
        if (media.getMediaHashTagList().contains(media)) {
            media.getMediaHashTagList().remove(media);
        }

        this.media = media;
        this.media.getMediaHashTagList().add(this);
    }
}
