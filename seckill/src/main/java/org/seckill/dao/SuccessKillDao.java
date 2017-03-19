package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

/**
 * Created by Administrator on 2017/3/10.
 */
public interface SuccessKillDao {
    /**
     * 插入购买明细，可过滤重复
     * @param seckillId
     * @param userphone
     * @return
     */
    int insertSuccessKilled(@Param("seckillId")long seckillId,@Param("userphone") long userphone);

    /**
     * 根据Id查询successkilled 并携带秒杀产品对象实体
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId")long seckillId,@Param("userphone") long userphone);
}
