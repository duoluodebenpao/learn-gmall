package org.frank.learn.gmall.api.service;



import org.frank.learn.gmall.api.bean.PmsProductImage;
import org.frank.learn.gmall.api.bean.PmsProductInfo;
import org.frank.learn.gmall.api.bean.PmsProductSaleAttr;

import java.util.List;

public interface SpuService {
    List<PmsProductInfo> spuList(String catalog3Id);

    void saveSpuInfo(PmsProductInfo pmsProductInfo);

    List<PmsProductSaleAttr> spuSaleAttrList(String spuId);

    List<PmsProductImage> spuImageList(String spuId);

    List<PmsProductSaleAttr> spuSaleAttrListCheckBySku(String productId,String skuId);
}
