package com.vpomo.shedule.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
// default package

/**
 * 购物车
 * ShopCart entity. @author MyEclipse Persistence Tools
 */
@Data
@ToString
public class Cart extends BaseEntity implements Serializable {

	// Fields
	
	/**
	 * 购物车id
	 */
	private String cartId;
	
	/**
	 * 会员id
	 */
	private String memberId;
	
	/**
	 * 店铺id
	 */
	private String storeId;
	
	/**
	 * 店铺名称
	 */
	private String storeName;
	
	/**
	 * 商品id
	 */
	private String goodsId;
	
	/**
	 * 商品名称
	 */
	private String goodsName;
	
	/**
	 * 商品价格
	 */
	private Double goodsPrice;
	
	/**
	 * 购买商品数量
	 */
	private Short goodsNum;
	
	/**
	 * 商品图片
	 */
	private String goodsImages;

	private String cartIds;

	/**
	 * 商品的时实库存
	 */
	private Integer goodsNowStorage;
	
	/**
	 * 商品规格id
	 */
	private String specId;

	/**
	 * 商品规格内容
	 */
	private String specInfo;
	
	/**
	 * 商品所在一级分类的id
	 */
	private String firstGcId;

	/**
	 * 商品所在一级分类的id
	 */
	private Integer goodsState;

	/**
	 * 分类id
	 */
	private String gcId;

	/**
	 * 品牌id
	 */
	private String brandId;

	/**
	 * 类型id
	 */
	private  String typeId;

	/**
	 * 优惠类型
	 */
	private Integer promotionType;

	/**
	 * 最大购买数量
	 */
	private Integer maxBuyNum;

}