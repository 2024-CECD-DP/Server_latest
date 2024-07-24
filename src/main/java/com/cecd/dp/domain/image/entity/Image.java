package com.cecd.dp.domain.image.entity;

import com.cecd.dp.domain.media.entity.Media;
import jakarta.persistence.*;

@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private Long id;

    private String imageURL;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "media_id")
    private Media media;

    //===연관관계 보조 메서드===//
    public void setMedia(Media media) {
        this.media = media;
    }
}
