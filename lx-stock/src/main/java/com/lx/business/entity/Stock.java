package com.lx.business.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 销售库存表
 * </p>
 *
 * @author luxing
 * @since 2021-05-23
 */
@Data
@Accessors(chain = true)
@TableName("t_xs_stock")
public class Stock  {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId("stock_id")
    private String stockId;

    /**
     * 区域ID
     */
    private String saleAreaId;

    /**
     * 区域Name
     */
    private String saleAreaName;

    /**
     * 仓库ID
     */
    private String warehouseId;

    /**
     * 仓库名称
     */
    private String warehouseName;

    /**
     * 库房ID
     */
    private String stockRoomId;

    /**
     * 库房名称
     */
    private String stockRoomName;

    /**
     * 库区id
     */
    private String stockZoneId;

    /**
     * 库区名称
     */
    private String stockZoneName;

    /**
     * 物料代码
     */
    private String skuCode;

    /**
     * 物料代码主键
     */
    private String skuId;

    /**
     * 资源粒度管理
     */
    private String resourceManagement;

    /**
     * 品类ID
     */
    private String productClassId;

    /**
     * 品类名称
     */
    private String productClassName;

    /**
     * 品名ID
     */
    private String productBrandId;

    /**
     * 品名名称
     */
    private String productBrandName;

    /**
     * 材质ID
     */
    private String productTextureId;

    /**
     * 材质名称
     */
    private String productTextureName;

    /**
     * 产地ID
     */
    private String prodAreaId;

    /**
     * 产地
     */
    private String prodAreaName;

    /**
     * 规格
     */
    private String specification;

    /**
     * 规格一(型钢的高/卷板的厚/管材的外径)
     */
    private BigDecimal specification1;

    /**
     * 规格二(型钢的宽/卷板的宽/管材的壁厚)
     */
    private BigDecimal specification2;

    /**
     * 扩展一(型钢的高壁厚)
     */
    private BigDecimal expand1;

    /**
     * 扩展二(型钢的宽壁厚)
     */
    private BigDecimal expand2;

    /**
     * 长度
     */
    private BigDecimal length;

    /**
     * 16标米重
     */
    private BigDecimal meterWeight;

    /**
     * 计量方式
     */
    private String quantityType;

    /**
     * 件支数
     */
    private Integer pieces;

    /**
     * 公差
     */
    private BigDecimal tolerance;

    /**
     * 公差范围
     */
    private String toleranceRange;

    /**
     * 重量范围
     */
    private String weightRange;

    /**
     * 10标米重
     */
    private BigDecimal tenMeterWeight;

    /**
     * 厂发米重
     */
    private BigDecimal supplyMeterWeight;

    /**
     * 是否销售锁定
     */
    private Boolean saleLockFlag;

    /**
     * 可用数量
     */
    private Integer avbleAmount;

    /**
     * 可用理重
     */
    private BigDecimal avbleManagerWeight;

    /**
     * 可用磅重
     */
    private BigDecimal avblePoundWeight;

    /**
     * 库存数量
     */
    private Integer stockAmount;

    /**
     * 库存磅计重量
     */
    private BigDecimal stockPoundWeight;

    /**
     * 库存理计重量
     */
    private BigDecimal stockManagerWeight;

    /**
     * 总锁定数量
     */
    private Integer lockAmount;

    /**
     * 总锁定磅重
     */
    private BigDecimal lockPoundWeight;

    /**
     * 总锁定理重
     */
    private BigDecimal lockManagerWeight;

    /**
     * 合同锁定数量
     */
    private Integer contractAmount;

    /**
     * 合同锁定磅重
     */
    private BigDecimal contractPoundWeight;

    /**
     * 合同锁定理重
     */
    private BigDecimal contractManagerWeight;

    /**
     * 发货计划锁定数量
     */
    private Integer planAmount;

    /**
     * 发货计划锁定磅重
     */
    private BigDecimal planPoundWeight;

    /**
     * 发货计划锁定理重
     */
    private BigDecimal planManagerWeight;

    /**
     * 提货单锁定数量
     */
    private Integer ladingAmount;

    /**
     * 提货单锁定磅重
     */
    private BigDecimal ladingPoundWeight;

    /**
     * 提货单锁定理重
     */
    private BigDecimal ladingManagerWeight;

    /**
     * 加工锁定数量
     */
    private Integer processAmount;

    /**
     * 加工锁定磅重
     */
    private BigDecimal processPoundWeight;

    /**
     * 加工锁定理重
     */
    private BigDecimal processManagerWeight;

    /**
     * 人工锁定数量
     */
    private Integer manualAmount;

    /**
     * 人工锁定磅重
     */
    private BigDecimal manualPoundWeight;

    /**
     * 人工锁定理重
     */
    private BigDecimal manualManagerWeight;

    /**
     * 加权平均理计费用
     */
    private BigDecimal averageManagerCost;

    /**
     * 加权平均磅计费用
     */
    private BigDecimal averagePoundCost;

    /**
     * 加权平均磅计采购价格
     */
    private BigDecimal averagePoundPrice;

    /**
     * 加权平均理计采购价格
     */
    private BigDecimal averageManagerPrice;

    /**
     * 磅计定价
     */
    private BigDecimal pricePound;

    /**
     * 理计定价
     */
    private BigDecimal priceManager;

    /**
     * 磅计可让价
     */
    private BigDecimal priceDiscountPound;

    /**
     * 理计可让价
     */
    private BigDecimal priceDiscountManager;

    /**
     * 定价版本
     */
    private String versionPrice;

    /**
     * 库房属性(普通库，质量库)
     */
    private String stockRoomType;

    /**
     * 工作组
     */
    private String workgroupId;

    /**
     * 工作组Name
     */
    private String workgroupName;

    /**
     * 删除标志
     */
    private Boolean delFlag;

    /**
     * 创建人
     */
    private String createUserCode;

    /**
     * 创建人名称
     */
    private String createUserName;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 修改人
     */
    private String updateUserCode;

    /**
     * 修改人名称
     */
    private String updateUserName;

    /**
     * 修改时间
     */
    private LocalDateTime updateDate;

    /**
     * 系统ID
     */
    private String sysId;

    /**
     * 平台ID
     */
    private String platformId;

    /**
     * 机构ID
     */
    private String orgId;

    /**
     * 机构名称
     */
    private String orgName;

    /**
     * 机构简称
     */
    private String orgShortName;

    /**
     * 货主id
     */
    private String ownerId;

    /**
     * 货主code对应单元档案的unitId
     */
    private String ownerCode;

    /**
     * 货主名称
     */
    private String ownerName;

    /**
     * 需求数量
     */
    private Integer demandAmount;

    /**
     * 需求理重
     */
    private BigDecimal demandManagerWeight;

    /**
     * 需求磅重
     */
    private BigDecimal demandPoundWeight;

    /**
     * 移库锁定数量
     */
    private Integer moveAmount;

    /**
     * 移库锁定理重
     */
    private BigDecimal moveManagerWeight;

    /**
     * 移库锁定磅重
     */
    private BigDecimal movePoundWeight;

    /**
     * 版本号，并发控制，默认为0
     */
    private Integer version;

    /**
     * 销售退货数量
     */
    private Integer saleReturnAmount;

    /**
     * 销售退货理重
     */
    private BigDecimal saleReturnManagerWeight;

    /**
     * 销售退货磅重
     */
    private BigDecimal saleReturnPoundWeight;

    /**
     * 采购退货数量
     */
    private Integer purchaseReturnAmount;

    /**
     * 采购退货理重
     */
    private BigDecimal purchaseReturnManagerWeight;

    /**
     * 采购退货磅重
     */
    private BigDecimal purchaseReturnPoundWeight;


}
