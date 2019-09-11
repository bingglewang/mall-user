package com.zsl.malluserapi.util;

import com.zsl.malluserdb.po.GoodsSku;

public class PointUtil {
    /**
     * 税收
     */
    private static final Float REVENUE = 0.06f;
    /**
     * 运营中心(加盟商)成本
     */
    private static final Float COST = 0.005f;
    /**
     * 公司内部提成
     */
    private static final Float ROYALTY = 0.03f;
    /**
     * 推荐人成本
     */
    private static final Float REFERRER_PRICE = 0.01f;
    /**
     * 消费者--用户获取积分比例--在矿机中产出
     */
    private static final Float CONSUMER_RATIO = 10000 * 0.4f;
    /**
     * 1级推荐人--用户获取积分比例--在矿机中产出
     */
    private static final Float REFERRER_ONE_RATIO = 10000 * 0.1f;
    /**
     * 2级推荐人--用户获取积分比例--在矿机中产出
     */
    private static final Float REFERRER_TWO_RATIO = 10000 * 0.15f;

    /**
     * 可分配利润比例
     * @return
     */
    public static Integer sum(GoodsSku goodsSku) {
        //成本价
        Float cost = goodsSku.getCost().floatValue();
        //售价
        Float price = goodsSku.getPrice().floatValue();
        //可分配利润比例
        Float sum = price - cost - price * (REVENUE + COST + ROYALTY + REFERRER_PRICE);
        return new Float(sum * CONSUMER_RATIO).intValue();
    }
/*    public static  void main(String args[]){
        //成本价
        Float cost = 70f;
        //售价
        Float price = 89f;
        //可分配利润比例
        Float sum = price - cost - price * (REVENUE + COST + ROYALTY + REFERRER_PRICE);
        System.out.println("赠送积分："+new Float(sum * CONSUMER_RATIO).intValue());
    }*/
}
