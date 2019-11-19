package org.frank.learn.gmall.api.service;



import org.frank.learn.gmall.api.bean.PmsBaseAttrInfo;
import org.frank.learn.gmall.api.bean.PmsBaseAttrValue;
import org.frank.learn.gmall.api.bean.PmsBaseSaleAttr;

import java.util.List;
import java.util.Set;


public interface AttrService {

    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseAttrValue> getAttrValueList(String attrId);

    List<PmsBaseSaleAttr> baseSaleAttrList();

    List<PmsBaseAttrInfo> getAttrValueListByValueId(Set<String> valueIdSet);
}
