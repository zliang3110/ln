package cn.bsb.serv.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.persistence.*;

/**
 * Created by zhangll on 2017/8/2.
 * 贷款产品定义表
 */
@Log4j2
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "lnf_prod")
public class LnfProd {
    @Id
    @Column(columnDefinition = "varchar(10) COMMENT '产品代码' ")
    private String prodcd;

    @Column(columnDefinition = "varchar(80) COMMENT '产品名称' ")
    private String prodna;

    @Column(columnDefinition = "varchar(200) COMMENT '产品描述' ")
    private String prodtx;

    @Column(columnDefinition = "varchar(1) COMMENT '贷款对象' ")
    private String coorpr;

    @Column(columnDefinition = "varchar(2) COMMENT '贷款细分对象' ")
    private String lncutp;

    @Column(columnDefinition = "varchar(1) COMMENT '业务分类' ")
    private String lnbztp;

    @Column(columnDefinition = "varchar(1) COMMENT '是否表外产品' ")
    private String isotbs;

    @Column(columnDefinition = "varchar(1) COMMENT '是否循环贷款' ")
    private String iscycl;

    @Column(columnDefinition = "varchar(1) COMMENT '是否补贴贷款' ")
    private String istxln;

    @Column(columnDefinition = "varchar(1) COMMENT '是否银团贷款' ")
    private String issynd;

    @Column(columnDefinition = "varchar(1) COMMENT '银团贷款方式' ")
    private String syndio;

    @Column(columnDefinition = "varchar(1) COMMENT '银团贷款类型' ")
    private String syndtp;

    @Column(columnDefinition = "varchar(1) COMMENT '内部银团成员行类型' ")
    private String syndit;


    @Column(columnDefinition = "varchar(1) COMMENT '外部银团成员行类型' ")
    private String syndot;

    @Column(columnDefinition = "varchar(1) COMMENT '资产转让类型' ")
    private String borstp;

    @Column(columnDefinition = "varchar(1) COMMENT '纳入忠诚度/积分计划' ")
    private String ispion;

    @Column(columnDefinition = "varchar(1) COMMENT '是否授信' ")
    private String iscred;

    @Column(columnDefinition = "varchar(1) COMMENT '产品关联日历类型' ")
    private String caldtp;

    @Column(columnDefinition = "varchar(20) COMMENT '生效日期' ")
    private String efctdt;

    @Column(columnDefinition = "varchar(20) COMMENT '失效日期' ")
    private String inefdt;

    @Column(columnDefinition = "varchar(20) COMMENT '产品建立日期' ")
    private String creadt;

    @Column(columnDefinition = "varchar(32) COMMENT '产品建立柜员' ")
    private String creaus;

    @Column(columnDefinition = "varchar(1) COMMENT '产品状态' ")
    private String prodst;
}
