package com.atguigu.gmall0715.service;

import com.atguigu.gmall0715.bean.*;

import java.util.List;

public interface ManageService {

    /**
     * 一级分类查询
     * @return
     */
    List<BaseCatalog1> getCatalog1();

    List<BaseCatalog2> getCatalog2(BaseCatalog2 baseCatalog2);

    List<BaseCatalog3> getCatalog3(BaseCatalog3 baseCatalog3);

    List<BaseAttrInfo> getAttrInfoList(BaseAttrInfo baseAttrInfo);

    void saveAttrInfo(BaseAttrInfo baseAttrInfo);

    List<BaseAttrValue> getAttrValueList(String attrId);

    BaseAttrInfo getBaseAttrInfo(String attrId);

    List<SpuInfo> getSpuInfoList(String catalog3Id);

    List<BaseSaleAttr> getBaseSaleAttrList();

    void saveSpuInfo(SpuInfo spuInfo);

    List<SpuImage> getSpuImageList(SpuImage spuImage);

    List<BaseAttrInfo> getAttrInfoList(String catalog3Id);

    List<SpuSaleAttr> getSpuSaleAttrList(String spuId);

    void saveSkuInfo(SkuInfo skuInfo);
}
