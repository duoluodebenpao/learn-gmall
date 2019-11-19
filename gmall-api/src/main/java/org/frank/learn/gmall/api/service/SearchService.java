package org.frank.learn.gmall.api.service;

import org.frank.learn.gmall.api.bean.PmsSearchParam;
import org.frank.learn.gmall.api.bean.PmsSearchSkuInfo;

import java.util.List;

public interface SearchService {
    List<PmsSearchSkuInfo> list(PmsSearchParam pmsSearchParam);
}
