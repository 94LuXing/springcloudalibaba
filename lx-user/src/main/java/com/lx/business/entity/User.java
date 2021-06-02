package com.lx.business.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author luxing
 * @since 2021-05-23
 */
@Data
@Accessors(chain = true)
@TableName("t_cr_user")
public class User  {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId("user_id")
    private String userId;

    /**
     * 用户编码
     */
    private String userCode;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 真实名称
     */
    private String realName;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * QQ号码
     */
    private String qq;

    /**
     * 微信号码
     */
    private String wechat;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 启用状态，1启用，0禁用
     */
    private Boolean enableFlag;

    /**
     * 最后登录时间
     */
    private LocalDateTime lastLoginDate;

    /**
     * 注册时间
     */
    private LocalDateTime registerDate;

    /**
     * 区分哪端注册的用户(01PC，02小程序，03APP，04公众号)
     */
    private String registerType;

    /**
     * 审核状态（01待提交02待审核03审核通过04审核驳回）
     */
    private String auditStatus;

    /**
     * 删除标记
     */
    private Boolean delFlag;

    /**
     * 平台ID
     */
    private String platformId;

    /**
     * 创建人代码
     */
    private String createUserCode;

    /**
     * 创建人名称
     */
    private String createUserName;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改人代码
     */
    private String updateUserCode;

    /**
     * 修改人名称
     */
    private String updateUserName;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 登录次数
     */
    private Integer loginNum;

    /**
     * 登录错误次数
     */
    private Integer loginErrorNum;


}
