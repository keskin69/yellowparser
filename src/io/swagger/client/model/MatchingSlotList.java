package io.swagger.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.StringUtil;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-16T13:57:18.496Z")
public class MatchingSlotList   {
  
  private PaginationInfo info = null;
  private List<MatchingSlot> data = new ArrayList<MatchingSlot>();

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(required = true, value = "[read-only]")
  @JsonProperty("info")
  public PaginationInfo getInfo() {
    return info;
  }
  public void setInfo(PaginationInfo info) {
    this.info = info;
  }

  
  /**
   * [read-only]
   **/
  @ApiModelProperty(value = "[read-only]")
  @JsonProperty("data")
  public List<MatchingSlot> getData() {
    return data;
  }
  public void setData(List<MatchingSlot> data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchingSlotList {\n");
    
    sb.append("    info: ").append(StringUtil.toIndentedString(info)).append("\n");
    sb.append("    data: ").append(StringUtil.toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
