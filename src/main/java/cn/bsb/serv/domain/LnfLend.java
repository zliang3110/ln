package cn.bsb.serv.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by zhangll on 2017/8/2.
 * 贷款产品放款属性表
 */
@Log4j2
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "lnf_lend")
public class LnfLend {
    @Id
    @Column(columnDefinition = "VARCHAR(10) COMMENT '产品代码' ")
    private String prodcd;

    @Column(columnDefinition = "VARCHAR(2) COMMENT '货币代号' ")
    private String crcycd;

    @Column(columnDefinition = "INTEGER UNSIGNED COMMENT '最大放款金额' ")
    private long maxlam;

    @Column(columnDefinition = "INTEGER UNSIGNED COMMENT '最小放款金额' ")
    private long minlam;

    @Column(columnDefinition = "VARCHAR(6) COMMENT '最长贷款期限' ")
    private String mxterm;

    @Column(columnDefinition = "VARCHAR(6) COMMENT '最短贷款期限' ")
    private String mnterm;

    @Column(columnDefinition = "INTEGER UNSIGNED COMMENT '最大放款次数' ")
    private long maxtms;

    @Column(columnDefinition = "INTEGER UNSIGNED COMMENT '每次最大金额' ")
    private long maxamt;

    @Column(columnDefinition = "INTEGER UNSIGNED COMMENT '每次最小金额' ")
    private long minamt;

    @Column(columnDefinition = "INTEGER UNSIGNED COMMENT '放款有效期限(天)' ")
    private long vadays;

    @Column(columnDefinition = "INTEGER UNSIGNED COMMENT '放款最小间隔' ")
    private long mninva;

    @Column(columnDefinition = "INTEGER UNSIGNED COMMENT '放款最大间隔' ")
    private long mxinva;

    @Column(columnDefinition = "VARCHAR(1) COMMENT '放款类型' ")
    private String lendmd;

    @Column(columnDefinition = "VARCHAR(1) COMMENT '自动放款标志' ")
    private String isauld;

    @Column(columnDefinition = "VARCHAR(1) COMMENT '自动放款借据管理模式' ")
    private String autotg;

    @Column(columnDefinition = "VARCHAR(1) COMMENT '周期性放款标志' ")
    private String isperi;

}
