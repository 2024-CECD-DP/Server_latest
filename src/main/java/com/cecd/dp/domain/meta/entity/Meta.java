package com.cecd.dp.domain.meta.entity;

import com.cecd.dp.domain.influencer.entity.Influencer;
import com.cecd.dp.global.BaseEntity;
import jakarta.persistence.*;

@Entity
public class Meta extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meta_id")
    private Long id;
    private Integer mediaAVg;
    private Integer replyAvg;
    private Integer followerCnt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "influencer_id")
    private Influencer influencer;

    public void setInfluencer( Influencer influencer) {
        this.influencer = influencer;
    }
}
