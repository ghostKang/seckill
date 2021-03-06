package org.seckill.entity;

import java.util.Date;

/**
 * Created by 浴缸 on 2017/12/26.
 */
public class SuccessKilled {

    private long seckillId;

    private long userPhone;// 手机号

    private Date createTime;// 秒杀时间

    private short state;// 秒杀状态：0无效，1成功

    // 多对一
    private Seckill seckill;

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "seckillId=" + seckillId +
                ", userPhone=" + userPhone +
                ", createTime=" + createTime +
                ", state=" + state +
                ", seckill=" + seckill +
                '}';
    }
}
