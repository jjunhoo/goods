package com.musinsa.goods.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "goods")
public class Goods {
    @ApiModelProperty(value = "상품번호", position = 1)
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goods_no")
    private Long goodsNo;
    @ApiModelProperty(value = "상품명", position = 2)
    @Column(name = "goods_nm")
    private String goodsNm;
    @ApiModelProperty(value = "상품설명", position = 3)
    @Column(name = "goods_cont")
    private String goodsCont;
    @ApiModelProperty(value = "업체 아이디", position = 4)
    @Column(name = "com_id")
    private String comId;
    @ApiModelProperty(value = "상품정보 최초등록일시", position = 5)
    @Column(name = "reg_dm")
    private LocalDateTime regDm;
    @ApiModelProperty(value = "상품정보 수정일시", position = 6)
    @Column(name = "upd_dm")
    private LocalDateTime updDm;
}
