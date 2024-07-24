package com.cecd.dp.domain.media.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMedia is a Querydsl query type for Media
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMedia extends EntityPathBase<Media> {

    private static final long serialVersionUID = 1663523561L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMedia media = new QMedia("media");

    public final StringPath caption = createString("caption");

    public final StringPath graphMediaId = createString("graphMediaId");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<com.cecd.dp.domain.image.entity.Image, com.cecd.dp.domain.image.entity.QImage> imageList = this.<com.cecd.dp.domain.image.entity.Image, com.cecd.dp.domain.image.entity.QImage>createList("imageList", com.cecd.dp.domain.image.entity.Image.class, com.cecd.dp.domain.image.entity.QImage.class, PathInits.DIRECT2);

    public final com.cecd.dp.domain.influencer.entity.QInfluencer influencer;

    public final NumberPath<Integer> likeCnt = createNumber("likeCnt", Integer.class);

    public final ListPath<com.cecd.dp.domain.mediahashtag.MediaHashTag, com.cecd.dp.domain.mediahashtag.QMediaHashTag> mediaHashTagList = this.<com.cecd.dp.domain.mediahashtag.MediaHashTag, com.cecd.dp.domain.mediahashtag.QMediaHashTag>createList("mediaHashTagList", com.cecd.dp.domain.mediahashtag.MediaHashTag.class, com.cecd.dp.domain.mediahashtag.QMediaHashTag.class, PathInits.DIRECT2);

    public final NumberPath<Integer> replyCnt = createNumber("replyCnt", Integer.class);

    public final StringPath type = createString("type");

    public QMedia(String variable) {
        this(Media.class, forVariable(variable), INITS);
    }

    public QMedia(Path<? extends Media> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMedia(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMedia(PathMetadata metadata, PathInits inits) {
        this(Media.class, metadata, inits);
    }

    public QMedia(Class<? extends Media> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.influencer = inits.isInitialized("influencer") ? new com.cecd.dp.domain.influencer.entity.QInfluencer(forProperty("influencer")) : null;
    }

}

