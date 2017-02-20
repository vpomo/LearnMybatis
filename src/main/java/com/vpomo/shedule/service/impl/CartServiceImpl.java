package com.vpomo.shedule.service.impl;

import com.vpomo.shedule.model.Cart;
import com.vpomo.shedule.repository.CartDao;
import com.vpomo.shedule.service.CartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class CartServiceImpl implements CartService {

    @Resource
    private CartDao cartDao;

    public List<Cart> queryBuyCart(String memberId) {
        Cart cart = new Cart();
        cart.setMemberId(memberId);
        cart.setGoodsState(0);
        List<Cart> list = cartDao.queryBuyCart(cart);
        return list;
    }

    /**
     * 保存购物车
     *
     * @param goodsId    商品id
     * @param memberId   用户id
     * @param count      商品数量
     * @param goodSpecId 商品规格id
     * @param saveType   加入类型(加入购物车:0/立即购买:1)
     * @return
     */
    public String saveCart(String goodsId, String memberId, Integer count, String goodSpecId, Integer saveType) {
        Cart cart = new Cart();
        String result = "";
            String specInfo = "";
            cart.setSpecInfo(specInfo);

            try {
                List<Cart> list = cartDao.queryBuyCart(cart);
                if (list != null && list.size() > 0) {//如果有数据  就更新 否则就添加
                    for (Cart carts : list) {
                        cart.setCartId(carts.getCartId());
                        cartDao.updateCart(cart);
                    }
                } else {
                    cartDao.saveCart(cart);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        return result;
    }


    /**
     * 删除购物车
     *
     * @param cartId 购物车id
     * @return
     */
    @Override
    public int deleteCart(String cartId) {
        System.out.println("Мы в сервисе ...");

        int result = 0;
        try {
            cartDao.deleteCart(cartId);
            result = 1;
        } catch (Exception e) {
        }
        return result;
    }

    /**
     * 根据用户id,商品id,商品规格id删除购物车
     *
     * @param memberId 用户id
     * @param goodsId  商品id
     * @param specId   规格id
     */
    @Override
    public void deleteByMGS(String memberId, String goodsId, String specId) {
        cartDao.deleteByMGS(memberId, goodsId, specId);
    }


    /**
     * 修改购物车数量
     *
     * @param cartId 购物车id
     * @param count  商品数量
     * @return 返回int类型, 1为成功, 0为失败
     */
    @Override
    public int updatecart(String cartId, Integer count) {
        int result = 0;
        try {
            Cart cart = cartDao.queryCartById(cartId);
            if (cart != null) {
                Integer maxBuyNum = 100;
                if (cart.getPromotionType() != null) {
                    maxBuyNum = cart.getMaxBuyNum();
                }
                if (count > maxBuyNum) {
                    return maxBuyNum;
                }
                cart.setGoodsNum(count.shortValue());
                cart.setCartId(cartId);

                cartDao.updateCartNum(cart);
                result = 1;
            }
        } catch (Exception e) {
        }
        return result;
    }


    @Override
    public List<Cart> queryCartByIds(String cartIds, String memberId, String storeId) {

        cartIds = "'" + cartIds.replaceAll(",", "','") + "'";
        Cart cart = new Cart();
        cart.setCartIds(cartIds);
        cart.setMemberId(memberId);
        cart.setStoreId(storeId);
        List<Cart> list = cartDao.queryByCartIds(cart);
        return list;
    }

    public Cart queryCartById(String cartId) {
        System.out.println("Мы в сервисе ...");
        return cartDao.queryCartById(cartId);
    }

    /**
     * 根据用户id和店铺id查询购物车
     *
     * @param memberId
     * @param StoreId
     * @return
     */
    @Override
    public List<Cart> queryCartByStoreId(String memberId, String StoreId) {

        return cartDao.queryCartByStoreId(memberId, StoreId);
    }


    public void deleteAllCartByMemberId(String memberId) {
        cartDao.deleteAllCartByMemberId(memberId);
    }

    /**
     * 查询用户购物车数量
     *
     * @param memberId
     * @return
     */
    public Integer queryCountByMemberId(String memberId) {
        return cartDao.queryCountByMemberId(memberId);
    }


    /**
     * 批量保存购物车
     *
     * @param carts
     */
    @Override
    public void saveCarts(List<Cart> carts) {
        cartDao.saveCarts(carts);
    }

}
