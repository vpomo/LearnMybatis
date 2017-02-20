package com.vpomo.shedule.repository.impl;

import com.vpomo.shedule.repository.CartDao;
import com.vpomo.shedule.mapper.CartMapper;
import com.vpomo.shedule.model.Cart;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;


/**
 *    
 * 项目名称：leimingtech-front  
 * 
 *      
 * 类名称：CartDaoImpl   
 * 类描述：   
 * 创建人：liuhao   
 * 创建时间：2014年12月24日 下午10:29:06   
 * 修改人：liuhao   
 * 修改时间：2014年12月24日 下午10:29:06   
 * 修改备注：   
 * @version    
 *
 */
@Repository
public class CartDaoImpl implements CartDao {
    @Resource
    private CartMapper cartMapper;

    /**
	 * 通过用户id查询购物车,同时可以传入商品的id和规格id查询存在相同商品
	 * @param cart
	 * @return
	 */
	public List<Cart> queryBuyCart(Cart cart){
		List<Cart> cartList=cartMapper.queryBuyCart(cart);
		return  cartList;
	}
	
	/**
	 * 保存购物车
	 * @param cart
	 * @return
	 */
	public int saveCart(Cart cart){
		return cartMapper.saveCart(cart);
	}
	
	/**
	 * 修改购物车
	 * @param cart
	 */
	public void updateCart(Cart cart){
		cartMapper.updateCart(cart);
	}
	
	/**
	 * 删除购物车
	 * @param cartId
	 */
	public void deleteCart(String cartId){
		System.out.println("Мы в репозитории ...");

		cartMapper.deleteCart(cartId);
	}
	
	/**
	 * 修改购物车数量
	 * @param cart
	 */
	public void updateCartNum(Cart cart){
		cartMapper.updateCartNum(cart);
	}
	
	/**
	 * 购物车下单  根据cartid 查询商品
	 * @Title: queryCartById 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param cart
	 * @param @return    设定文件 
	 * @return List<Cart>    返回类型 
	 * @throws
	 */
	public Cart queryCartById(String cartId){
		System.out.println("Мы в репозитории ...");

		Cart cart =	cartMapper.queryCartById(cartId);
		//PromotionUtils.process(cart);
		return cart;
	}
	
	/**
	 * 根据用户id,商品id,商品规格id删除购物车
	 * @param memberId 用户id
	 * @param goodsId 商品id 
	 * @param specId 规格id
	 */
	@Override
	public void deleteByMGS(String memberId, String goodsId, String specId) {
		cartMapper.deleteByMGS(memberId, goodsId, specId);
	}

	/**
	 * 购物车下单  根据用户id和cartids(可多条,用","隔开) 查询商品 根据店铺id,和商品一级分类id排序
	 * @param cart
	 * @return
	 */
	public List<Cart> queryByCartIds(Cart cart){
		List<Cart> cartList=cartMapper.queryByCartIds(cart);
		//PromotionUtils.process(cartList);
		return  cartList;
	}
	
	/**
	 * 根据用户id和店铺id查询购物车
	 * @param memberId
	 * @param StoreId
	 * @return
	 */
	@Override
	public List<Cart> queryCartByStoreId(String memberId, String StoreId) {
		List<Cart> cartList=cartMapper.queryCartByStoreId(memberId, StoreId);
		//PromotionUtils.process(cartList);
		return  cartList;
	}
	
	/**
	 * 清空购物车
	 * @param memberId 用户id
	 */
	public void deleteAllCartByMemberId(String memberId){
		cartMapper.deleteAllCartByMemberId(memberId);
	}
	
	/**
	 * 查询用户购物车数量
	 * @param memberId
	 * @return
	 */
	public Integer queryCountByMemberId(String memberId){
		return cartMapper.queryCountByMemberId(memberId);
	}

	/**
	 * 批量保存购物车
	 * @param carts
     */
	@Override
	public void saveCarts(List<Cart> carts) {
		cartMapper.saveCarts(carts);
	}
}
