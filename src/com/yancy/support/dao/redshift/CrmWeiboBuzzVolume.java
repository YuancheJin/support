package com.yancy.support.dao.redshift;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;
/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-3-24
 * Time: 上午10:11
 * 修改描述
 */
@Table("crm_weibo_buzz_volume")
public class CrmWeiboBuzzVolume {
    @Column
    private String keyword;
    @Column
    private Long timestamp;
    @Column("volumeDup")
    private Long volumeDup;
    @Column("volumeNoDup")
    private Long volumeNoDup;

    public CrmWeiboBuzzVolume() {
    }

    public CrmWeiboBuzzVolume(String keyword, Long timestamp, Long volumeDup, Long volumeNoDup) {
        this.keyword = keyword;
        this.timestamp = timestamp;
        this.volumeDup = volumeDup;
        this.volumeNoDup = volumeNoDup;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Long getVolumeDup() {
        return volumeDup;
    }

    public void setVolumeDup(Long volumeDup) {
        this.volumeDup = volumeDup;
    }

    public Long getVolumeNoDup() {
        return volumeNoDup;
    }

    public void setVolumeNoDup(Long volumeNoDup) {
        this.volumeNoDup = volumeNoDup;
    }
}
