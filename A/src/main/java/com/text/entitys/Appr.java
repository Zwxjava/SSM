package com.text.entitys;

import java.math.BigDecimal;

public class Appr {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String title;

    /**
     * 自定义服务类型
     */
    private String customServiceType;

    /**
     * 大事件的感恩中使用，
     */
    private Integer serviceType;

    /**
     * 大事件的感恩中使用，单位：分钟
     */
    private Integer serviceTime;

    /**
     * 
     */
    private Long bigeventId;

    /**
     * 时间统一为UTC标准
     */
    private Long occurAt;

    /**
     * 
     */
    private String content;

    /**
     * 
     */
    private String address;

    /**
     * 
     */
    private BigDecimal longitude;

    /**
     * 
     */
    private BigDecimal latitude;

    /**
     * 
     */
    private Integer countryId;

    /**
     * 
     */
    private Integer provinceId;

    /**
     * 
     */
    private Integer cityId;

    /**
     * 1-个人感恩（默认），2-组织感恩，3-对内置公众人物感恩
     */
    private Short type;

    /**
     * 1-1对1（默认）,2-1对多
     */
    private Short personType;

    /**
     * 确认完成后的施助方用户ID列表，使用“:"分隔
     */
    private String helpers;

    /**
     * 确认完成后的受助方用户ID列表，使用“:"分隔
     */
    private String helpees;

    /**
     * 国家编码，中国是cn，美国是us
     */
    private String countryCode;

    /**
     * 感恩编号，yyMMddHHmmss+8位随机码
     */
    private String sn;

    /**
     * 0-不显示（默认），1-显示
     */
    private Short showed;

    /**
     * 0-不公开，1-公开（默认）
     */
    private Short opened;

    /**
     * 0-未完成(默认)，1-完成
     */
    private Short finished;

    /**
     * 0-未删除（默认），1-已删除
     */
    private Short deleted;

    /**
     * 0-无举报（默认），1-有举报
     */
    private Short reported;

    /**
     * 0-失信（举报成功），1-正常（默认）
     */
    private Short credited;

    /**
     * 所有人都确认后的结果，1-未知，2-同意，3-拒绝
     */
    private Short pubresult;

    /**
     * 
     */
    private Long createBy;

    /**
     * 
     */
    private Long createAt;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * @return title 
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title 
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 自定义服务类型
     * @return custom_service_type 自定义服务类型
     */
    public String getCustomServiceType() {
        return customServiceType;
    }

    /**
     * 自定义服务类型
     * @param customServiceType 自定义服务类型
     */
    public void setCustomServiceType(String customServiceType) {
        this.customServiceType = customServiceType == null ? null : customServiceType.trim();
    }

    /**
     * 大事件的感恩中使用，
     * @return service_type 大事件的感恩中使用，
     */
    public Integer getServiceType() {
        return serviceType;
    }

    /**
     * 大事件的感恩中使用，
     * @param serviceType 大事件的感恩中使用，
     */
    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * 大事件的感恩中使用，单位：分钟
     * @return service_time 大事件的感恩中使用，单位：分钟
     */
    public Integer getServiceTime() {
        return serviceTime;
    }

    /**
     * 大事件的感恩中使用，单位：分钟
     * @param serviceTime 大事件的感恩中使用，单位：分钟
     */
    public void setServiceTime(Integer serviceTime) {
        this.serviceTime = serviceTime;
    }

    /**
     * 
     * @return bigevent_id 
     */
    public Long getBigeventId() {
        return bigeventId;
    }

    /**
     * 
     * @param bigeventId 
     */
    public void setBigeventId(Long bigeventId) {
        this.bigeventId = bigeventId;
    }

    /**
     * 时间统一为UTC标准
     * @return occur_at 时间统一为UTC标准
     */
    public Long getOccurAt() {
        return occurAt;
    }

    /**
     * 时间统一为UTC标准
     * @param occurAt 时间统一为UTC标准
     */
    public void setOccurAt(Long occurAt) {
        this.occurAt = occurAt;
    }

    /**
     * 
     * @return content 
     */
    public String getContent() {
        return content;
    }

    /**
     * 
     * @param content 
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 
     * @return address 
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address 
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 
     * @return longitude 
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude 
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * 
     * @return latitude 
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude 
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * @return country_id 
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * 
     * @param countryId 
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * 
     * @return province_id 
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * 
     * @param provinceId 
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * 
     * @return city_id 
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * 
     * @param cityId 
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * 1-个人感恩（默认），2-组织感恩，3-对内置公众人物感恩
     * @return type 1-个人感恩（默认），2-组织感恩，3-对内置公众人物感恩
     */
    public Short getType() {
        return type;
    }

    /**
     * 1-个人感恩（默认），2-组织感恩，3-对内置公众人物感恩
     * @param type 1-个人感恩（默认），2-组织感恩，3-对内置公众人物感恩
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * 1-1对1（默认）,2-1对多
     * @return person_type 1-1对1（默认）,2-1对多
     */
    public Short getPersonType() {
        return personType;
    }

    /**
     * 1-1对1（默认）,2-1对多
     * @param personType 1-1对1（默认）,2-1对多
     */
    public void setPersonType(Short personType) {
        this.personType = personType;
    }

    /**
     * 确认完成后的施助方用户ID列表，使用“:"分隔
     * @return helpers 确认完成后的施助方用户ID列表，使用“:"分隔
     */
    public String getHelpers() {
        return helpers;
    }

    /**
     * 确认完成后的施助方用户ID列表，使用“:"分隔
     * @param helpers 确认完成后的施助方用户ID列表，使用“:"分隔
     */
    public void setHelpers(String helpers) {
        this.helpers = helpers == null ? null : helpers.trim();
    }

    /**
     * 确认完成后的受助方用户ID列表，使用“:"分隔
     * @return helpees 确认完成后的受助方用户ID列表，使用“:"分隔
     */
    public String getHelpees() {
        return helpees;
    }

    /**
     * 确认完成后的受助方用户ID列表，使用“:"分隔
     * @param helpees 确认完成后的受助方用户ID列表，使用“:"分隔
     */
    public void setHelpees(String helpees) {
        this.helpees = helpees == null ? null : helpees.trim();
    }

    /**
     * 国家编码，中国是cn，美国是us
     * @return country_code 国家编码，中国是cn，美国是us
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 国家编码，中国是cn，美国是us
     * @param countryCode 国家编码，中国是cn，美国是us
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    /**
     * 感恩编号，yyMMddHHmmss+8位随机码
     * @return sn 感恩编号，yyMMddHHmmss+8位随机码
     */
    public String getSn() {
        return sn;
    }

    /**
     * 感恩编号，yyMMddHHmmss+8位随机码
     * @param sn 感恩编号，yyMMddHHmmss+8位随机码
     */
    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    /**
     * 0-不显示（默认），1-显示
     * @return showed 0-不显示（默认），1-显示
     */
    public Short getShowed() {
        return showed;
    }

    /**
     * 0-不显示（默认），1-显示
     * @param showed 0-不显示（默认），1-显示
     */
    public void setShowed(Short showed) {
        this.showed = showed;
    }

    /**
     * 0-不公开，1-公开（默认）
     * @return opened 0-不公开，1-公开（默认）
     */
    public Short getOpened() {
        return opened;
    }

    /**
     * 0-不公开，1-公开（默认）
     * @param opened 0-不公开，1-公开（默认）
     */
    public void setOpened(Short opened) {
        this.opened = opened;
    }

    /**
     * 0-未完成(默认)，1-完成
     * @return finished 0-未完成(默认)，1-完成
     */
    public Short getFinished() {
        return finished;
    }

    /**
     * 0-未完成(默认)，1-完成
     * @param finished 0-未完成(默认)，1-完成
     */
    public void setFinished(Short finished) {
        this.finished = finished;
    }

    /**
     * 0-未删除（默认），1-已删除
     * @return deleted 0-未删除（默认），1-已删除
     */
    public Short getDeleted() {
        return deleted;
    }

    /**
     * 0-未删除（默认），1-已删除
     * @param deleted 0-未删除（默认），1-已删除
     */
    public void setDeleted(Short deleted) {
        this.deleted = deleted;
    }

    /**
     * 0-无举报（默认），1-有举报
     * @return reported 0-无举报（默认），1-有举报
     */
    public Short getReported() {
        return reported;
    }

    /**
     * 0-无举报（默认），1-有举报
     * @param reported 0-无举报（默认），1-有举报
     */
    public void setReported(Short reported) {
        this.reported = reported;
    }

    /**
     * 0-失信（举报成功），1-正常（默认）
     * @return credited 0-失信（举报成功），1-正常（默认）
     */
    public Short getCredited() {
        return credited;
    }

    /**
     * 0-失信（举报成功），1-正常（默认）
     * @param credited 0-失信（举报成功），1-正常（默认）
     */
    public void setCredited(Short credited) {
        this.credited = credited;
    }

    /**
     * 所有人都确认后的结果，1-未知，2-同意，3-拒绝
     * @return pubresult 所有人都确认后的结果，1-未知，2-同意，3-拒绝
     */
    public Short getPubresult() {
        return pubresult;
    }

    /**
     * 所有人都确认后的结果，1-未知，2-同意，3-拒绝
     * @param pubresult 所有人都确认后的结果，1-未知，2-同意，3-拒绝
     */
    public void setPubresult(Short pubresult) {
        this.pubresult = pubresult;
    }

    /**
     * 
     * @return create_by 
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * 
     * @param createBy 
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * 
     * @return create_at 
     */
    public Long getCreateAt() {
        return createAt;
    }

    /**
     * 
     * @param createAt 
     */
    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }
}