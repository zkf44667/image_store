package com.bailue.weight.business.base.model;

import com.baomidou.mybatisplus.annotations.TableName;
import com.bailue.weight.business.base.BaseModel;
import com.baomidou.mybatisplus.annotations.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 功能参数实体
 * @author system
 * @version V1.0.0 2022-01-22
 * @since V100R001
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_base_config")
@ApiModel(value = "功能参数")
public class ConfigModel extends BaseModel
{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "参数名称")
    @TableField("ConfigName")
    private String configName;

    @ApiModelProperty(value = "参数键名")
    @TableField("ConfigKey")
    private String configKey;

    @ApiModelProperty(value = "参数键值")
    @TableField("ConfigValue")
    private String configValue;

    public static final String COLUMN_CONFIGNAME = "configName";

    public static final String COLUMN_CONFIGKEY = "configKey";

    public static final String COLUMN_CONFIGVALUE = "configValue";

}
