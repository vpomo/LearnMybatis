package com.vpomo.shedule.service;


import com.vpomo.shedule.model.Cart;

import java.util.List;
import java.util.Map;

/**
 * 
 */
public interface CartService {
	
	/**
	 * 通过用户id查询购物车
	 * @param memberId 用户id
	 * @return
	 */
	List<Cart> queryBuyCart(String memberId);
	
	/**
	 * 根据用户id和店铺id查询购物车
	 * @param memberId
	 * @param StoreId
	 * @return
	 */
	List<Cart> queryCartByStoreId(String memberId, String StoreId);
	
	String saveCart(String goodsId,String memberId,Integer count,String goodSpecId,Integer saveType);
	
	/**
	 * 删除购物车 
	 * @param cartId 购物车id
	 * @return
	 */
	int deleteCart(String cartId);
	
	/**
	 * 根据用户id,商品id,商品规格id删除购物车
	 * @param memberId 用户id
	 * @param goodsId 商品id 
	 * @param specId 规格id
	 */
	void deleteByMGS(String memberId, String goodsId, String specId);
	
	int updatecart(String cartId,Integer count);

	List<Cart> queryCartByIds(String cartIds,String memberId,String storeId);
	
	Cart queryCartById(String cartId);
	
	void deleteAllCartByMemberId(String memberId);
	
	Integer queryCountByMemberId(String memberId);
	
	void saveCarts(List<Cart> carts);

}
