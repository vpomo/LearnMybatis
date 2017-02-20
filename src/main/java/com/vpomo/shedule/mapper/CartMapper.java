package com.vpomo.shedule.mapper;

import java.util.List;

import com.vpomo.shedule.model.Cart;


public interface CartMapper {
	
	List<Cart> queryBuyCart(Cart cart);
	
	List<Cart> queryCartByStoreId(String memberId, String StoreId);
	
	int saveCart(Cart cart);
	
	void updateCart(Cart cart);
	
	void deleteCart(String cartId);
	
	void deleteByMGS(String memberId, String goodsId, String specId);
	void updateCartNum(Cart cart);
	Cart queryCartById(String cartId);
	
	List<Cart> queryByCartIds(Cart cart);
	
	Integer queryCountByMemberId(String memberId);
	
	void deleteAllCartByMemberId(String memberId);

	void saveCarts(List<Cart> carts);
    
}
